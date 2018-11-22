/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author nchdz
 */
public class Task2 {
    
    public static void main(String args[])
    {
        Random rd = new Random();
        float arr[] = new float[1000];
        for(int i = 0 ; i < 1000 ; i++)
        {
            arr[i] = 1000*rd.nextFloat();
        }
       
       for(int i = 1; i < 1000 ;i++  ){
            for (int j = 999; j >=i; j--) {
                if(arr[j] < arr[j - 1]) {
                    float t  = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = t;
                }
            }
        }
         for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
