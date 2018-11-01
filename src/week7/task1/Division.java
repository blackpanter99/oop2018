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
public class Division {

        Expression left,right;
    public Expression left() {
        return left;
    }

    public Expression right() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return right;
    }

    public int evaluate()  {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String toString() {
        return  Integer.toString(left.evaluate())+"/"+Integer.toString(right.evaluate()); 
    }
    public Division() {
        
    }
    public Division(Expression ex1, Expression ex2) {
        left = ex1;
        right = ex2;
    }

    
}
