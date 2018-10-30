/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5_6;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Point;

/**
 *
 * @author nchdz
 */
public class Circle extends Shape{

    
    public Circle(Point speed,Dimension size,Color color,Point location)           
    {
        this.speed = speed;
        this.location = location;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Circle" + "filled=" + filled + ", color=" + color + ", location=" + location + ", size=" + size + ", speed=" + speed + '}';
    }
   
    Circle() {
        
    }
    public void setP(Point p)
    {
        
    }
    public Color getColor() {
        return color;
    }

    public Dimension getSize() {
        return size;
    }

    public Point getSpeed() {
        return speed;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setSpeed(Point speed) {
        this.speed = speed;
    }
           

    
         
       
    
    public static void main(String args[])
    {
        
    }

    @Override
    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
}
