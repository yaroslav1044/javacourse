import java.util.Scanner;

public class Rainfall {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n; // наступне число
  double sum = 0; // сума введених чисел
  double i = 0; // номер введеного числа
  
  boolean flag = true;
  while (flag) {
   n = in.nextInt();
   if (n == 999999) {
    flag = false;
    continue;
   }
   sum += n;
   i++;
  }
  System.out.println("Mean: " + (sum / i));
  in.close();
 }
}


