
public class Ejercicio2 {
	public static int Fibonacci(int n) {
		int result = 0;

		if (n == 0) {
			result = 0;
		} else if (n == 1) {
			result = 1;
		} else {
			result = Fibonacci(n - 1) + Fibonacci(n - 2);
		}

		return result;
	}
}
