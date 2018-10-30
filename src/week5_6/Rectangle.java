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
import week4.task2.*;

/**
 *
 * @author nchdz
 */
public class Rectangle extends Shape{

   
    public Point getLocation() {
        return location;
    }

    public Point getSpeed() {
        return speed;
    }

    public Dimension getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
     return "Rectangle";
    
    
    
    
    }
    public static void main(String args[])
    {
       
    }

    @Override
    public void paint(Graphics g) {
        
    }
            
}
