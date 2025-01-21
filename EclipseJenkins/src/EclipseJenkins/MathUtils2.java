package EclipseJenkins;

public class MathUtils2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a test");
	}
	public int addition(int a, int b) {
		int k;
		k = a + b;
		return k;
	}
	public int subtraction(int a, int b) {
		int k;
		k = a - b;
		return k;
	}
	public int mult(int a, int b) {
		int k;
		k = a * b;
		return k;
	}
	public double divide(int a, int b) {
		if (b == 0) {
			return -1;
		}
		double k;
		k = a / b;
		return k;
	}
}
