/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5_6;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author nchdz
 */
public class Layer  {
 
   public  ArrayList<Shape> listShape = new ArrayList<Shape>();
    public void remveRectangle(ArrayList<Shape> l1)
    {
        
        for(int i = 0 ; i < l1.size() ; i++)
        {
           if(l1.get(i) instanceof Rectangle)
           {
               l1.remove(i);
               i--;
           }
        }
    }

    public void removeCircle(ArrayList<Shape> l1)
    {
         for(int i = 0 ; i < l1.size() ; i++)
        {
           if(l1.get(i) instanceof Circle)
           {
               l1.remove(i);
               i--;
           }
        }
    }
    public ArrayList getArr()
    {
        return listShape;
    }
    
    public static void main(String args[])
    {
          Point sp = new Point(5,5);
          Point location = new Point(100, 100);
          Dimension size = new Dimension(50,50) ;
          Color color = Color.BLUE;
          
          Shape c1 = new Circle(sp, size,color , location);
          Shape c2 = new Circle(sp, size,color , location);
          Shape r1 = new Rectangle();
          Shape r2 = new Rectangle();
                     
          Layer l2 = new Layer();
          l2.listShape.add(c1);
          l2.listShape.add(c2);
          l2.listShape.add(r1);
          l2.listShape.add(r2);
          
          l2.removeCircle(l2.listShape);
          
          System.out.println(l2.listShape.size());
          
          
          
         
    }

    
    
}
