/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimbe
 */
public class Circle {
    
    private double radius;
    private final double PI = 3.14159;

    Circle(double radius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return PI * radius * radius;
    }
    
    double getDiameter() {
        return radius * 2;
    }
    
    double getCircumference() {
        return 2 * PI * radius;
    }
    
}
