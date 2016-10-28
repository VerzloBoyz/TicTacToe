## Development Manual

#### This manual describes the steps necessary to start working on the Tic Tac Toe game and contains some info on best practices.

1. Clone the github repo that is found [here](https://github.com/VerzloBoyz/TicTacToe.git)
2. When you have finished cloning the repo you can run TicTacToe.jar that is found in the root directory if you want to try out the game (See Administration Manual).
3. Make sure you have the correct version of of Java Installed *(jdk7, oraclejdk7 or oraclejdk8)*.
4. We use **Gradle** to take care of our building process, run the tests and keep everything in good shape.
5. When you are ready to start working switch from the *Master* branch to the *dev* branch.
6. If you are adding a new feature then you should create a new branch from the *dev* branch (branch out from *dev*) and do your work there.
7. The code for the game can be found under the src directory. There you see the main directory where the code for the game logic is found and the test directory where the code for the tests is    found.
8. When adding a new feature to the business logic of the game make sure your work is in the **TDD** (Test Driven Development) spirit.
9. When you have finished what you are working on then push your changes to the Github repo and merge into *dev*. If everything runs smoothly we create a pull request from *dev* into *Master*.
10. Make sure you close the feature branch when you are finished and everything has been approved.
