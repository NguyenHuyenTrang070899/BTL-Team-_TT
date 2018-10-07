package CommandLine;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandLine{
	DictionaryManagement dictionarymanagement = new DictionaryManagement();

	//Lay du lieu cho tu dien tu cmd
	public void setDictionaryManagement(){
		dictionarymanagement.insertFromCommandLine();
	}

	//Lay du lieu tu text
	public void setTxtDictionaryManagement(){
		dictionarymanagement.insertFromFile();
	}

	//Xuat du lieu ra file text
	public void exportDictionaryManagerment(){
		dictionarymanagement.exportToFile();
	}

	//Tim kiem tu trong danh sach
	public void setDictionaryLookup(){
		dictionarymanagement.dictionaryLookup();
	}

	//Ham xoa mot tu trong danh sach
	public void deleteWordInDictionary(){
		dictionarymanagement.deleteWord();
	}

	//Ham tim kiem tu chua hoan chinh 
	//(lay do dai cua tu va so sanh voi tung do ki tu dau cua cac tu trong danh sach)
	public void dictionarySearcher(){

		System.out.print("Nhap tu muon tra cuu : ");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int n=word.length();

		ArrayList<Word> list = new ArrayList();
		list = dictionarymanagement.getDictionary();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getWordTarget().substring(0,n).equals(word))
				System.out.println(list.get(i).getWordTarget());
		}
	}

	//In ra tu dien theo cot
	public void showAllWords(){
		ArrayList<Word> list = new ArrayList();
		list = dictionarymanagement.getDictionary();
		System.out.println("No"+"\t"+"| "+String.format("%-20s","English")+"| Vietnamese");
		for(int i=0;i<list.size();i++){
			System.out.println((i+1)+"\t"+"| "+String.format("%-20s",list.get(i).getWordTarget())+"| "+list.get(i).getWordExplain());
		}
	}

	//In ra cac lua chon cho nguoi su dung
	public void listOfOptions(){
		System.out.println("\t\t\t\t\t\tDictionary");
		System.out.println("1. Insert From Commandline");
		System.out.println("2. Show All Words");
		System.out.println("3. Dictionary Lookup");
		System.out.println("4. Dictionary Searcher");
		System.out.println("5. Export To File");
		System.out.println("6. Delete One Word From Dictionary");
		System.out.println("7. Exit");
	}

	//Ham tong hop tat ca cac ham
	public void dictionaryBasic(){
		this.setTxtDictionaryManagement();
		this.setDictionaryManagement();
		this.showAllWords();
		this.dictionarySearcher();
	}
	public void dictionaryAdvanced() 
	{
        DictionaryManagement input = new DictionaryManagement();     
        input.insertFromFile();
        input.dictionaryLookup();
    }
}
