package CommandLine;

import java.util.ArrayList;			// class de tao list array

public class Dictionary
{
    private ArrayList<Word> list = new ArrayList();

    //HÃ m thÃªm tá»« má»›i vÃ o list tá»«
    //Cáº§n thÃªm cÃ¡c test: tá»« Ä‘Ã£ cÃ³ trong tá»« Ä‘iá»ƒn, chuá»—i khÃ´ng pháº£i tá»«, chuá»—i rá»—ng
    public void setList(String word_target,String word_explain){
        Word new_word = new Word(word_target,word_explain);
        this.list.add(new_word);
    }

    //HÃ m láº¥y list ra Ä‘á»ƒ lÃ m viá»‡c
    public ArrayList<Word> getList(){
        return list;
    }
}