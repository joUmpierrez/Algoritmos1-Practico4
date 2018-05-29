public class Ejercicio7 {
	// Sabiendo que:
	//				1. Si N es 1 el resultado es 1
	//				2. Si N es 2 el resultado es 2
	//				3. Si N es 3 el resultado es 3
	//				TODOS los otros resultados, dependen de que la cantidad de caminos que puedan elaborar al restarse entre 1 y 2
	public static int CantidadCaminos(int n) {
		int resultado = 0;

		if (n == 1) {
			resultado = 1;
		} else if (n == 2) {
			resultado = 2;
		} else if (n == 3) {
			resultado = 3;
		} else if (n > 3) {
			resultado = CantidadCaminos(n - 1) + CantidadCaminos(n - 2);
		}
		return resultado;
	}
}
