package CommandLine;

import java.util.ArrayList;			// class de tao list array
import java.util.Scanner;

public class Dictionary{
	private ArrayList<Word> list = new ArrayList();

	//Hàm thêm từ mới vào list từ
	public void setList(String word_target,String word_explain){

		//check loi 
		Scanner scan = new Scanner(System.in);
		String lookup =scan.nextLine();
		boolean isOK = true;
		int left = 0 ,right = list.size();
			do
			{
				int middle = (left +right)/2;
				if (list.get(middle).getWordTarget().compareTo(lookup)==0 )
				{
					isOK = false;
					break;
				}
				else
					if (list.get(middle).getWordTarget().compareTo(lookup)>0)
						right = middle -1 ;
					else
						left = middle +1;
					
			}
			while(left <= right);
			if (isOK == false)
				System.out.println("Tu da co san trong bo nho");
			

		if(word_target.equals("")) {
			isOK = false;
			System.out.println("Tu khong hop le!");
		}

		if(isOK){
			Word new_word = new Word(word_target,word_explain);
			this.list.add(new_word);
		}
	}

	//Hàm lấy list ra để làm việc
	public ArrayList<Word> getList(){
		return list;
	}
}
