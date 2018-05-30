public class Menu {
	public static void main(String[] args) {
		
		int[][] mapa = new int [][] {
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
		
		int[][] island = new int[][] {
		    { 0, 1, 0, 0, 0 },
		    { 1, 1, 1, 0, 0 },
		    { 0, 0, 0, 1, 0 },
		    { 0, 1, 0, 0, 1 },
		    { 1, 0, 0, 0, 0 }       
		  };
		
		//System.out.println(Ejercicios11.CuentoIslas(island, 0, 0));
		//Ejercicios11.MostrarMatriz(mapa, 0, 0);
		  //System.out.println(Ejercicios11.Islas(island, 0, 0));
		 //Ejercicios11.Islas(island, 0, 0);
		 // System.out.println(Ejercicios11.ForIslands(island));
		  System.out.println(Ejercicios11.Islas(island, 0, 0));
	}
	
}
