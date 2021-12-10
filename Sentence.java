public class Sentence {
    Word[] sentence;
    public Sentence(Word[] word_arr){
        Word[] sentence = word_arr;
    }

    public Sentence(){}

    public void show_sentence(){
        for(int i=0;i<sentence.length;i++){
            System.out.printf("%s ",sentence[i].word);
        }


    }
}