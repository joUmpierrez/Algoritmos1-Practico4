
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
						m[f][c] = 2;	// Cambia el valor a 2 para que no lo siga recorriendo infinitamente (marca que ya paso por esa celda)
						
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
						resultado = 1;
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
	
	public static int Islas (int[][] m, int f, int c)
	{
		int resultado = 0;
		
		if (c != m[0].length-1 || f != m.length-1)
		{
			if (m[f][c] == 1)
			{
				CheckIslas(m, f, c);
				resultado++;
			}
			
			if (c == m[0].length-1)
			{
				f++;
				c=0;
			}
			else
			{
				c++;
			}
			resultado =+ Islas(m, f, c);
		}
		
		return resultado;
	}
	
	public static int ForIslands (int[][] m)
	{
		int result = 0;
		
		for (int f = 0; f < m.length; f++)
		{
			for (int c = 0; c < m[f].length; c++)
			{
				if (m[f][c] == 1)
				{
					CheckIslas(m, f, c);
					result++;
				}
			}
		}
		
		return result;
	}
	
	public static void CheckIslas (int[][] m, int f, int c)
	{
		m[f][c] = 2;	// Cambia el valor a 2 para que no lo siga recorriendo infinitamente (marca que ya paso por esa celda)
		
		if(c+1 < m[f].length && m[f][c+1] == 1) 						// Derecha ([F][C+1])
		{
			CheckIslas(m, f, c+1);
		}
		
		if(c+1 < m[f].length && f+1 < m.length && m[f+1][c+1] == 1)		// Abajo-Derecha ([F+1][C+1])
		{
			CheckIslas(m, f+1, c+1);
		}
		
		if (f+1 < m.length && m[f+1][c] == 1)							// Abajo ([F+1][C])
		{
			CheckIslas(m, f+1, c);
		}
		
		if (c-1 >= 0 && f+1 < m.length && m[f+1][c-1] == 1)				// Abajo-Izquierda ([F+1][C-1])
		{
			CheckIslas(m, f+1, c-1);
		}
		
		if (c-1 >= 0 && m[f][c-1] == 1)									// Izquierda ([F][C-1])
		{
			CheckIslas(m, f, c-1);
		}
		
		if (c-1 >= 0 && f-1 >=0 && m[f-1][c-1] == 1)					// Arriba-Izquierda ([F-1][C-1])
		{
			CheckIslas(m, f-1, c-1);
		}
		
		if (f-1 >= 0 && m[f-1][c] == 1)									// Arriba ([F-1][C])
		{
			CheckIslas(m, f-1, c);
		}
		
		if (c+1 < m[f].length && f-1 >= 0 && m[f-1][c+1] == 1)			// Arriba-Derecha ([F-1][C+1])
		{
			CheckIslas(m, f-1, c+1);
		}
	}
	
	public static void markAllNeighours(int row, int col, int[][] island){
		 
		  island[row][col] = '*';
		 
		  //Right
		  if(col+1 < island[row].length && island[row][col+1] == 1)
		   markAllNeighours(row, col+1, island);
		 
		  //Bottom Right diagonal
		  if(row+1 < island.length && col+1 < island[row].length && island[row+1][col+1] == 1)
		   markAllNeighours(row+1, col+1, island);
		 
		  //Bottom
		  if(row+1 < island.length && island[row+1][col] == 1)
		   markAllNeighours(row+1, col, island);
		 
		  //Bottom Left diagonal
		  if(row+1 < island.length && col-1 >= 0 && island[row+1][col-1] == 1)
		   markAllNeighours(row+1, col-1, island);
		 
		  //Left
		  if(col-1 >= 0 && island[row][col-1] == 1)
		   markAllNeighours(row, col-1, island);
		 
		  //Top Left diagonal
		  if(row-1 >= 0 && col-1 >= 0 && island[row-1][col-1] == 1)
		   markAllNeighours(row-1, col-1, island);
		 
		  //Top
		  if(row-1 >= 0 && island[row-1][col] == 1)
		   markAllNeighours(row-1, col, island);
		 
		  //Top Right diagonal
		  if(row-1 >= 0 && col+1 < island[row].length && island[row-1][col+1] == 1)
		   markAllNeighours(row-1, col+1, island);
		 }
	
	
	
	
	
}
