/*24) Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que 
ultrapassar este valor, calcular e escrever o seu sal�rio total.*/

package exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio fixo do funcion�rio: ");
		
		float s = scanner.nextFloat();
		
		System.out.println("Informe o total arrecadado por vendas at� R$1.500: ");
		
		float mil = scanner.nextFloat();
		
		System.out.println("Informe o total arrecadado por vendas al�m de R$1.501: ");
		
		float mil1 = scanner.nextFloat();		
		scanner.close();
		
		double tres = (mil * 0.03);
		double oito = (mil1 * 0.08);
		
		double salarioTotal = (s + tres + oito);
		
		System.out.println("O sal�rio final do funcion�rio � de: "+salarioTotal);

	}

}
