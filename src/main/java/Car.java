/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimbe
 */
public class Car {
    
    
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int year, String make) {
        yearModel = year;
        make = make;
        speed = 0;        
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void accelerate() {
        speed += 5;
    }
    
    public void brake() {
        speed -= 5;
    }
}
