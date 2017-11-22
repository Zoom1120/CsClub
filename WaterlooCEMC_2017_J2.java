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
public class WaterlooCEMC_2017_J2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int sum = N;
        for (int l = 0; l < K; l++)
        {
            N = N * 10;
            sum = sum + N;
        }
        System.out.println(sum);
    }    
    
}
