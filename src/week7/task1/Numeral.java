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
public class Numeral extends Expression {
   int value;

    public Numeral() {
        value = 0;
    }
    public Numeral(int value) {
        this.value = value;
    }

     public String toString() {
        return Integer.toString(value);
    }
    public int evaluate() {
        return value;
    }
}
