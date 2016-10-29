@ECHO OFF

set /p input=Do you wish to play Tic Tac Toe as a web app or simply in the terminal? (1)Web app (2)Terminal: 

if %input% GEQ 3 echo You have insulted us!
if %input% LEQ 0 echo You have insulted us!

if %input% == 1 echo 1

if %input% == 2 echo 2