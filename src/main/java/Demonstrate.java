/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimbe
 */
public class Demonstrate {
    public static void main(String[] args) {
        Car car = new Car(2019, "Impala");
        for(int i = 0; i < 5; ++i) {
            car.accelerate();
            System.out.println("The speed of the car is " + car.getSpeed());
            }
        
        for(int i = 0; i < 5; ++i) {
            car.brake();
            System.out.println("The speed of the car is " + car.getSpeed());
        }
        
    }
}
