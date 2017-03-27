/*SAC CMPR112_29903
Chien-Pei M. YU
Homework#6 Odd/Even Problem
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6_odd_even_game;
import java.util.Scanner;
import java.security.SecureRandom;
import javax.swing.JOptionPane;
import java.lang.Integer;
import java.util.Locale;

/**
 *
 * @author LeonCPYu
 */
public class HW6_Odd_Even_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int[] compNumber = new int[20];//create compNumber array
        int[] yourGuess = new int[20];// create your guess array.
        //int gameCount = 0;
        int nOdd = 0;
        int nEven = 0;
        int nWin = 0;
        int nLoss = 0;
        //int[] aCount = new int[20];
        //double perWin = 0.0;
        //Create strings for display or dialogs. 
        String s0 = "You have a maximum number of 18 games to play.";
        String s1 = "Guess if the number is odd or even. Enter 1 if odd, and 0 if even.";
        String s2 = "You win.";
        String s3 = "You lose.";
        String s4 = "Good Bye!";
        String s5 = "The number is not valid.  Please reenter either a 0 for even or 1 for odd.";
        String s6 = "The number is valid.";
        String s7 = "Do you wish to play another round? Enter Y for Yes, and N for No.";
        String s8 = "Input is not valid. Please enter Y for yes, and N for No.";
        String[] guess = new String[20];//create array guess.
        String[] result = new String[20];//create result array.
        
       //System.out.println(s0);
        JOptionPane.showMessageDialog(null, s0);
        //int answer = 1;
        String reply = "Y";
        int gameCount = 0;
        do 
        {
            gameCount++; 
            compNumber[gameCount] = 1 + randomNumbers.nextInt(6);
            //System.out.println(s1);
            guess[gameCount] = JOptionPane.showInputDialog(null, s1);
            boolean reread = true;
            while (reread == true)//screening for correct input.
            {
            if (guess[gameCount].equals("0") || guess[gameCount].equals("1"))
                //JOptionPane.showMessageDialog(null, s6);
                reread = false;
            else
            {
                JOptionPane.showMessageDialog(null, s5);
                guess[gameCount] = JOptionPane.showInputDialog(null, s1);
            }
            }
            yourGuess[gameCount] = Integer.parseInt(guess[gameCount]);
                          
            //yourGuess[gameCount] =input.nextInt();
            if ((compNumber[gameCount]%2)== 1)
                nOdd++;
            else
                nEven++;
            if (yourGuess[gameCount]== compNumber[gameCount]%2)
            {
                nWin++;
                result[gameCount] = "Win";
                System.out.printf("%n%s", s2);
            }
            else
            {
                nLoss++;
                result[gameCount] = "Lose";
                System.out.printf("%n%s", s3);
            }
            //System.out.println("Do you wish to play another round? Enter 1 for yes, and 0 for no.");
            reply = JOptionPane.showInputDialog(null, s7);
            reply = reply.toUpperCase();
            boolean redo = true; 
            while (redo == true)//screening for correct input
            {
              if(reply.equals("Y")||reply.equals("N")) 
                  redo = false;
              else
              {
                  reply = JOptionPane.showInputDialog(null, s8);
                  reply = reply.toUpperCase();
              }
            }
            
            //answer = input.nextInt();
        }while ((reply.equals("Y")) && gameCount < 18);
        
        System.out.printf("%n The game is terminated.  You have played %d rounds.", gameCount);
        System.out.printf("%n The computer has generated %d odds, and %d evens.",nOdd, nEven);
        System.out.printf("%n You have made %d wins, and %d losses.", nWin, nLoss);
        System.out.printf("%n Your winning percentage is %.2f percent.%n", (100.0*nWin/gameCount));
        System.out.println("Below is a history of the games you played.");
        System.out.printf("%n %s%15s%15s%10s", "Round", "Computer No", "Your Guess", "Result");
        for (int count = 1; count <= gameCount; count++ )
        {
        System.out.printf("%n %5d%15d%15d%10s", count,compNumber[count], yourGuess[count], result[count]);
        }
        JOptionPane.showMessageDialog(null, s4);
        
    }
    
}
