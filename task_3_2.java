public class task_3_2 {
	public static int generate_random() {
		return (int)(Math.random() * 123);
	}
	public static void main(String[] args) {
		int k = generate_random();
		for (int i = 0; i < 25; i++) {
			int m = generate_random();
			if (m < k) 
				System.out.println(m + " ����� �� " + k);
			else if (m == k) 
				System.out.println(m + " ������� " + k);
			else 
				System.out.println(m + " ����� �� " + k);
		}
	}
}