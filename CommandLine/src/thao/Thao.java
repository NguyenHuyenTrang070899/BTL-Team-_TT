/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thao;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Genius
 */
class Word{
    private String word_target;
    private String word_explain;

    // constuctors
    public Word(String word_target, String word_explain){
        this.word_target = word_target;
        this.word_explain = word_explain;
    }

    public Word(){
    }

    //set, get cho word_target
    public void setWordTarget(String _word_target){
        this.word_target = _word_target;
    }
    public String getWordTarget(){
        return this.word_target;
    }

    //set,get cho word_explain
    public void setWordExplain(String _word_explain){
        this.word_explain = _word_explain;
    }
    public String getWordExplain(){
        return this.word_explain;
    }

}

class Dictionary
{
    @SuppressWarnings("unchecked")
    private ArrayList<Word> list = new ArrayList();

    //HÃ m thÃªm tá»« má»›i vÃ o list tá»«
    //Cáº§n thÃªm cÃ¡c test: tá»« Ä‘Ã£ cÃ³ trong tá»« Ä‘iá»ƒn, chuá»—i khÃ´ng pháº£i tá»«, chuá»—i rá»—ng
    public void setList(String word_target,String word_explain){
        Word new_word = new Word(word_target,word_explain);
        this.list.add(new_word);
    }

    //HÃ m láº¥y list ra Ä‘á»ƒ lÃ m viá»‡c
    public ArrayList<Word> getList(){
        return list;
    }
}
class DictionaryManagement
{
    Dictionary dictionary = new Dictionary();

    // HÃ m láº¥y dá»¯ liá»‡u tá»« má»›i báº±ng cÃ¡ch nháº­p vÃ o commandline
    public void insertFromCommandLine(){
        Scanner scan = new Scanner(System.in);//Lá»›p Ä‘á»ƒ nháº­p dá»¯ liá»‡u
        System.out.print("So tu ban muon nhap: ");
        int n = Integer.parseInt(scan.nextLine());		// Chá»‘ng trÃ´i lá»‡nh
        for(int i=0;i<n;i++){
            String word_target = scan.next();//Nháº­p chuá»—i Ä‘áº¿n kÃ­ tá»± \n
            String word_explain = scan.nextLine();
            dictionary.setList(word_target,word_explain);	//ThÃªm vÃ o list tá»«
        }
    }

    //Ham lay du lieu tu file
    public void insertFromFile(){
        InputStream stream = Thao.class.getResourceAsStream("/thao/Dictionaries.txt");
        try (Scanner scan = new Scanner(stream)) {
            while(scan.hasNext()){
                String word_target = scan.next();
                String word_explain = scan.nextLine();

                dictionary.setList(word_target,word_explain);
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
        }
    }


    public void exportToFile(){
        System.out.print("Nhap ten file muon xuat du lieu: ");
        Scanner scan = new Scanner(System.in);
        String filepath = scan.next();

        ArrayList<Word> list = new ArrayList<Word>();
        list = dictionary.getList();

        File file = new File(filepath);
        try(PrintWriter file_writer = new PrintWriter(file)){
            for(int i=0; i<list.size(); i++)
                file_writer.println(String.format("%-20s",list.get(i).getWordTarget())+list.get(i).getWordExplain());
        } catch (Exception e){
            System.out.println(e.getClass().getSimpleName() + "" + e.getMessage());
        }
    }

    //HÃ m láº¥y danh sÃ¡ch tá»« má»›i Ä‘á»ƒ lÃ m viá»‡c
    public ArrayList<Word> getDictionary(){
        return dictionary.getList();
    }
}
class DictionaryCommandLine{
    DictionaryManagement dictionarymanagement = new DictionaryManagement();

    //Lay du lieu cho tu dien tu cmd
    public void setDictionaryManagement(){
        dictionarymanagement.insertFromCommandLine();
    }

    //Lay du lieu tu text
    public void setTxtDictionaryManagement(){
        dictionarymanagement.insertFromFile();
    }
    public void addWord(String word_target,String word_explain)
    {
        ArrayList<Word> list = new ArrayList<Word>();
        list = dictionarymanagement.getDictionary();
        //check loi
        boolean isOK = true;
        for(int i=0;i< list.size() ;i++)							//loi da ton tai tu trong danh sach
            if( list.get(i).equals(word_target) ) {
                isOK = false;
                System.out.println("Tu da ton tai trong bo nho!");
                break;
            }

        if(word_target.equals("")) {
            isOK = false;
            System.out.println("Tu khong hop le!");
        }

        if(isOK){
            Word new_word = new Word(word_target,word_explain);
            list.add(new_word);
        }
    }

