/*SAC CMPR112_29903
Chien-Pei M. Yu
Homework for Week 7__Odd/Even Game with Objects and Constructor
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd_evengame_wk7hw_usingobjects;
import java.util.Scanner;
import java.security.SecureRandom;
import javax.swing.JOptionPane;
import java.lang.Integer;
import java.util.Locale;

/**
 *
 * @author LeonCPYu
 */
public class Odd_EvenGame_Wk7HW_UsingObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereSecureRandom randomNumbers = new SecureRandom();
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
        String intro = "You have a maximum number of 20 games to play.  You may terminate the game at any time.";
        String introQ = "Guess if the number is odd or even. Enter 1 if odd, and 0 if even.";
        String uWin = "You win.";
        String uLose = "You lose.";
        String bye = "Good Bye!";
        String retry = "The number is not valid.  Please reenter either a 0 for even or 1 for odd.";
        //String s6 = "The number is valid.";
        String contQ = "Do you wish to play another round? Enter Y for Yes, and N for No.";
        String retry_a = "Input is not valid. Please enter Y for yes, and N for No.";
        String history = "Below is the history of the game you played.  1 in guess stands for Odd, and 0 stands for Even.";
        String[] guess = new String[20];//create array guess.
        String[] result = new String[20];//create result array.
        String[] compNo = new String[20];
       //System.out.println(s0);
        JOptionPane.showMessageDialog(null, intro);
        //int answer = 1;
        String reply = "Y";
        int gameCount = 0;
        do 
        {
            //gameCount++; 
            //compNumber[gameCount] = 1 + randomNumbers.nextInt(6);
            RandomNumber myRandomNumber = new RandomNumber();
            compNumber[gameCount] = myRandomNumber.GetANumber_Between_1_and_6();
            //System.out.println(s1);
            guess[gameCount] = JOptionPane.showInputDialog(null, introQ);
            boolean reread = true;
            while (reread == true)//screening for correct input.
            {
            if (guess[gameCount].equals("0") || guess[gameCount].equals("1"))
                //JOptionPane.showMessageDialog(null, s6);
                reread = false;
            else
            {
                JOptionPane.showMessageDialog(null, retry);
                guess[gameCount] = JOptionPane.showInputDialog(null, introQ);
            }
            }
            yourGuess[gameCount] = Integer.parseInt(guess[gameCount]);
                          
            //yourGuess[gameCount] =input.nextInt();
            if ((compNumber[gameCount]%2)== 1)
            {
                compNo[gameCount] = "Odd";
                nOdd++;
            }
            else
            {
                compNo[gameCount] = "Even";
                nEven++;
            }
            if (yourGuess[gameCount]== compNumber[gameCount]%2)
            {
                nWin++;
                result[gameCount] = "Win";
                JOptionPane.showMessageDialog(null, uWin);
                //System.out.printf("%n%s", uWin);
            }
            else
            {
                nLoss++;
                result[gameCount] = "Lose";
                JOptionPane.showMessageDialog(null, uLose);
                //System.out.printf("%n%s", uLose);
            }
            //System.out.println("Do you wish to play another round? Enter 1 for yes, and 0 for no.");
            reply = JOptionPane.showInputDialog(null, contQ);
            reply = reply.toUpperCase();
            boolean redo = true; 
            while (redo == true)//screening for correct input
            {
              if(reply.equals("Y")||reply.equals("N")) 
                  redo = false;
              else
              {
                  reply = JOptionPane.showInputDialog(null, retry_a);
                  reply = reply.toUpperCase();
              }
            }
            gameCount++;
            //answer = input.nextInt();
        }while ((reply.equals("Y")) && gameCount < 20);
       // int counter = gameCount + 1;
        System.out.printf("%n The game is terminated.  You have played %d rounds.", gameCount);
        System.out.printf("%n The computer has generated %d odds, and %d evens.",nOdd, nEven);
        System.out.printf("%n You have made %d wins, and %d losses.", nWin, nLoss);
        System.out.printf("%n Your winning percentage is %.2f percent.%n", (100.0*nWin/gameCount));
        System.out.println(history);
        System.out.printf("%n %9s%21s%17s%10s", "Round", "Computer No", "Your Guess", "Result");
        for (int count = 0; count < gameCount; count++ )
        {
        if (yourGuess[count]==1)
            guess[count]= "Odd";
        else
            guess[count]= "Even";
        System.out.printf("%n Game#%4d : System generated %s, you guessed %s, you %s!", (count+1),compNo[count], guess[count], result[count]);
        }
        JOptionPane.showMessageDialog(null, bye);
    }
    
}
