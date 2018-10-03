import java.util.Scanner;
import java.util.ArrayList;

class DictionaryManagement{
    Scanner scan = new Scanner(System.in);			//Lá»›p Ä‘á»ƒ nháº­p dá»¯ liá»‡u
    Dictionary dictionary = new Dictionary();

    // HÃ m láº¥y dá»¯ liá»‡u tá»« má»›i báº±ng cÃ¡ch nháº­p vÃ o commandline
    public void insertFromCommandLine(){
        int n = Integer.parseInt(scan.nextLine());		// nhập một số từ bàn phím kiểu Integer

        for(int i=0;i<n;i++){
            String word_target = scan.nextLine();		//Nháº­p chuá»—i Ä‘áº¿n kÃ­ tá»± \n
            String word_explain = scan.nextLine();

            dictionary.setList(word_target,word_explain);	//ThÃªm vÃ o list tá»«
        }
    }

    //HÃ m láº¥y danh sÃ¡ch tá»« má»›i Ä‘á»ƒ lÃ m viá»‡c
    public ArrayList<Word> getDictionary(){
        return dictionary.getList();
    }
}