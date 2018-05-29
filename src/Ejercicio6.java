public class Ejercicio6 {
	public static int Mcd(int a, int b) {
		int resultado = 0;
		int resto = a % b;
		if (resto == 0) {
			resultado = b;
		} else {
			resultado = Mcd(b, a % b);
		}
		return resultado;
	}

	public static void PrimosEntreSi(int mcd) {
		if (mcd == 1) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}
