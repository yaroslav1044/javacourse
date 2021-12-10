import java.util.Scanner;

public class task_3_1 {


    public static Rational add(Rational x, Rational y) {
        return new Rational(x.n * y.m + y.n * x.m, x.m * y.m);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter N:");
        int num = inp.nextInt(), n, m;
        inp.nextLine();
        Rational[] num_arr = new Rational[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter m:");
            n = inp.nextInt();
            System.out.println("enter n:");
            m = inp.nextInt();
            Rational temp = new Rational(n, m);
            num_arr[i] = temp;
        }
        System.out.println("_________________");
        for (int a = 0; a < num; a++) {
            num_arr[a].get_ratio();
        }
        System.out.println("_________________");
        Rational sum = new Rational(0,1);
        for(int b = 0; b < num; b++){
            sum = add(sum,num_arr[b]);
        }
        sum.get_ratio();
    }
}