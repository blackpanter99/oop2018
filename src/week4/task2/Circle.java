/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author nchdz
 */
public class Circle extends Shape{
    final double PI = 3.14159265359;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return PI * this.radius * this.radius;
    }
    public double getPerimeter()
    {
        return 2 * this.radius * PI;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        Circle hinhtron = new Circle(1);
        System.out.println(hinhtron.getArea());
        System.out.println(hinhtron.getPerimeter());
    }
}
