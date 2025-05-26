package com.edify.cj;

public class Espncricinfo {
     int seraiNo;
     String playerName;
     int matchesPlayed;
     int runsScored;
     double average;

     public void displayStatinfo(){
        System.out.println("S.no _ " + seraiNo);
        System.out.println("name - " + playerName);
        System.out.println("Matches - " + matchesPlayed);
        System.out.println("Runs - "+ runsScored);
        System.out.println("Average - " + average);
     }
}
