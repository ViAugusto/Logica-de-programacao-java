//11) Escreva um algoritmo para ler as dimens�es de um quadrado, calcular e escrever a �rea do quadrado.

package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Diga o lado do quadrado: ");
		
		float lado = sc.nextInt();
		sc.close();
		
		float area = (float) (lado * lado);
		
		System.out.print("\nA �rea do quadrado � igual a: "+area + "�");
	}

}
