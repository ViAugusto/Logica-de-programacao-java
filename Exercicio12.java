/*O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
calcular e escrever o custo final ao consumidor.*/

package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Diga o custo de f�brica do carro: ");
		
		float cf /*custo de f�brica*/= scanner.nextFloat();
		
		float pd /*percentual do distribuidor*/= (cf * 28 / 100);
		
		float i /*impostos*/= (cf * (45 / 100));
		
		float cc /*custo do carro*/ = (cf + i + pd);
		
		System.out.println("O pre�o final �: R$:"+cc);
		
		scanner.close();
		
	}

}
