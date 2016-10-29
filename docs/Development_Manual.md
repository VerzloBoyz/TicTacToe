# Development Manual
> This manual describes the steps necessary to start working on the Tic Tac Toe game and contains some info on best practices.
## Prerequisites
- **Java Development Kit** (JDK) 7 or higher
    - Any of the following will work
    -   OpenJDK 7 / OpenJDK 8 - [Download](http://openjdk.java.net/install/)
    - Java OracleJDK 7 - [Download](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
    - Java OracleJDK 8 - [Download](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
- **Gradle** - [Download](https://gradle.org/gradle-download)

1. Follow the setup instructions as specified in the [Administration Manual](Administration_Manual.md).
2. We use **Gradle** to take care of our building process, run the tests and keep everything in good shape.
3. When you are ready to start working, switch from the `Master` branch to the `dev` branch.
4. If you are adding a new feature then you should create a new branch from the `dev` branch (branch out from `dev`) and do your work there.
5. The code for the game can be found under the `src/` directory. There you see the `main/` directory where the code for the game logic is found and the `test/` directory where the code for the tests is found.
6. When adding a new feature to the business logic of the game make sure your work is in the **TDD** (Test Driven Development) spirit.
7. When you have finished what you are working on then push your changes to the repository and merge into `dev`. If everything runs smoothly we create a pull request from `dev` into `Master`.
8. Make sure you close the feature branch when you are finished and everything has been approved.
