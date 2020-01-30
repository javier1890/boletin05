package boletin05;

import java.util.Scanner;

public class Tarea_matriz {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			String alumno[][]= new String[4][5];
			
		for(int i = 0;i<4;i++){
					System.out.println("Ingrese nombre :"+ i);
					alumno[i][0] = sc.next();
					System.out.println("Ingrese apellido paterno :"+ i);
					alumno[i][1] = sc.next();
					System.out.println("Ingrese apellido materno :"+ i);
					alumno[i][2] = sc.next();
					System.out.println("Ingrese telefono :"+ i);
					alumno[i][3] = sc.next();
					System.out.println("Ingrese e-mail :"+ i);
					alumno[i][4] = sc.next();
				}
		
		System.out.println("\nMostrar matrix: ");
		for(int i = 0;i<4;i++)
			{
				for (int j = 0; j < 5; j++) {
					System.out.print(alumno[i][j]+" ");
				}
				System.out.println("\n");
	        }
	
		
		//*************************************************7
		String aux = null;
		int j=0;
	for (int i = 0; i < 3; i++) {
			if (alumno[i][0].length()>=alumno[i+1][0].length()) {
				aux=alumno[i][0];
				j=i;
		}else {
				aux=alumno[i+1][0];
				j=i;
			}
		}
		
		System.out.println("\nEl nnombre mayor es de :"+aux);
		System.out.println("\n");
		
		
	//***************************************************/
		//Debera verificar si existen alumnos repetidos por el apellido 1 y 2
		//de no existir mostrar mensaje "No hay hermanos"
		String ape1 = null;
		String ape2 = null;
		boolean hermanos=false;
		for (int i = 0; i < 3; i++) {
			if (alumno[i][1].length()==alumno[i+1][1].length() && alumno[i][2].length()==alumno[i+1][2].length()) {
				ape1=alumno[i][0];
				ape2=alumno[i+1][0];

		}else {
				
              hermanos=false;
			}
		}
		System.out.println("\n");
		System.out.println(ape1+" es hermano de "+ape2);
		System.out.println("\n");
		
		

       }
	}
