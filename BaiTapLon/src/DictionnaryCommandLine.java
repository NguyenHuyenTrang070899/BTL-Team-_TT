

import java.util.ArrayList;

public class DictionaryCommandLine
{
    DictionaryManagement dictionarymanagement = new DictionaryManagement();

    //Lay du lieu cho tu dien tu cmd
    public void setDictionaryManagement(){
        dictionarymanagement.insertFromCommandLine();
    }

    //Lay du lieu tu text
    public void setTxtDictionaryManagement(){
        dictionarymanagement.insertFromFile();
    }

    //In ra tu dien theo cot
    public void showAllWords(){
        ArrayList<Word> list = new ArrayList<Word>();
        list = dictionarymanagement.getDictionary();
        System.out.println("No"+"	"+"| English"+"	"+"| Vietnamese");
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+"	"+"| "+list.get(i).getWordTarget()+"		"+"| "+list.get(i).getWordExplain());
        }
    }
    //bug: khong in doc duoc
    // cu the: voi cac tu co tu 6 ki tu tro len se tu dong thanh 3 tab thay vi 2

    public void dictionaryBasic(){
        this.setDictionaryManagement();
        this.setTxtDictionaryManagement();
        this.showAllWords();
    }
    public void dictionaryAdvanced() 
	{
    	Dictionary dictionary = new Dictionary();
        DictionaryManagement input = new DictionaryManagement();     
        input.insertFromFile();
        input.dictionaryLookup();
        
    }
}
