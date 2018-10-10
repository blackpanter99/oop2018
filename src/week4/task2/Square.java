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
public class Square extends Rectangle{
    private double side;
    public Square(double side) {
           this.side = side;
    }
    public Square()
    {
        
    }
    public Square(double side,String color,boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String args[])
    {
        Square vuong = new Square(4);
        vuong.setLength(4);
        vuong.setWidth(4);
        System.out.println(vuong.getArea());
        System.out.println(vuong.getPerimeter());
        
        
        
        
    }

   
    
}
