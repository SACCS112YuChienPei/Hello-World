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
    int niter= 0;
    int ncwin = 0;
    int nuwin = 0;
    int ntie = 0;
    int count = 0;
    //int check = 1;
    System.out.println("Let's start the Rock, Paper, Scissors game!");
    System.out.println("Please enter the total number of times you want to play the game.");
    niter = scanner.nextInt();
    while (count < niter)
    {
        //while (check == 1)
        //{
        System.out.println("Please enter your choice from one of the following three numbers: 0 = Rock; 1 = Paper, 2 = Scissors.");
        choiceUser = scanner.nextInt();
        while(choiceUser < 0 || choiceUser > 2)
            { 
        //System.out.println("You have made an invalid choice.  Please try again by selecting any of the following: 0, 1 or 2.");
        System.out.println("You have made an invalid choice.  Please try again.");
        System.out.println("Please enter your choice from one of the following three numbers: 0 = Rock; 1 = Paper, 2 = Scissors.");
        choiceUser = scanner.nextInt();
        //System.exit(0);
        //count--;
            }
        //check = 1;
        //}
    choiceComp = random.nextInt(3);
    if (choiceUser == choiceComp)//when both choose the same, the computer is to inform the user
    {
        if (choiceUser == 0)
        {
            System.out.println(" Both sides chose Rock! It's a tie.");
        }
        else if (choiceUser == 1)
                {
                    System.out.println("Both sides chose paper! It's a tie.");
                }
        else 
        {
            System.out.println("Both sides chose scissors! It's a tie.");
        }
        ntie++;//Add 1 to the no. of ties.
        //exit program.
         
        // System.exit(0);
    }
    else if (choiceUser == 0)//user chooses rock
    { 
        if (choiceComp == 1)//computer chooses paper
        {
        System.out.println("You chose rock, computer chose paper.");
        System.out.printf("%s\n", cwin);
        ncwin++; //Add 1x to the no of computer wins.
        }
        else//computer chooses scissors
        {
            System.out.println("You chose rock, computer chose scissors.");
            System.out.printf("%s\n", uwin);
            nuwin++;  //add 1x to the no of user wins.
        }
    }
        else if (choiceUser == 1)//user chooses paper
                {
                if (choiceComp == 0)
                {
                System.out.println("You chose paper; computer chose rock.");
                System.out.printf("%s\n", uwin);
                nuwin++;
                }
                else  
                {
                System.out.println("You chose paper; computer chose scissors.");
                System.out.printf("%s\n", cwin);
                ncwin++;
                }
                }
        else 
//User choses scissors
                {
                if (choiceComp == 0)
                { 
                System.out.println("You chose scissors; computer chose rock.");
                System.out.printf("%s\n",cwin);
                ncwin++;
                }
                else
                {
                System.out.println("You chose scissors; computer chose paper.");
                System.out.printf("%s\n", uwin);
                nuwin++;
                }
                } 
    
    count++;
    
    }
    scanner.close();
    System.out.printf("%n Game is over. You have played %d", niter);
    System.out.print(" times.");
    System.out.printf("%n You have won %d", nuwin);
    System.out.print(" times.");
    System.out.printf("%n Computer has won %d", ncwin);
    System.out.print(" times.");
    System.out.printf("%n You have tied the computer %d", ntie);
    System.out.print(" times.");
    }//public static void main closing brace
    //scanner.close(); 
}
