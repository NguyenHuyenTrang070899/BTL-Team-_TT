

import java.util.ArrayList;			// class de tao list array

public class Dictionary
{
    private ArrayList<Word> list = new ArrayList();

    //Hàm thêm từ mới vào list từ
    //Cần thêm các test: từ đã có trong từ điển, chuỗi không phải từ, chuỗi rỗng
    public void setList(String word_target,String word_explain){
        Word new_word = new Word(word_target,word_explain);
        this.list.add(new_word);
    }

    //Hàm lấy list ra để làm việc
    public ArrayList<Word> getList(){
        return list;
    }
}