
class Word{
    String word;
    String mean;
}
public class dictionnary {
    private Word[] W = new Word[100];

    public dictionnary(){
        for(int i =0 ; i < 10; i++){
            W[i] = new Word();
        }
        W[0].word = "hear"; W[0].mean = "nghe";
        W[1].word = "mean"; W[1].mean = "nghĩa là";
        W[2].word = "understand"; W[2].mean = "hiểu";
        W[3].word = "sure"; W[3].mean = "chắc chắn";
        W[4].word = "play"; W[4].mean = "chơi";
        W[5].word = "prefer"; W[5].mean = "thích hơn";
        W[6].word = "remember"; W[6].mean = "nhớ";
        W[7].word = "be long"; W[7].mean = "thuộc về";
        W[8].word = "belivie"; W[8].mean = "tin tưởng";
        W[9].word = "like"; W[9].mean = "thích";
    }
    public String searchAnhViet(String w){
        for(int i = 0; i < 10; i++){
            if(w.equals(W[i].word)) return W[i].mean;
        }
        return "không tìm thấy từ";
    }
    public String searchVietAnh(String w){
        for(int i = 0; i < 10; i++){
            if(w.equals(W[i].mean)) return W[i].word;
        }
        return "không tìm thấy từ";
    }

/*    public String searchAnhViet(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
