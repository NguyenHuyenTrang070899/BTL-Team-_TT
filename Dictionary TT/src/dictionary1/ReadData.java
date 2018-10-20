package dictionary1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author Administrator
 */
public class ReadData {
    
    ArrayList list = new ArrayList();
    ArrayList meanings = new ArrayList();

    public void readIn(String path){
        
        FileInputStream file = null;
        ZipInputStream zs = null;
        ZipEntry ze = null;
        BufferedReader br = null;
        
        System.out.println("Reading from " + path);
        list.clear();
        meanings.clear();
        try {
            file = new FileInputStream(path);
            zs = new ZipInputStream(file);
            ze = zs.getNextEntry();
            br = new BufferedReader(new InputStreamReader(zs, "utf-8"));

            String textInALine;
            int h = 0;

            while ((textInALine = br.readLine()) != null) {
                h = textInALine.indexOf("<html>");
                list.add(textInALine.substring(0, h));
                meanings.add(textInALine.substring(h));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receive " + list.size() + " words");
    }
    
    public ArrayList getList(){
        return list;
    }
    public ArrayList getMeanings(){
        return meanings;
    }
}
