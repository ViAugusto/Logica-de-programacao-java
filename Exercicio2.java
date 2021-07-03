// 6) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu suecessor.

package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int num = sc.nextInt();
		sc.close();
		
		num = num + 1;
		
		System.out.println("O sucessor do número digitado é: "+num);
		
	}

}