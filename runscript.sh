#!/bin/sh

gradle build
#gradle --console plain run
gradle jar

mv build/libs/TicTacToe.jar TicTacToe.jar
java -cp TicTacToe.jar is.ru.tictactoe.ConsoleInterface
