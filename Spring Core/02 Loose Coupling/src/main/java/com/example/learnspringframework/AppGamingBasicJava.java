package com.example.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();

        GameRunner gameRunner = new GameRunner(game); // Loosely coupled

        gameRunner.run();

    }
}
