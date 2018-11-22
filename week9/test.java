/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author nchdz
 */
public class test {
    
    public String get(String path)
    {
        String data = "";
        ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource(path).getFile());
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = br.readLine())!= null)
            {
                data += line;
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                
        return data;
    }
    public static void main(String args[])
    {
        test t1 = new test();
        String demo = t1.get("text/Level1.txt");
        if(demo == null)
        {
            System.out.println("error");
        }
        else
        {
            System.out.println(demo);
        }
    }
}
