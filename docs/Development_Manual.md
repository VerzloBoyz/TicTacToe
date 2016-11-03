# Development Manual

> This manual describes the steps necessary to start working on the Tic Tac Toe game and contains some info on best practices.

## Rules

1. Follow the setup instructions as specified in the [Administration Manual](Administration_Manual.md).
2. We use **Gradle** to take care of our building process, run the tests and keep everything in good shape.
3. When you are ready to start working, switch from the `master` branch to the `dev` branch.
4. If you are adding a new feature then you should create a new branch from the `dev` branch (branch out from `dev`) and do your work there.
5. The code for the game can be found under the `src/` directory. There you see the `main/` directory where the code for the game logic is found and the `test/` and `selenium/` directories where the code for the tests is found.
6. When adding a new feature to the business logic of the game make sure your work is in the **TDD** (Test Driven Development) spirit.
7. When you have finished what you are working on then push your changes to the repository and merge into `dev`. If everything runs smoothly we create a pull request from `dev` into `master`.
8. Make sure you close the feature branch when you are finished and everything has been approved.

## Prerequisites

These are needed in order to compile and run tests on `TicTacToe.java`.
- **Java Development Kit** (JDK)
  - Preferably version 8 but version 7 should work as well.
- **Gradle** to quickly compile and run tests.

## Continuous integration
[![Build Status](https://travis-ci.org/sveppalicious/TicTacToe.svg?branch=master)](https://travis-ci.org/sveppalicious/TicTacToe)

We use **Travis CI** to automate our builds. Builds which fail will not be merged with `master`

## Code coverage

[![codecov](https://codecov.io/gh/sveppalicious/TicTacToe/branch/master/graph/badge.svg)](https://codecov.io/gh/sveppalicious/TicTacToe)

If **Travis** passes all tests a webhook will trigger for **codecov** to generate our coverage reports.
