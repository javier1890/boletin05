package boletin05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		//Se pretende realizar un programa para gestionar la lista de participantes en una competicion de salto de longitud.
		//El numero de plazas disponibles es de 10. Sus datos se iran introduciendo en el mismo orden que se vayan inscribiendo los
		//atletas. Diseñar el programa que muestre las siguientes opciones:
		//	1.-Inscribir un participante
		//	2.-Mostrar listado de datos
		//	3.-Mostrar listado por marcas
		//	4.-Finalizar el programa
		//Si se selecciona 1, se introduciran los datos de uno de los participantes:
		//Nombre, mejor marca del 2002, mejor marca del 2001 y mejor marca del 2000.
		//Si se elige la opcion 2, se debe mostrar un listado por numero de dorsal
		//La opcion 3 mostrara un listado ordenado por la marca del 2002, de mayor a menor.
		//Tras procesar cada opcion, se debe mostrar de nuevo el menu inicial, hasta que se seleccione la opcion 4, que terminara el programa.

		Scanner sc = new Scanner(System.in);
		final int m1=2000,m2=2001,m3=2002,TAM=10;
		String participantes[][] = new String[TAM][4];
		int op,z=0;
		
		do {
			System.out.println("********MENU************");
			System.out.println("1) Ingrese datos del participante:");
			System.out.println("2) Mostrar datos ");
			System.out.println("3) Mostrar listado por marcas");
			System.out.println("4) Salir");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Ingrese nombre :"+ z+1);
				participantes[z][0] = sc.next();
				
				System.out.println("Marca 2000:"+ z+1);
				participantes[z][1] = sc.next();
				
				System.out.println("Marca 2001:"+ z+1);
				participantes[z][2] = sc.next();
				
				System.out.println("Marca 2002:"+ z+1);
				participantes[z][3] = sc.next();
				
				break;
			case 2:
				System.out.println("\nLos datos mostrados son:");
				for (int i = 0; i < z+1; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(participantes[i][j]+" ");
					}
					System.out.println("\n");
				}
			
				break;

			case 3:
				System.out.println("\nLos datos mostrados son:");
				int aux_num1=0;
				int aux_num2=0;
				int max=0;
				
				for (int i = 0; i < z+1; i++) {
					for (int j = 0; j < participantes.length; j++) {
						aux_num1=Integer.parseInt(participantes[i][3]);
						aux_num2=Integer.parseInt(participantes[i+1][3]);
						
							if (aux_num1>aux_num2) {
								max=aux_num1;
							
							}	
					}
		
				}				
				System.out.println("Marca 2002:"+ z+1);		
				break;

			default:
				break;
			}
          z++;
		} while (z<=TAM && op!=4);

		
	}
}