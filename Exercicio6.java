//10) Escreva um algoritmo para ler as dimens�es de um tri�ngulo, calcular e escrever a �rea do tri�ngulo.

package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a base do tri�ngulo: ");
		
		float base = sc.nextInt();
		
		System.out.print("\nInforme a altura do tri�ngulo: ");
		
		float altura = sc.nextInt();
		sc.close();
		
		float area = (float) (base * altura ) / 2;
		
		System.out.print("\nA �rea do tri�ngulo � igual a: "+area);
	}
}
