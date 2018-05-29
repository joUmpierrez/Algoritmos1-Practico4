
public class Ejercicios11 {

	int[][] mapa = {
			{0,0,0,1,1,0,0,0,1,0},
			{0,0,1,0,1,0,0,0,1,1},
			{0,1,0,0,1,1,1,0,0,0},
			{0,1,0,0,0,0,0,1,0,0},
			{0,0,1,0,1,0,1,0,0,1},
			{0,0,1,0,0,0,1,0,0,1},
			{0,0,1,0,0,0,1,0,0,1},
			{0,0,0,1,1,1,0,0,1,0},
			{0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,1,0,0,0},
			{0,0,1,1,0,0,1,0,1,0},
			{0,0,0,0,0,0,0,0,0,1}
	};
	
	public static void MostrarMatriz (int[][] m, int f, int c)
	{
		if (f < m.length)
		{
			if (c < m[f].length)
			{
				System.out.print(" - " + m[f][c] + " - ");
				MostrarMatriz(m, f, c+1);
			}
			else
			{
				System.out.print("\n");
				MostrarMatriz(m, f+1, 0);
			}
		}
	}
	
	
	public static int CuentoIslas(int[][] m, int f, int c)
	{
		int resultado = 0;				// Establece el resultado en 0
		
		if (m != null)					// Salida, establece que si la matriz es nulla salga de la recursividad
		{
			if (f < m.length)			// Comienza recorrida fila x fila
			{
				if (c < m[f].length)	// Incrementa el numero de columna de la fila para seguir recorriendo
				{
					if (m[f][c] == 1)	// Si se encuentra un 1 (tierra) comienza a recorrer los alrededores de dicha celda (Maximo 8 celdas)
					{
						m[f][c] = 0;	// Cambia el valor a 0 para que no lo siga recorriendo infinitamente (marca que ya paso por esa celda)
						
						if(c+1 < m[f].length && m[f][c+1] == 1) 							// Derecha ([F][C+1])
						{
							CuentoIslas(m, f, c+1);
						}
						else if(c+1 < m[f].length && f+1 < m.length && m[f+1][c+1] == 1)	// Abajo-Derecha ([F+1][C+1])
						{
							CuentoIslas(m, f+1, c+1);
						}
						else if (f+1 < m.length && m[f+1][c] == 1)							// Abajo ([F+1][C])
						{
							CuentoIslas(m, f+1, c);
						}
						else if (c-1 >= 0 && f+1 < m.length && m[f+1][c-1] == 1)			// Abajo-Izquierda ([F+1][C-1])
						{
							CuentoIslas(m, f+1, c-1);
						}
						else if (c-1 >= 0 && m[f][c-1] == 1)								// Izquierda ([F][C-1])
						{
							CuentoIslas(m, f, c-1);
						}
						else if (c-1 >= 0 && f-1 >=0 && m[f-1][c-1] == 1)					// Arriba-Izquierda ([F-1][C-1])
						{
							CuentoIslas(m, f-1, c-1);
						}
						else if (f-1 >= 0 && m[f-1][c] == 1)								// Arriba ([F-1][C])
						{
							CuentoIslas(m, f-1, c);
						}
						else if (c+1 < m[f].length && f-1 >= 0 && m[f-1][c+1] == 1)			// Arriba-Derecha ([F-1][C+1])
						{
							CuentoIslas(m, f-1, c+1);
						}
						resultado++;
					}
					else
					{
						CuentoIslas(m, f, c+1);
					}
				}
				else
				{
					CuentoIslas(m, f+1, 0);
				}
			}
		}
		return resultado;
	}
}
