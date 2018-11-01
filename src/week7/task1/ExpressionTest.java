/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author nchdz
 */
public class ExpressionTest {
    public static void main(String[] args) {
       Square squa = new Square(new Numeral(10));
       Subtraction sub = new Subtraction(squa,new Numeral(1));
       Addition add = new Addition(sub,new Multiplication(new Numeral(2),new Numeral(3)));
       System.out.println(new Square(add).evaluate());        
       try{
           new Division(new Numeral(5),new Numeral(0)).evaluate();
       }
       catch(ArithmeticException e) {
           System.out.println("ArithmeticException: "+e.getMessage());
       }
       
    }
}
