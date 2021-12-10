import java.util.Scanner;

public class task_3_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введіть ім'я:");
		String name = in.nextLine();
		System.out.println("Привіт, " + name + "!");
		in.close();
	}
}