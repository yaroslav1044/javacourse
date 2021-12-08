import java.util.Arrays;
import java.util.Scanner;

public class task_2_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Кiлькiсть = ");
		int a = in.nextInt();
		float[] myArray;
		myArray = new float[a];
		for (int i = 0; i < a; i++)	
	     {
		   
		   double x = Math.random();
		   myArray[i] = (float) x;
	       System.out.println(x);
	     }
		String doubleArrayString = Arrays.toString(myArray);
		System.out.print(doubleArrayString);
		in.close();
	}	
	
}
	