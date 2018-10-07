

import java.util.Scanner;

import java.util.ArrayList;
import java.io.File;

public class DictionaryManagement
{

    Dictionary dictionary = new Dictionary();

    // Hàm lấy dữ liệu từ mới bằng cách nhập vào commandline
    public void insertFromCommandLine(){
        Scanner scan = new Scanner(System.in);//Lớp để nhập dữ liệu
        System.out.print("So tu ban muon nhap: ");
        int n = Integer.parseInt(scan.nextLine());		// Chống trôi lệnh
        for(int i=0;i<n;i++){
            String word_target = scan.next();//Nhập chuỗi đến kí tự \n
            String word_explain = scan.nextLine();
            dictionary.setList(word_target,word_explain);	//Thêm vào list từ
        }
    }

    //Ham lay du lieu tu file
    public void insertFromFile(){
        try (Scanner scan = new Scanner(new File("C:\\Users\\ASUS\\Documents\\Eclipse\\TuDienver2\\bin\\TuDien\\Dictionaries.txt"))) {
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
		Scanner sc = new Scanner(System.in);
        ArrayList<Word> list = new ArrayList<Word>();

        list = dictionary.getList();
		System.out.print("Moi ban nhap tu can tra: ");
		String lookup =sc.nextLine();
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
    //Hàm lấy danh sách từ mới để làm việc
    public ArrayList<Word> getDictionary(){
        return dictionary.getList();
    }
}
