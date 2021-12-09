class TestClass {
	int f1;
	char f2;
	String f3;
}

public class task_1_1 {
	public static void main(String[] args) {
		TestClass c = new TestClass();
		System.out.println("int: " + c.f1);
		System.out.println("char: '" + c.f2 + "'");
		System.out.println("String: " + c.f3);
	}
}