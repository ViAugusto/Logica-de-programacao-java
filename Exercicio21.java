/*24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
ultrapassar este valor, calcular e escrever o seu salário total.*/

package exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o salário fixo do funcionário: ");
		
		float s = scanner.nextFloat();
		
		System.out.println("Informe o total arrecadado por vendas até R$1.500: ");
		
		float mil = scanner.nextFloat();
		
		System.out.println("Informe o total arrecadado por vendas além de R$1.501: ");
		
		float mil1 = scanner.nextFloat();		
		scanner.close();
		
		double tres = (mil * 0.03);
		double oito = (mil1 * 0.08);
		
		double salarioTotal = (s + tres + oito);
		
		System.out.println("O salário final do funcionário é de: "+salarioTotal);

	}

}
