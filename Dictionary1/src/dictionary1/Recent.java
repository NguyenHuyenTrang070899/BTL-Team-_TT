package dictionary1;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Recent {
    
    
    public ArrayList readIn(String path){
        ArrayList list = new ArrayList();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf-8"));

            String textInALine;

            while ((textInALine = br.readLine()) != null && list.size()<20) {
                list.add(textInALine);
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
        return list;
    }
    public void addWord(ArrayList list, String word){
        if(list.indexOf(word)!=-1){
            list.remove(list.indexOf(word));
        }
        else if(list.indexOf(word)==-1 && list.size()==20){
            list.remove(0);
        }
        list.add(word);
        
    }
    public void write(ArrayList recentList, String path){
        BufferedWriter bw= null;
        FileWriter fw= null;
        
        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            for(int i=0; i<recentList.size(); i++){
                bw.write(recentList.get(i).toString());
                bw.newLine();
            }
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                try {
                    if(bw!=null) bw.close();
                    if(fw!=null) fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
}
