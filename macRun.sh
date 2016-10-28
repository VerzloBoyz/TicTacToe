#!/bin/sh

echo "Do you wish to play Tic Tac Toe as a web app or simply in the terminal? (1)Web app (2)Terminal"
read input

if [ "$input" != "1" ] && [ "$input" != "2" ]; then
    echo "You have insulted us, go home!"
elif [ "$input" = "1" ]; then
    perl -i -pe 's/.*/mainClassName = "is.ru.tictactoe.ChuckWeb"/ if $.==16' build.gradle
    ./gradlew installDist > /dev/null
    heroku local web &
    open http://localhost:5000
elif [ "$input" = "2" ]; then
    perl -i -pe 's/.*/mainClassName = "is.ru.tictactoe.ConsoleInterface"/ if $.==16' build.gradle
    gradle build > /dev/null
    gradle jar > /dev/null
    mv build/libs/TicTacToe.jar TicTacToe.jar
    java -cp TicTacToe.jar is.ru.tictactoe.ConsoleInterface
fi