    //Ham tim kiem 1 tu trong danh sach
    public void dictionaryLookup(){

        Scanner scan = new Scanner(System.in);
        ArrayList<Word> list = new ArrayList<Word>();

        list = dictionarymanagement.getDictionary();
        System.out.print("Moi ban nhap tu can tra: ");
        String lookup =scan.nextLine();
        boolean check = false;
        int left = 0 ,right = (list.size())-1;
        do
        {
            int middle = (left +right)/2;
            if (list.get(middle).getWordTarget().compareTo(lookup)==0 )
            {
                System.out.print("Nghia cua tu la:");
                System.out.println(list.get(middle).getWordExplain());
                check = true;
                break;
            }
            else
            if (list.get(middle).getWordTarget().compareTo(lookup)>0)
                right = middle -1 ;
            else
                left = middle +1;

        }
        while(left <= right);
        if (check == false)
            System.out.println("Khong tim thay tu ban can");

    }

    //Ham xoa mot tu trong dictionary
    public void deleteWord(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap tu muon xoa: ");
        String delete_word = scan.nextLine();

        ArrayList<Word> list = new ArrayList<Word>();
        list = dictionarymanagement.getDictionary();
        int left = 0 ,right = list.size();
        do
        {
            int middle = (left +right)/2;
            if (list.get(middle).getWordTarget().compareTo(delete_word)==0 )
            {
                list.remove(middle);
                break;
            }
            else
            if (list.get(middle).getWordTarget().compareTo(delete_word)>0)
                right = middle -1 ;
            else
                left = middle +1;

        }
        while(left <= right);

    }

    //Ham tim kiem tu chua hoan chinh
    //(lay do dai cua tu va so sanh voi tung do ki tu dau cua cac tu trong danh sach)
    public void dictionarySearcher(){

        System.out.print("Nhap tu muon tra cuu : ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        ArrayList<Word> list = new ArrayList();
        list = dictionarymanagement.getDictionary();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getWordTarget().contains(word))
                System.out.println(list.get(i).getWordTarget());
        }
    }

    //In ra tu dien theo cot
    public void showAllWords(){
        ArrayList<Word> list = new ArrayList();
        list = dictionarymanagement.getDictionary();
        System.out.println("No"+"\t"+"| "+String.format("%-20s","English")+"|       Vietnamese");
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+"\t"+"| "+String.format("%-20s",list.get(i).getWordTarget())+"| "+list.get(i).getWordExplain());
        }
    }

    //Ham tong hop tat ca cac ham
    public void dictionaryBasic(){
        this.setTxtDictionaryManagement();
        this.setDictionaryManagement();
        this.showAllWords();
        this.dictionarySearcher();
        this.dictionaryLookup();
    }
    public void dictionaryAdvanced()
    {
        DictionaryManagement input = new DictionaryManagement();
        input.exportToFile();
    }
}
public class Thao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DictionaryCommandLine dictionary_command_line = new DictionaryCommandLine();
        dictionary_command_line.setTxtDictionaryManagement();
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Insert From Commandline");
        System.out.println("2. Show All Words");
        System.out.println("3. Dictionary Lookup");
        System.out.println("4. Dictionary Searcher");
        System.out.println("5. Export To File");
        System.out.println("6. Delete One Word From Dictionary");
        System.out.println("7. Exit");
        while (true) {
            int number = Integer.parseInt(scan.nextLine());
            switch (number) {
                case 1: {
                    dictionary_command_line.setDictionaryManagement();
                    break;
                }
                case 2: {
                    dictionary_command_line.showAllWords();
                    break;
                }
                case 3: {
                    dictionary_command_line.dictionaryLookup();
                    break;
                }
                case 4: {
                    dictionary_command_line.dictionarySearcher();
                    break;
                }
                case 5: {
                    dictionary_command_line.dictionaryAdvanced();
                    break;
                }
                case 6: {
                    dictionary_command_line.deleteWord();
                    break;
                }
                case 7: {
                    System.out.println("Goodbye!");
                    break;
                }
                default:
                    break;
            }
            if (number == 7) break;
        }
    }
    
}
