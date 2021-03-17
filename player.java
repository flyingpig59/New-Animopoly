//Code for the Player class


package com.company;

public class player {
    //Declaring variables of player class
    public int number;
    public int money;
    public int dice1;
    public int dice2;
    public int tileNum;
    public boolean same;
    public int turnsToMiss;
    public String name;
    public boolean in;

    //Assigns base values when instantiating player classes
    public player (String initialName, int initialMoney, int initialTileNum, int initialTurnsToMiss, int initialNumber, boolean initialSame, boolean initialIn){
        this.name = initialName;
        this.money = initialMoney;
        this.tileNum = initialTileNum;
        this.turnsToMiss = initialTurnsToMiss;
        this.number = initialNumber;
        this.same = initialSame;
        this.in = initialIn;
    }


}
