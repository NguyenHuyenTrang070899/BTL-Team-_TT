package CommandLine;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class DictionaryManagement{
	
	Dictionary dictionary = new Dictionary();

	// Hàm lấy dữ liệu từ mới bằng cách nhập vào commandline
	public void insertFromCommandLine(){
		System.out.print("Nhap so luong tu muon them vao tu dien : ");
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

	//Ham xuat du lieu ra file
	public void exportToFile(){
		System.out.print("Nhap ten file muon xuat du lieu: ");
		Scanner scan = new Scanner(System.in);
		String filepath = scan.next();

		ArrayList<Word> list = new ArrayList();
		list = dictionary.getList();

		File file = new File(filepath);
		try(PrintWriter file_writer = new PrintWriter(file)){
			for(int i=0; i<list.size(); i++)
				file_writer.println(String.format("%-20s",list.get(i).getWordTarget())+list.get(i).getWordExplain());
		} catch (Exception e){
			System.out.println(e.getClass().getSimpleName() + "" + e.getMessage());
		}
	}

	//Ham tim kiem 1 tu trong danh sach
	public void dictionaryLookup(){

		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap tu muon tim : ");
		String s = scan.nextLine();
		boolean check=false;
		ArrayList<Word> list = new ArrayList();
		list = dictionary.getList();

		for(int i=0;i<list.size();i++){
			if(list.get(i).getWordTarget().equals(s)){
				System.out.print("Nghia cua tu can tra la: ");
				System.out.println(list.get(i).getWordExplain());
				check=true;
				break;
			}
		}
		if(check==false) System.out.println("Khong tim thay tu can tim .");

	}

	//Ham xoa mot tu trong dictionary
	public void deleteWord(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap tu muon xoa: ");
		String delete_word = scan.nextLine();

		ArrayList<Word> list = new ArrayList();
		list = dictionary.getList();

		for(int i=0; i<list.size(); i++)
			if (delete_word.equals( list.get(i).getWordTarget() )){
				list.remove(i);
				break;
			}

	}

	//Hàm lấy danh sách từ mới để làm việc
	public ArrayList<Word> getDictionary(){
		return dictionary.getList();
	}
}
