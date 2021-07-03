/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.*/

package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Diga o custo de fábrica do carro: ");
		
		float cf /*custo de fábrica*/= scanner.nextFloat();
		
		float pd /*percentual do distribuidor*/= (cf * 28 / 100);
		
		float i /*impostos*/= (cf * (45 / 100));
		
		float cc /*custo do carro*/ = (cf + i + pd);
		
		System.out.println("O preço final é: R$:"+cc);
		
		scanner.close();
		
	}

}
