package boletin05;

import java.util.Arrays;

public class Ejercicio03 {

	public static void main(String[] args) {
		// 3. Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.

		
		int[][] t = new int[3][3];
		int[][] x = new int[3][3];
		int[][] z = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				t[i][j] = (int)(Math.random()*20)+1;
				x[i][j] = (int)(Math.random()*20)+1;
			}
		}
		
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < t.length; j++) {
				z[i][j]=t[i][j]+x[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(z));
		System.out.println(Arrays.deepToString(z));
		System.out.println(Arrays.deepToString(z));

	}

}
