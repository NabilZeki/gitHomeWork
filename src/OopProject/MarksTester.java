package OopProject;

public class MarksTester {

	public static void main(String[] args) {

		A studentA = new A(78, 90, 75);
		B studentB = new B(95, 100, 85, 98);

		System.out.println("Student A Average = " + studentA.getPercentage());
		System.out.println("Student B Average = " + studentB.getPercentage());
	}
}