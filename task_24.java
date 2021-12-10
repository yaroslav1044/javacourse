package zxcqwe;

import java.util.Scanner;

public class task_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input A = ");
        String A = scn.next();
        int l = 0;
        String ans = "";
        for(int i =0; i< A.length(); i++){
            for(int j =i; j< A.length(); j++) {
                if(String.valueOf(A.charAt(i)).equals(String.valueOf(A.charAt(j)))) {
                    if (l <= j - i) {
                        ans = A.substring(i, j)+ String.valueOf(A.charAt(j));
                        l = j - i;
                    }
                }
            }
        }
        System.out.println(ans);
        scn.close();
    }
}