// 20) Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrev�-los em ordem crescente. 

package exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int a = scanner.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		
		int b = scanner.nextInt();
		scanner.close();
		
		if (a > b) {
			
			System.out.println(b+" "+a);
			
		} else {
			
			System.out.println(a+" "+b);

		}
		
		
		

	}

}
