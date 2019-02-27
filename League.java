/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerr;

/**
 *
 * @author TiehoM
 */
public class League {
    public static void main(String[] args) {
        
       // Create Team 1
       Player player1 = new Player();
       player1.playerName = "George Eliot";
       Player player2 = new Player();
       player2.playerName = "Graham Green";
       Player player3 = new Player();
       player3.playerName = "Geoffrey Chaucer";
       Player[] thePlayers = {player1,player2,player3};
       
       Team team1 = new Team();
       team1.teamName = "The Greens";
       team1.playerArray = thePlayers;
       
       // Create Team2
       Team team2 = new Team();
       team2.teamName = "The Reds";
       team2.playerArray = new Player[3];
       team2.playerArray[0] = new Player();
       team2.playerArray[0].playerName = "Robert Service";
       team2.playerArray[1] = new Player();
       team2.playerArray[1].playerName = "Robbie Burns";
       team2.playerArray[2] = new Player();
       team2.playerArray[2].playerName = "Rafael Sabatini";
       
       // for loop must be removed according to practice 6-2 and add the Game
       for(Player thePlayer : team1.playerArray ){
           System.out.println(thePlayer.playerName);
       }
       for(Player thePlayer : team2.playerArray){
           System.out.println(thePlayer.playerName);
       }
       
        // create Game or instatiate Game and create Goal Object
        // Game must be deleted according to the instruction given in pract 8-1
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoal = {goal1};
        currGame.goals = theGoal;
        
        System.out.println("The goal is scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName); 
    }
  
}
