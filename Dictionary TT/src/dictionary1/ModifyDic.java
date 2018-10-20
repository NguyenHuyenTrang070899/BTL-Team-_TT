package dictionary1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Administrator
 */
public class ModifyDic {
    
    
    public void removeWord(String word, ArrayList list, ArrayList meanings){
        int pt = list.indexOf(word);
        meanings.remove(pt);
        list.remove(pt);
        
    }
    public void addWord(String word, String meaning, ArrayList list, ArrayList meanings){
        String str = "<html>" + meaning;
        list.add(word);
        meanings.add(str);

    }
    public void editword(String newWord, String newMeaning, String oldWord, ArrayList list, ArrayList meanings){

        newMeaning = newMeaning.replace("\n", "");
        newMeaning = newMeaning.replace("&lt;", "");
        newMeaning = newMeaning.replace("&gt;", "");
        
        int pt = list.indexOf(oldWord);
        list.set(pt, newWord);
        meanings.set(pt, newMeaning);
    }
    public void writeList(ArrayList list, ArrayList meanings, String path, String fileName){
        FileOutputStream file ;
        ZipOutputStream zs ;
        BufferedWriter bw ;
        System.out.println("Writing to " + path);
        try {
            file = new FileOutputStream(path);
            zs = new ZipOutputStream(file);
            bw = new BufferedWriter(new OutputStreamWriter(zs, "utf-8"));
            zs.putNextEntry(new ZipEntry(fileName));
            
            for(int i=0; i<list.size(); i++){
                bw.write(list.get(i).toString() + meanings.get(i).toString());
                bw.newLine();
            }
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done!!!");
    }

}