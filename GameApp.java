package com.bella41;
import java.util.Scanner;
import java.lang.Math; 
/**
 * Abstract: This is a Rock Paper Scissors Game that takes the users response and generates
 * a response from the computer, it then compares the two responses and decides the winner.
 * the factors being Rock beats Scissors, Scissors beats Paper, and Paper beats Rock.
 * @author allisterbelljr
 */
public class GameApp {

    public static void main(String[] args) {
        // Introduction and Scanner initializing 
        Scanner sc  = new Scanner(System.in);
        System.out.println("Welcome to The Game of Rock Paper Scissors a.k.a 'Rochambeau' ");
        
         // creating variable for player move and computer move
          String playerMove;
          String computerMove = ""; 
          
     while(true){ 
        // Creating Switch cases for generating random computer response, and  Generates a random integer of 0, 1, or 2
        while(true) {
         int randNum = (int) (Math.random() * 3);   
         switch (randNum) {
              case 0:
                   computerMove = "R";
                   break;
              case 1:
                   computerMove = "P";
                   break;
              case 2:
                   computerMove = "S";}
                  break;
        }  
        
          // while loop for validating players choice
          while(true) {
            System.out.println("Please enter your move (Choose (R)rock, (P)paper, or (S)scissors:)");
            playerMove = sc.nextLine();
            if (playerMove.equalsIgnoreCase("R") || playerMove.equalsIgnoreCase("P") || playerMove.equalsIgnoreCase("S")) {
              break;
            }
            System.out.println(playerMove + "is not a valid move.");
          } 
          System.out.println("Computer played: " + computerMove);

          if (playerMove.equalsIgnoreCase(computerMove)) {
            System.out.println("Game was tie!");
           } 
          else if(playerMove.equalsIgnoreCase("r")) { 
            if (computerMove.equalsIgnoreCase("p")) {
                     System.out.println("You Lose!");  
                     
           } else if(computerMove.equalsIgnoreCase("s")){ 
              System.out.println("You Win!");
                  }
                 }

          else if(playerMove.equalsIgnoreCase("p")){
            if (computerMove.equalsIgnoreCase("r")){
                     System.out.println("You Win");

          } else if(computerMove.equalsIgnoreCase("s")){
             System.out.println("You Lose");
                }
               }
          
          else if(playerMove.equalsIgnoreCase("s")){
            if (computerMove.equalsIgnoreCase("p")){
                  System.out.println("You Win");

                } else if(computerMove.equalsIgnoreCase("r")){
                  System.out.println("You Lose");
              }
          }
          System.out.println("Play Again? (y/n)");
          String playAgain = sc.nextLine();
           if (!playAgain.equals("y")){ 
             {
          break;
               }
              
          
         }
          
         }
    }
}
    


        



         
             
         
            
   