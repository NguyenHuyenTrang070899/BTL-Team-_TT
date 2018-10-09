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
