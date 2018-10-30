/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5_6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author nchdz
 */
public class Diagram extends JFrame {
   
    public  ArrayList<Layer> listLayer = new ArrayList<Layer>();
    public void removeCircle(ArrayList<Layer> l1,ArrayList<Shape> l2)
    {
        for(int i = 0 ; i < l1.size();i++)
        {
             
             l1.get(i).removeCircle(l2);
             
        }
    }
    
    public static void main(String args[])
    {
        
          Diagram d1 = new Diagram();
          Layer l1 = new Layer();
          Point sp = new Point(5,5);
          Point location = new Point(100, 100);
          Dimension size = new Dimension(50,50) ;
          Color color = Color.BLUE;
          
          Shape c1 = new Circle(sp, size,color , location);
          Shape c2 = new Circle(sp, size, color, location);
          Shape r1 = new Rectangle();
          Shape r2 = new Rectangle();
                     
          
          
          l1.listShape.add(c1);
          l1.listShape.add(c2);
          //l1.listShape.add(c1);
          l1.listShape.add(r1);
          l1.listShape.add(r2);
          
          d1.listLayer.add(l1);
          
          d1.removeCircle(d1.listLayer, l1.listShape);
          
          
          System.out.println(l1.listShape.size());
          
          
        
       
        
    }
}
