/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author nchdz
 */
public class Task2 {
    public void NullPointer() throws IOException
    {
        String s=null;  
        System.out.println(s.length());
    }
    public void  Arithmet() throws IOException
    {
        int a = 50/0;
        System.out.println(a);
    }
    public void NumberFormat() throws IOException
    {
        String s="abc";  
        int i=Integer.parseInt(s);
    }
    public void ArrayIndex() throws IOException
    {
        int a[]=new int[5];  
        a[10]=50; //ArrayIndexOutOfBoundsException        
    }
    public void ClassCast() throws IOException
    {
        Object i = Integer.valueOf(42);
        String s = (String)i;  
    }
    public void IoEx() throws IOException
    {
       
       InputStream is = new InputStream() {
           @Override
           public int read() throws IOException {
               return 0;
           }
       };
        OutputStream os = new OutputStream() {
           @Override
           public void write(int i) throws IOException {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
               
    }
    public void FileNotFound(String path) throws IOException
    {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
       
    }

    public static void main(String args[]) throws IOException
    {
        Task2 t = new Task2();
       // t.NullPointer();
        t.IoEx();
    }
}
