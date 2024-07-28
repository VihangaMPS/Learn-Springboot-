package com.example.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();
        // GameRunner gameRunner = new GameRunner(marioGame);
        GameRunner gameRunner = new GameRunner(superContraGame); // tightly coupled

        gameRunner.run();

    }
}
