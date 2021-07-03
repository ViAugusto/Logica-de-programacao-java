/*25) Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e 
escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior 
ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.*/

package exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Diga o n�mero da conta do cliente: ");
		
		int conta = scanner.nextInt();
		
		System.out.println("Diga o saldo do cliente: ");
		
		float saldo = scanner.nextFloat();
		
		System.out.println("Diga o d�bito que ele deve: ");
		
		float debito = scanner.nextFloat();
		
		System.out.println("Diga o cr�dito que ele deve: ");
		
		float credito = scanner.nextFloat();
		
		float saldoFinal = saldo - debito - credito;
		
		if (saldoFinal > 0) {
			System.out.println("O cliente com a conta "+conta+"  tem "+saldoFinal+" reais, e seu saldo � positivo!");
			
		} else {
			System.out.println("O cliente com a conta "+conta+"  tem "+saldoFinal+" reais, e seu saldo � negativo!");

		}
		
		scanner.close();
		
		

	}

}
