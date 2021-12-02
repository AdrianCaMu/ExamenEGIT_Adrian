package examen;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primer numero a operar: ");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce segundo numero a operar: ");
		int n2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce la operacion que quieres realizar: (suma / resta) ");
		String opcion = sc.nextLine();
		
		int solucion = 0;
		
		switch(opcion) {
		case "suma":
			solucion = sumar(n1,n2);
			break;
		case "resta":
			solucion = restar(n1,n2);
			break;
		default:
			System.out.println("Error: Operacion no reconocida");
		}
		
		System.out.println("La solucion a la " + opcion + " de " + n1 + " y " + n2 + " es " + solucion);
		
		sc.close();
	}

	private static int restar(int n1, int n2) {	
		return n1 - n2;
	}

	private static int sumar(int n1, int n2) {
		return n1 + n2;
	}
}
