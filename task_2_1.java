import java.util.Scanner;


public class task_2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введiть прiзвище: ");
		String surname = in.nextLine();
		System.out.println("Привiт, " + surname);
		in.close();
	}
}