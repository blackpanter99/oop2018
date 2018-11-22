/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Arrays;

public class Task1 {
    public <T extends Comparable<T>> void sortArr(T list[]) {
        for(int i = 0; i < list.length - 1; ++i)
            for(int j = i + 1; j < list.length; ++j)
            if (list[i].compareTo(list[j]) > 0)
                swap(list, i, j);
    }
    
    private <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        Task1 t = new Task1();
        
        Integer intArr[] = {5, 4, 3, 2};
        t.sortArr(intArr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(intArr));
        Double doubleArr[] = {3.5, 7.5, 4.3, 5.35};
        t.sortArr(doubleArr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(doubleArr));
        Character charArr[] = {'x', 'c', 'n', 'a'};
        t.sortArr(charArr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(charArr));
        String strArr[] = {"acd", "dxd", "hoa", "avb"};
        t.sortArr(strArr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(strArr));
    }
}
