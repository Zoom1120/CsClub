/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notgonnafupthistime;

/**
 *
 * @author Anurag
 */
import java.util.Scanner;
public class WaterlooCEMC_2016_J1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Result of first match:");
        String game1 = input.nextLine();
        System.out.println("Result of first match:");
        String game2 = input.nextLine();
        System.out.println("Result of first match:");
        String game3 = input.nextLine();
        System.out.println("Result of first match:");
        String game4 = input.nextLine();
        System.out.println("Result of first match:");
        String game5 = input.nextLine();
        System.out.println("Result of first match:");
        String game6 = input.nextLine();
        
        int wins = 0;
        
        if (game1.equals("W"))
        {
            wins++;
        }
        
        if (game2.equals("W"))
        {
            wins++;
        }
        
        if (game3.equals("W"))
        {
            wins++;
        }
        if (game4.equals("W"))
        {
            wins++;
        }
        if (game5.equals("W"))
        {
            wins++;
        }
        if (game6.equals("W"))
        {
            wins++;
        }
        
        if (wins == 5 || wins ==6)
        {
            System.out.println("1");
        }
        else if (wins == 3 || wins ==4)
        {
            System.out.println("2");
        }
        else if (wins == 1 || wins ==2)
        {
            System.out.println("2");
        }
        else 
        {
            System.out.println("-1");
        }
    }
    
}
