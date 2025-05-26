package com.edify.cj;

public class PlayersObjects {
    Espncricinfo P1 = new Espncricinfo();
    System.out.println(" ");
    System.err.println(" ----- India won 5 ICC tournaments in 21s1 Century ----- ");
    System.out.println(" Contribution from indian batsman ");

    
    System.out.println(" ");

    P1.seraiNo = 1;
    P1.playerName = "Virat Kohli";
    P1.matchesPlayed = 27;
    P1.runsScored = 825;
    P1.average = 35.00;
   P1.displayStatinfo();
    
   System.out.println(" ");

   Espncricinfo P2 = new Espncricinfo();
   P2.seraiNo = 2;
   P2.playerName = "Rohit Sharma";
   P2.matchesPlayed = 21;
   P2.runsScored = 702;
   P2.average = 41;
   P2.displayStatinfo();

   System.out.println(" ");

   Espncricinfo P3 = new Espncricinfo();
   P3.seraiNo = 3;
   P3.playerName = "Gambhir";
   P3.matchesPlayed = 15;
   P3.average = 41.00;
   P3.runsScored = 620;
   P3.displayStatinfo();
}

