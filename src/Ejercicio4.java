
public class Ejercicio4 {
	public static int Minimo(int[] v, int hasta) {
		int min = v[0];
		if (hasta > 0) {
			if (v[hasta] <= Minimo(v, hasta - 1)) {
				min = v[hasta];
			} else {
				min = Minimo(v, hasta - 1);
			}
		}
		return min;
	}

	public static int Maximo(int[] v, int hasta) {
		int posMax = 0;
		if (hasta >= 0) {
			if (v[hasta] >= v[Maximo(v, hasta - 1)]) {
				posMax = hasta;
			} else {
				posMax = Maximo(v, hasta - 1);
			}
		}
		return posMax;
	}

	public static void Ordenar(int[] v, int hasta) {
		if (hasta >= 0) {
			int max = v[Maximo(v, hasta)]; 	// Obtiene el valor mas grande del Array
			v[Maximo(v, hasta)] = v[hasta]; // Swap
			v[hasta] = max;					// Swap2

			Ordenar(v, hasta - 1);
		}

	}
}