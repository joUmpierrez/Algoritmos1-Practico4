
public class Ejercicio3 {
	public static void ListarNumerosInv(int n) {
		System.out.println(n);
		if (n > 1)
		{
			ListarNumerosInv(n-1);
		}
	}
	
	public static void ListarNumeros(int n) {
		if (n >= 1)
		{
			ListarNumeros(n -1);
			System.out.println(n + " ");
		}
	}
}
