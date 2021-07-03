//9) Escreva um algoritmo para ler as dimensões de um paralelogramo, calcular e escrever a área do paralelogramo.

package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a base do paralelogramo: ");
		
		int base = sc.nextInt();
		
		System.out.print("\nAgora, informe o valor da altura: ");
		
		int altura = sc.nextInt();
		
		int area = base * altura;
		sc.close();
		
		System.out.print("\nA área é igual a: "+area);
	}
}
