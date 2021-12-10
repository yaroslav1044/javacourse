public class Text {
    Sentence[] text;
    String headline = "There is no headline";

    public Text(Sentence[] sent_arr){
        Sentence[] text = sent_arr;
    }

    public Text(Sentence[] sent_arr,String head){
        Sentence[] text = sent_arr;
        headline = head;
    }

    public Text(){}

    public void add_text(Sentence inp){
        int i;
        Sentence[] temp_text = new Sentence[text.length + 1];
        for (i = 0; i < text.length; i++)
            temp_text[i] = text[i];

        temp_text[text.length] = inp;
        text = temp_text;

    }

    public void show_text(){
        for(int i=0;i<text.length;i++){
         text[i].show_sentence();
        }
    }

    public void show_headline(){
        System.out.println(headline);
    }