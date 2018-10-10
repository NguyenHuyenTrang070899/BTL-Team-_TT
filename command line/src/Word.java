public class Word{
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