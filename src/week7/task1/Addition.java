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
public class Addition extends BinaryExpression{
    Expression left,right;
    public Expression left() {
        return left;
    }
    public Expression right() {
        return right;
    }
    public int evaluate(){
        return left.evaluate() + right.evaluate();
    }
    public Addition() {
        
    }
    public Addition(Expression exp1, Expression exp2) {
        left = exp1;
        right = exp2;
    }
    public String toString() {
        return Integer.toString(left.evaluate()) + "+" + Integer.toString(right.evaluate());
    }
    
}

