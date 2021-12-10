package com.univ;

import java.util.Scanner;

public class task_2_20 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        String s = Integer.toBinaryString(n);

        while (s.length() % 8 != 0) {
            s = "0" + s;
        }
        String res = s.substring(s.length() - 8, s.length()) + " ";
        for (int i = 0; i < s.length() / 8 - 1; i++) {
            res += s.substring(i * 8, i * 8 + 8) + " ";
        }
        System.out.println(res);
    }
}
