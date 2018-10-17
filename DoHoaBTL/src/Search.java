
//package firstswingexample;

import java.io.File;
import java.io.InputStream;

import java.util.ArrayList;


import java.util.Scanner;

class word {
    private String word_target;
    private String word_explain;

    public word(String word_target, String word_explain){
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
    
    public void setWordTarget(String _word_target){
        this.word_target = _word_target;
    }
    public String getWordTarget(){
        return this.word_target;
    }

   
    public void setWordExplain(String _word_explain){
        this.word_explain = _word_explain;
    }
    public String getWordExplain(){
        return this.word_explain;
    }
}
class Dic
{
    private ArrayList<word> list = new ArrayList();

    public void setList(String word_target,String word_explain){
        word new_word = new word(word_target,word_explain);
        this.list.add(new_word);
        
    }

    public ArrayList<word> getList(){
        return list;
    }
}
class DictionaryCommandline{
    public Dic dic = new Dic();
    public void insertFromFile(){
        
         try (Scanner scan = new Scanner(new File("C:\\Users\\pc\\IdeaProjects\\BaiTapLon\\src\\Dictionaries.txt"))){
            while(scan.hasNext()){
                String word_target = scan.next();
                String word_explain = scan.nextLine();

                dic.setList(word_target,word_explain);
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
        }
    }
    public ArrayList<word> getDictionaryCommandline(){
        return dic.getList();
    }
}

public class Search{
    public ArrayList<word> list = new ArrayList<word>();
    public String search( String w){
        DictionaryCommandline dic = new DictionaryCommandline();
        dic.insertFromFile();
        list = dic.getDictionaryCommandline();
        for(int i=0;i<list.size();i++)
        {
            if(w.equals(list.get(i).getWordTarget()))
                return list.get(i).getWordExplain();
        }
        return "Không tìm thấy từ";
    }
    
}
