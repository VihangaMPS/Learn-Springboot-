package com.example.learnspringframework;

public class AppGamingBasicJava01 {
    public static void main(String[] args) {

        MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();

        GameRunner gameRunner = new GameRunner(game);

        gameRunner.run();

    }
}
