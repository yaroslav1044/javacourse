package zxcqwe;
import java.util.Scanner;

public class task_4_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("n = ");
        int n = scn.nextInt();
        int k = 10;
        String s = "";
        for (int i = 0; i < Math.ceil(100 / n)+1; i++){
            for(int j = 0; j < n; j++){
                if (k<=100){
                    s= s + k+" ";
                    k++;
                }
                else{break;}
            }
            System.out.print(s+"\n");
            s = "";
            scn.close();
        }
    }
}