import java.util.Scanner;

public class task_4_20_z {
    public static void main(String[] args)
    {
        int i = 0, j = 1;
        long k = 1;
        double x, ans = 0, tmp = 0;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        while (true) {
            tmp = Math.pow(x, i)*j*k;
            if (Math.abs(tmp) > 0.001) {
                ans += tmp;
                j *= -1;
                k += 1;
                i += 1;

                continue;

            }
            System.out.println(ans);
            break;
        }
        in.close();
    }
}