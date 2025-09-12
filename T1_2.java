/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadesEnClase;
import java.util.Scanner;

/**
 *
 * @author Ikercito
 */
public class T1_2 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in); 
    double x1,x2,y1,y2, d;
    System.out.println("Ingrese el valor de x1:  ");
    x1 = lector.nextDouble();
    System.out.println("Ingrese el valor de y1:  ");
    y1 = lector.nextDouble();
    System.out.println("Ingrese el valor de x2:  ");
    x2 = lector.nextDouble();
    System.out.println("Ingrese el valor de y2:  ");
    y2 = lector.nextDouble();
    d = Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1, 2));
    System.out.println("La distacia entre los dos puntos es: "+ d);
   }
}
