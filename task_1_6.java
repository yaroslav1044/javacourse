import java.util.Scanner;
import java.util.Arrays;

public class task_1_6 {
	/** ������� ������������ ����� */
	static int minLength = Integer.MAX_VALUE;
	/** ������� ������ ��� ��������� ����������� ����� */
	static int N = 10;
	/** ����� ����� ���������� ������� */
	static String[] minNums = new String[N];
	/** �������� �� ����� ����� ������ ������ minNums */
	static int ptr = 0;

	/** ������� ���� � ����� minNums ����� x */
	static void addNum(String x) {
		if (!Arrays.asList(minNums).contains(x)) {
			minNums[ptr] = x;
			ptr++;	
		}
	}

	/** ������� ����� ����� minNums */
	static void clearNums() {
		for (int i = 0; i < N; i++)
			minNums[i] = "";
		ptr = 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x_len;
		String x;
		String str;
		String[] arr;

		boolean flag = true;
		while (flag) {
			str = in.nextLine();
			if (str.length() == 0) { // ��� ������ � ����� ������� ����� ������� ������,  �������� Enter
				flag = false;
				continue;
			}
			arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				x = arr[i];
				if (!"".equals(x)) {
					x_len = x.length();
					if (x_len <= minLength) {
						if (x_len < minLength) {
							clearNums();
							minLength = x_len;
						}
						addNum(x);
					}
				}
			}
		}
		System.out.printf("����� ���������� �������(%d):\n", minLength);
		System.out.println(String.join(" ", minNums));
		in.close();
	}
}
