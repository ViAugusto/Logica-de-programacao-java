/*5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.*/

package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in); /*chamando o scanner*/
		
		System.out.print("Digite um número: ");
		
		int num = sc.nextInt(); /* falando que a variável num receberá o valor que foi guardado no scanner*/
		sc.close();
		
		num = num - 1;
		
		System.out.println("O antecessor do número digitado é: "+num);
		
	}

}