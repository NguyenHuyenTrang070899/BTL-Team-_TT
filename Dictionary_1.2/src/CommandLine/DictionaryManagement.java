package CommandLine;

import java.util.Scanner;

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

public class DictionaryManagement
{

    Dictionary dictionary = new Dictionary();

    // HÃ m láº¥y dá»¯ liá»‡u tá»« má»›i báº±ng cÃ¡ch nháº­p vÃ o commandline
    public void insertFromCommandLine(){
        Scanner scan = new Scanner(System.in);//Lá»›p Ä‘á»ƒ nháº­p dá»¯ liá»‡u
        System.out.print("So tu ban muon nhap: ");
        int n = Integer.parseInt(scan.nextLine());		// Chá»‘ng trÃ´i lá»‡nh
        for(int i=0;i<n;i++){
            String word_target = scan.next();//Nháº­p chuá»—i Ä‘áº¿n kÃ­ tá»± \n
            String word_explain = scan.nextLine();
            dictionary.setList(word_target,word_explain);	//ThÃªm vÃ o list tá»«
        }
    }

    //Ham lay du lieu tu file
    public void insertFromFile(){
        try (Scanner scan = new Scanner(new File("C:\\Users\\ASUS\\Documents\\Eclipse\\Dictionary_1.2\\bin\\CommandLine\\Dictionaries.txt"))) {
            while(scan.hasNext()){
                String word_target = scan.next();
                String word_explain = scan.nextLine();

                dictionary.setList(word_target,word_explain);
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
        }
    }
    
    
    public void dictionaryLookup()
	{	
		Scanner scan = new Scanner(System.in);
        ArrayList<Word> list = new ArrayList<Word>();

        list = dictionary.getList();
		System.out.print("Moi ban nhap tu can tra: ");
		String lookup =scan.nextLine();
		boolean check = false;
		int left = 0 ,right = list.size();
		do
		{
			int middle = (left +right)/2;
			if (list.get(middle).getWordTarget().compareTo(lookup)==0 )
			{
				System.out.print("Nghia cua tu la:");
				System.out.print(list.get(middle).getWordExplain());
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
    
    //HÃ m láº¥y danh sÃ¡ch tá»« má»›i Ä‘á»ƒ lÃ m viá»‡c
    public ArrayList<Word> getDictionary(){
        return dictionary.getList();
    }
}
