package it.unisa.thespoonbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * @author Jacopo Gennaro Esposito
 * Classe che implementa il codice del bot Telegram di TheSpoon
 * */
public class TheSpoonBot extends TelegramLongPollingBot {

    /** Setto la apiKey del bot telegram*/
    String telegramAPIKey = System.getenv("TELEGRAMBOTAPI");

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            String command = message.getText();

            switch (command) {
                case "/start":
                    sendTextMessage(message.getChatId(), "Ciao! Sono il tuo bot. Digita /help per ottenere aiuto.");
                    break;
                case "/help":
                    sendTextMessage(message.getChatId(), "Ecco la lista dei comandi disponibili:\n/start - Avvia il bot\n/help - Mostra l'elenco dei comandi\n/getChatID - Otti" +
                            "eni il tuo chatID da usare nelle fasi di ordinazione e prenotazione");
                    break;
                case "/getChatID":
                    sendTextMessage(message.getChatId(), "Ecco il tuo chat ID, inseriscilo dove richiesto: " + message.getChatId());
                    break;
            }
        }
    }

    private void sendTextMessage(Long chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "TheSpoonBot";
    }

    @Override
    public String getBotToken() {
        return telegramAPIKey;
    }

    public static void main(String[] args) {
        try{
            TheSpoonBot myBot = new TheSpoonBot();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            System.out.println(myBot.getBotUsername() + myBot.getBotToken());
            telegramBotsApi.registerBot(myBot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
