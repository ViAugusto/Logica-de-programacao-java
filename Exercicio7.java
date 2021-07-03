//11) Escreva um algoritmo para ler as dimensões de um quadrado, calcular e escrever a área do quadrado.

package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Diga o lado do quadrado: ");
		
		float lado = sc.nextInt();
		sc.close();
		
		float area = (float) (lado * lado);
		
		System.out.print("\nA área do quadrado é igual a: "+area + "²");
	}

}
