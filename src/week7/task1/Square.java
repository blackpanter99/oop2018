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
public class Square extends Expression{
    Expression expression;

     public String toString() {
        return null;
    }
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
    public Square() {
        
    }
    public Square(Expression ex) {
        expression = ex;
    }
    
}
