package com.indytskyi;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle(new GameShips());
        battle.initializationOfShips();
    }
}
