//19) Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o maior deles.

package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		
		int a = scanner.nextInt();
		
		System.out.println("Digite outro valor:");
		
		int b = scanner.nextInt();
		scanner.close();
		
		if (a > b) {
			
			System.out.println("O maior n�mero �: "+a);
			
		} else {
			
			System.out.println("O maior n�mero �: "+b);

		}

	}

}
