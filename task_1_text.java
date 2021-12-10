import java.io.*;

public class task_1_text {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String line;
        while ((line = br.readLine()) != null) {
            text += line + " ";
        }
        System.out.println(text);

        // б
        String[] words = text.split(" ");
        int len = words.length;

        // а
        String max_w = "";
        for (String s: words){
            if (max_w.length() < s.length()) max_w = s;
        }

        // в
        FileWriter fw = new FileWriter(file);
        text = text.replaceAll("  ", " ");
        text = text.replaceAll("  ", " ");
        for(String word: words){
            if (word.length() == 1) text = text.replace(" " + word + " ", " ");
        }
        fw.write(text);
        fw.close();

        // г
        String text1 = text;
        if (text1.charAt(0) == ' ') text1 = text1.replace(" ", "");
        FileWriter fw1 = new FileWriter(file);
        for(String word: words){
            if (word.length() == 1) text = text.replace(" " + word + " ", " ");
        }

        fw1.write(text);
        fw1.close();

        System.out.println("longest word -  " + max_w);
        System.out.println("number of words " + len);

    }
}