import java.util.Scanner;


public class task_3_24 {
	public static void main(String[] args) {
		double side1;
	    double side2;
	    double side3;
	    double CosA;
	    double CosB;
	    double CosC;
		Scanner in = new Scanner(System.in);
		System.out.print("Введiть 1-шу сторону: ");
		side1 = in.nextDouble();
		System.out.print("Введiть 2-шу сторону: ");
		side2 = in.nextDouble();
		System.out.print("Введiть 3-шу сторону: ");
		side3 = in.nextDouble();
		System.out.print("CosA\n");
		CosA = (side2*side2+side3*side3-side1*side1)/(2*side2*side3);
		System.out.print(Math.acos(CosA)+"\n");
		System.out.print(Math.round(Math.toDegrees(Math.acos(CosA))));
		System.out.print("\nCosB\n");
		CosB = (side1*side1+side3*side3-side2*side2)/(2*side1*side3);
		System.out.print(Math.acos(CosB)+"\n");
		System.out.print(Math.round(Math.toDegrees(Math.acos(CosB))));
		System.out.print("\nCosC\n");
		CosC = (side1*side1+side2*side2-side3*side3)/(2*side2*side1);
		System.out.print(Math.acos(CosC)+"\n");
		System.out.print(Math.round(Math.toDegrees(Math.acos(CosC))));
		in.close();
	}
}
