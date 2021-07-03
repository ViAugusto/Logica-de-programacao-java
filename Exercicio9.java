package exercicios;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem de idade?");
		
		int anos = sc.nextInt();
		
		System.out.println("Quantos meses você tem de idade?");
		
		int meses = sc.nextInt();
		
		System.out.println("Quantos dias você tem de idade?");
		
		int dias = sc.nextInt();
		sc.close();
		
		int diasAno = anos * 365;
		
		int diasMeses = meses * 30;
		
		int total = dias + diasAno + diasMeses;
		
		System.out.print("Você tem ao total "+total+" dias de vida.");
		
	
	}

}
