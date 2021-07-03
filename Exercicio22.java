/*25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e 
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior 
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/

package exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Diga o número da conta do cliente: ");
		
		int conta = scanner.nextInt();
		
		System.out.println("Diga o saldo do cliente: ");
		
		float saldo = scanner.nextFloat();
		
		System.out.println("Diga o débito que ele deve: ");
		
		float debito = scanner.nextFloat();
		
		System.out.println("Diga o crédito que ele deve: ");
		
		float credito = scanner.nextFloat();
		
		float saldoFinal = saldo - debito - credito;
		
		if (saldoFinal > 0) {
			System.out.println("O cliente com a conta "+conta+"  tem "+saldoFinal+" reais, e seu saldo é positivo!");
			
		} else {
			System.out.println("O cliente com a conta "+conta+"  tem "+saldoFinal+" reais, e seu saldo é negativo!");

		}
		
		scanner.close();
		
		

	}

}
