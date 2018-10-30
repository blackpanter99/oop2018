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
public abstract class Shape {
    //protected  String color;
    protected  boolean filled;
    protected Color color;
    protected Point location;
    protected Dimension size;
    protected Point speed;
    public abstract void paint(Graphics g);
    

    public Shape() {
        
    }

    @Override
    public String toString() {
        return "Shape{" + "filled=" + filled + ", color=" + color + ", location=" + location + ", size=" + size + ", speed=" + speed + '}';
    }

    

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    

    public boolean isFilled() {
        return filled;
    }

   
    
}
