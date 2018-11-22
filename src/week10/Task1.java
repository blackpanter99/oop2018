/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nchdz
 */
public class Task1 {
    boolean checkString(String data)
    {
        return data.contains("static");
    }
    List<String> getAllFunctions(File path)
    {
        List<String> list = new ArrayList<String>();
        String data = ""; 
        
        List<String> l1 = new ArrayList<>();
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            String line = null;           
            String line1 = null;
            while((line = br.readLine()) != null)
            {               
                
                l1.add(line);
                                    
                
            }
            
            for(int i = 0 ;i < l1.size() ; i++)
            {
                if(checkString(l1.get(i)))
                {
                    String d = l1.get(i);
                    for(int j = i+1 ; j < l1.size() ; j++)
                    {
                        if(checkString(l1.get(j)))
                        {
                            break;
                        }
                        else
                        {
                            d+= l1.get(j)+"\r\n";
                            
                        }
                    
                        
                    }
                    list.add(d);
                }
            }
            
            br.close();
            
                       
            
            
        } catch (Exception e) {
           // e.printStackTrace();
        }
        
       return list;
        
    }
    public String findFunctionByName(String name)
    {
       // if(name.contains(name))
        int k = 0;
        int z = 0;
        int data = 0;
        for(int i = 0 ; i < name.length() ;i++)
        {
            if(name.charAt(i) == ',')
            {
                k++;
            }
        }
        System.out.println(k);
      //  System.out.println(k);
        String arr[] = name.split("\\(", 2);
       // System.out.println(arr[0]);
       // System.out.println(arr[1]);
        String arr1[] = arr[1].split(",",k+1);
       // System.out.println(arr1[0]);
        
        try {
            String path = "C:\\Users\\nchdz\\Documents\\NetBeansProjects\\17020766\\src\\week9\\Utils.java";
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line = null;
            while((line = br.readLine()) != null)
            {
                               
                 if(line.contains(arr[0]) == true)
                 {
                     data = 0;
                   for(int i = 0 ; i < line.length() ;i++)
                    {
                   if(line.charAt(i) == ',')
                      {
                        data++;
                        System.out.println(data);
                      }
                    }
                   
                     String a[] = arr[1].split(",",k+1);
                     for(int x = 0 ; x < a.length ; x++)
                     {
                         if(line.contains(a[x]) == true)
                         {
                             z++;
                         }
                     }
                    if(k == 0 && z == 1)
                    {
                        return line;
                    }
                    if(line.contains(arr1[arr1.length-1].split("\\)")[0]) == true)
                    {
                        z++;
                    }
                     
                 }
                 if(z == k+1)
                 {
                     return line;
                 }
                 
                 
                 
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    //
   public static void main(String args[]){
       Task1 t1 = new Task1();
       List<String> list = new ArrayList<>();
       File file = new File("C:\\Users\\nchdz\\Documents\\NetBeansProjects\\17020766\\src\\week9\\Utils.java");
      // list = t1.getAllFunctions(file);
      // System.out.println(list.size());
       //System.out.println(t1.findFunctionByName("findFileByName(String,String)"));       
      // System.out.println(t1.findFunctionByName("abc(String,String,String)"));
       String data = t1.findFunctionByName("findFileByName(String,String)");
       if(data == null )
       {
           System.out.println("Not Find");
       }
       else if(data.contains("//") == true )
       {
           String d[] = data.split("//",2);
           System.out.println(d[1]);
       }
       else
       {
           System.out.println(data);
       }
       
       
    
     
       
      

   }
}
