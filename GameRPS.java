/*Chien-Pei M. YU
//CMPR112_29903 Spring 2017
//Homework Assignment for Week 4
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerps;
import java.util.Scanner;
import java.util.Random;
        
/**
 *
 * @author LeonCPYu
 */
public class GameRPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Random number generator
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    //In this game, we shall assign 0 to Rock, 1 to Paper, and 2 to Scissors
    String cwin = "Computer wins!";
    String uwin = "You win!";
    int choiceUser, choiceComp;
    System.out.println("Let's start the Rock, Paper, Scissors game!");
    System.out.println("Please enter your choice from one of the following three numbers: 0 = Rock; 1 = Paper, 2 = Scissors.");
    choiceUser = scanner.nextInt();
    if (choiceUser < 0 || choiceUser > 2)
    { 
        System.out.println("You have made an invalid choice.  Program is ending.");
        System.exit(0);
    }
    choiceComp = random.nextInt(3);
    if (choiceUser == choiceComp)//when both choose the same, the computer is to inform the user
    {
        if (choiceUser == 0)
        {
            System.out.println(" Both sides chose Rock!");
        }
        else if (choiceUser == 1)
                {
                    System.out.println("Both sides chose paper!");
                }
        else 
        {
            System.out.println("Both sides chose scissors!");
        }
         //exit program.
         System.exit(0);
    }
    if (choiceUser == 0)//user chooses rock
    { 
        if (choiceComp == 1)//computer chooses paper
        {
        System.out.println("You chose rock, computer chose paper.");
        System.out.printf("%s\n", cwin);
        }
        else//computer chooses scissors
        {
            System.out.println("You chose rock, computer chose scissors.");
            System.out.printf("%s\n", uwin);
        }
    }
        else if (choiceUser == 1)//user chooses paper
                {
                if (choiceComp == 0)
                {
                System.out.println("You chose paper; computer chose rock.");
                System.out.printf("%s\n", uwin);
                }
                else  
                {
                System.out.println("You chose paper; computer chose scissors.");
                System.out.printf("%s\n", cwin);
                }
        }
        else //User choses scissors
                {
                if (choiceComp == 0)
                { 
                System.out.println("You chose scissors; computer chose rock.");
                System.out.printf("%s\n",cwin);
                }
                else
                {
                System.out.println("You chose scissors; computer chose paper.");
                System.out.printf("%s\n", uwin);
                }
                } 
    scanner.close();
    }//public static void main closing brace
    
}
