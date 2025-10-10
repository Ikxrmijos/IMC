/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTO;

import java.util.Scanner;

/**
 *
 * @author Ikercito
 */
public class jobalexis {
    public static void main(String args[])
    {
        Scanner presentar = new Scanner(System.in);
        int N = presentar.nextInt();
        int j = -2;
        for (int i = 1; i <= N ; i++)
        {
            System.out.print((i*100)+", "+j);
            if(i>0)
            {
                System.out.print(", ");
            }
            j*=2;
        }
    }
    
}
