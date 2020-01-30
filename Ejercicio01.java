package boletin05;

import java.util.Arrays;


public class Ejercicio01 {

	public static void main(String[] args) {
		
		//1. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
		//debe contener n+m. Después se debe mostrar su contenido.
		
		int[][] t=new int[5][5];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				t[i][j]=i+j;
			}
		}
		
		
		
		//toString() Escape para arreglos unidimencionales
		//deepToString() Escape para arreglos bidimencionales
		System.out.println(Arrays.deepToString(t));
		


	}

}
