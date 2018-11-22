
package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Utils {
    public static String readContentFromFile(String path)
    {
        String data = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line = null;
            data = "";
            while((line = br.readLine()) != null)
            {
                data+= (line + "\r\n");
            }
            br.close();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return data;
    }
    public static void writeContentToFile(String path)
    {
        String demo = "writer somethinggg";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
            
            bw.append(demo);
            
            bw.close();
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
        
    }
    public static void appendTextToFile(String path)
    {
        String demo = "\r\n" + "append";
        try {
            File file = new File(path);
            
            FileWriter fw = new FileWriter(file, true);
            
            PrintWriter pw = new PrintWriter(fw, true);
            
            
            pw.append(demo);
            
            
            pw.close();
            
            fw.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // public static File abc(String folderPath,String fileName,String demo)
    public static File findFileByName(String folderPath, String fileName)
    {
        try {
           File dir = new File(folderPath);
           String[] children = dir.list();
           if (children == null)
           {
           System.out.println("does not exist or is not a directory");
                                               
            }
           else  {
               
               for (int i = 0; i < children.length; i++) {
               if(fileName.equals(children[i]))
               {
                  File file = new File(folderPath +"\\" +fileName);               
                  return file;
                   
               }
            }
          }
        } 
      
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
   }
    
       public static void main(String args[])
    {
       
    }
}

