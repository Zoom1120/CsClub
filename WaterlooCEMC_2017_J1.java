/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notgonnafupthistime;

import java.util.Scanner;

/**
 *
 * @author Anurag
 */
public class WaterlooCEMC_2017_J1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        
        int y = input.nextInt();
        
        if (x>0 && y >0)
        {
            System.out.println("1");
        }
        else if (x>0 && y<0)
        {
            System.out.println("4");
        }
        else if (x<0 && y>0)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("3");
        }
    }
    
}
