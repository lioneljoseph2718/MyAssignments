package wwek1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int a = 0;
		int b = 1;
		for (int i = 1; i < range; i++) {
		System.out.println("Fibonacci Series: ");
		System.out.println(a + "");
		int c = a + b;
		a = b;
		b = c;
		}
		
	}

}
