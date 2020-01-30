package boletin05;

public class Ejercicio02 {

	public static void main(String[] args) {
		// 2. Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es
		// decir, si se obtiene la misma
		// tabla al cambiar filas por columnas.

		
		
		
		int azar=(int)(Math.random()*5)+1;
		int azar2=(int)(Math.random()*5)+1;
		int[][] t = new int[azar][azar2];
		
		
		for (int i = 0; i < azar; i++) {
			for (int j = 0; j < azar2; j++) {
				t[i][j] = i + j;
			}
		}
		
		if (azar==azar2) {
			for (int j = 0;j < azar2; j++) {
				for (int i = 0; i < azar; i++) {
					
				}
			}
		}else {
			System.out.print("\nNo es simetrica");
		}
		
		
		
		
		System.out.println("\nMATRIZ A:");
		for (int i = 0; i < azar; i++) {
			for (int j = 0; j < azar2; j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println("\n");
		}

	}

}
