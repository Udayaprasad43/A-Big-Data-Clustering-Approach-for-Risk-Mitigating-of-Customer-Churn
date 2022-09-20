


import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class FrameSerFile {
    
    ArrayList<String> myDataToser = new ArrayList<String>();
    public void makeSerialization(ArrayList<String> data,String filePath){
        
        try{
        myDataToser.clear();
        myDataToser = data;
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(myDataToser);
        os.close();
        fos.close();
        //JOptionPane.showMessageDialog(null, "Object is serialized..!");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
