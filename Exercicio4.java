// 8) Escreva um programa para ler o raio de um círculo, calcular e escrever a sua área. (pR2)

package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio do círculo: ");
		
		float raio = sc.nextInt();
		
		float area = (float) (3.14 * (raio*raio));
		sc.close();
		
		System.out.print("A área desse círculo é: "+area);	
	}
}
