/*Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
vendedor.*/

package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Voc� � dono de uma revendedora de carros e ir� decidir o sal�rio fict�cio de um funcion�rio.");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Diga o sal�rio fixo de seu funcion�rio: ");
		
		float sfixo = scanner.nextFloat();
		
		System.out.println("Diga quanto ele ganha por vendas.");
		
		float cvendas = scanner.nextFloat();
		
		System.out.println("Quantos carros ele conseguiu vender?: ");
		
		int carro = scanner.nextInt();
		
		System.out.println("Qual foi o valor total das vendas dele?: ");
		
		float totalvendas = scanner.nextFloat();
		
		/*float pc;*/
		
		float salariofinal = (sfixo + (cvendas * carro) + (totalvendas * 5/100));
		
		System.out.println("O sal�rio final do seu funcion�rio � de: R$"+salariofinal);
		scanner.close();

	}

}
