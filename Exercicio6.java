//10) Escreva um algoritmo para ler as dimensões de um triângulo, calcular e escrever a área do triângulo.

package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a base do triângulo: ");
		
		float base = sc.nextInt();
		
		System.out.print("\nInforme a altura do triângulo: ");
		
		float altura = sc.nextInt();
		sc.close();
		
		float area = (float) (base * altura ) / 2;
		
		System.out.print("\nA área do triângulo é igual a: "+area);
	}
}
