# TheSpoonBot - Telegram Companion Bot
![GitHub](https://img.shields.io/github/license/jacopoesposito/TheSpoonBot?color=red&style=flat-square)
<p align="center">
<img src="https://github.com/jacopoesposito/TheSpoonBot/blob/master/static/logobot.jpg" width="200" height="200" style="border-radius: 50px"/>
</p>

<p align = "center">
  🍕 Telegram Companion Bot for The Spoon 🍕
  <br>
  A project for
  <br>
  Software Engineering 
  <br>
  courses of Computer Science at University of Salerno.
</p>

## Introduction 

"TheSpoonBot" is a telegram bot developed in Java Spring designed to be a companion of [TheSpoon](https://github.com/pascareddum/thespoon). It was created for the Software Engineering Exam project at the Univerisity of Salerno.

This companion bot allow users to be updated about the status of their order or reservation from their favorite restaurants, by smoothly receiving a message through one of the most popular messaging apps [Telegram](https://www.telegram.org)

Build with Java, TelegramBotAPI, and love :heart:

## The Spoon Ecosystem 

The Spoon consists of three main components: TheSpoon (Rest Server API), TheSpoonFrontend (SolidJS Frontend) and TheSpoonBot (Telegram Bot Server)

* [TheSpoonBot](https://github.com/jacopoesposito/TheSpoonBot)
* [TheSpoonFrontend](https://github.com/pascareddum/TheSpoonFrontend)
* [TheSpoonApiRestServer](https://github.com/pascareddum/TheSpoon)

## Requirements

* JDK 21 
* A Telegram bot created on Telegram and its API key/token.

## Installation

* First make a clone of the repository

```
$ git clone https://github.com/jacopoesposito/TheSpoonBot.git
```
### Set Up Environment Variables

1. Set the environment variable for the Telegram bot API key:

```
export TELEGRAMBOTAPI=your_telegram_bot_token
```

Replace your_telegram_bot_token with the actual token obtained from BotFather.
Note: On Windows, you can use the set command instead of export.

### Compile 

1. Move to the project's directory and run the command:

```
javac TheSpoonBot.java
```

If successful, this will generate a TheSpoonBot.class file.

### Run it

1. Run the Java program using the following command:

```
java TheSpoonBot
```

2. If everything is set up correctly, you should see the bot's username and token printed to the console, indicating that the bot is running and registered with Telegram.

### Intercat with TheSpoonBot on Telegram

1. Open the Telegram app and start a chat with your bot.

2. Use the following commands in the chat to interact with the bot:
    - /start: Start the bot and receive a welcome message.
    - /help: Display a list of available commands.
    - /getChatID: Get your chat ID to use in ordering and reservation phases.

* Have fun!

## Buid with 
* [Java](https://jdk.java.net/21/) - The programming language used for the companion bot development.
* [TelegramBotApi](https://core.telegram.org/bots/api) - The TelegramBotApi.
* **Love** :heart:

## Contributors

<a href="https://github.com/jacopoesposito/TheSpoonBot/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=jacopoesposito/TheSpoonBot" />
</a>

## License
[GNU/AGPL 3.0](https://choosealicense.com/licenses/agpl-3.0/)