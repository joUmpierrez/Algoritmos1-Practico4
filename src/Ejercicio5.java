public class Ejercicio5 {
	public static double Potencia(double a, int b) {
		double result = 0;

		if (b > 0) {
			result = a * Potencia(a, b - 1);
		} else if (b < 0) {
			result = 1 / a * Potencia(a, b + 1);
		} else {
			result = 1;
		}

		return result;
	}
}
