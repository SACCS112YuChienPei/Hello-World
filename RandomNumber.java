/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd_evengame_wk7hw_usingobjects;

/**
 *
 * @author LeonCPYu
 */
public class RandomNumber {
    public int GetANumber_Between_1_and_6()
        {
        int compNumber;
        //obtain a number between 1 and 10
        compNumber = 1 + (int) (Math.random()*6);
        return compNumber;
        //optional print statement for checking.
        //System.out.printf("%n%d", compNumber);
        }  
}
