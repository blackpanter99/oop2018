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
public class Rectangle extends Shape{
    protected  double width;
    protected  double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea()
    {
        return this.length * this.width;
    }
    public  double getPerimeter()
    {
        return (this.length + this.width)*2;   
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        Rectangle hcn = new Rectangle(3,4);
        System.out.println(hcn.getArea());
        System.out.println(hcn.getPerimeter());
    }
            
}
