package exercicios;

import java.util.Scanner;

public class Exercicio25 {
	
	static void sub() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		
		float num1 = scanner.nextFloat();
		
		System.out.println("-");
		
		float num2 = scanner.nextFloat();
		
		
		float res = num1 - num2;
		
		System.out.println(res);
		
	}
	
	static void soma() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		
		float num1 = scanner.nextFloat();
		
		System.out.println("+");
		
		float num2 = scanner.nextFloat();
		
		
		float res = num1 + num2;
		
		System.out.println(res);
		
		
	}
	
	static void mult() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		
		float num1 = scanner.nextFloat();
		
		System.out.println("*");
		
		float num2 = scanner.nextFloat();
		
		
		float res = num1 * num2;
		
		System.out.println(res);
		
		
	}
	
	static void div() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		
		float num1 = scanner.nextFloat();
		
		System.out.println("/");
		
		float num2 = scanner.nextFloat();
		
		
		float res = num1 / num2;
		
		System.out.println(res);
		
		
	}
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Essa � uma calculadora de apenas dois n�meros! \n Escreva a opera��o que voc� quer fazer.");
		System.out.println("1 - soma \n2 - subtra��o\n3 - multiplica��o\n4 - divis�o.");
		
		int opcao = scanner.nextInt();
		scanner.close();
		
		switch (opcao) {
		case 1:
			soma();
			break;
		
		case 2:
			sub();
			break;
			
		case 3:
			mult();
			break;
			
		case 4:
			div();
			break;

		default:
			System.out.println("Digitou o n�mero errado seu boc�");
			break;
		}
	}

}
