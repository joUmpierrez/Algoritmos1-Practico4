public class Ejercicio1 {
	public static int Factorial(int n) {
		int result = 0;

		if (n == 0) {
			result = 1;
		} else {
			result = n * Factorial(n - 1);
		}
		return result;
	}
}
