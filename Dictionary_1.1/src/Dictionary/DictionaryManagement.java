package Dictionary;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class DictionaryManagement
{
	
	Dictionary dictionary = new Dictionary();

	// Hàm lấy dữ liệu từ mới bằng cách nhập vào commandline
	public void insertFromCommandLine(){
		Scanner scan = new Scanner(System.in);			//Lớp để nhập dữ liệu			
		int n = Integer.parseInt(scan.nextLine());		// Chống trôi lệnh

		for(int i=0;i<n;i++){
			String word_target = scan.nextLine();		//Nhập chuỗi đến kí tự \n
			String word_explain = scan.nextLine();

			dictionary.setList(word_target,word_explain);	//Thêm vào list từ
		}
	}

	//Ham lay du lieu tu file
	public void insertFromFile(){
		try (Scanner scan = new Scanner(new File("Dictionaries.txt"))) {
			while(scan.hasNext()){
				String word_target = scan.next();
				String word_explain = scan.nextLine();

				dictionary.setList(word_target,word_explain);
		    }
		} catch (Exception e) {
				System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
			}
	}
	//Ham tim nghia cua mot tu
	public void dictionaryLookup(){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhap tu muon tim :");
		String s = scan.nextLine();
		
		boolean check=false;
		ArrayList<Word> list = new ArrayList<Word>();
		
		list = dictionary.getList();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getWordTarget().equals(s))
			{
				System.out.println(list.get(i).getWordExplain());
				check=true;
				break;
			}
		}
		if(check==false) 
			System.out.println("Khong tim thay tu can tim .");

	}

	//Hàm lấy danh sách từ mới để làm việc
	public ArrayList<Word> getDictionary(){
		return dictionary.getList();
	}
}
