/*7) Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.*/

package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a base do ret�ngulo: ");
		
		int base = sc.nextInt();
		
		System.out.print("\nAgora, informe o valor da altura: ");
		
		int altura = sc.nextInt();
		
		int area = base * altura;
		sc.close();
		
		System.out.print("\nA �rea � igual a: "+area);
		
	}

}
