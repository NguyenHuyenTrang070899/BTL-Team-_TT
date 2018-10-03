import java.util.ArrayList;

class DictionaryCommandLine{
    DictionaryManagement dictionarymanagement = new DictionaryManagement();

    public void setDictionaryManagement(){
        dictionarymanagement.insertFromCommandLine();
    }

    //In ra tu dien theo cot
    public void showAllWords(){
        ArrayList<Word> list = new ArrayList();
        list = dictionarymanagement.getDictionary();
        System.out.println("No"+"	"+"| English"+"	"+"| Vietnamese");
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+"	"+"| "+list.get(i).getWordTarget()+"	        "+"| "+list.get(i).getWordExplain());
        }
    }
    //bug: khong in doc duoc

    public void dictionaryBasic(){
        this.setDictionaryManagement();
        this.showAllWords();
    }
}
