
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimbe
 */
public class DemonstrateCircle {
    public static void main(String[] args) {
        
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter radius of the circle: ");
       double radius = keyboard.nextDouble();   
       Circle circle = new Circle(radius);   
       System.out.println("");
       System.out.println("Radius of the circle is " + circle.getRadius());
       
       System.out.println("Area of the circle is " + circle.getArea());
       
       System.out.println("Diameter of the circle is " + circle.getDiameter());
       
       System.out.println("Circumference of the circle is " + circle.getCircumference());
       
       System.out.println("");
   }
}
    