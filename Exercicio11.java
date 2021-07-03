package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos eleitores votaram em seu município? (guarde esse valor para a conta funcionar!): ");
		
		float total = scanner.nextFloat();
		
		System.out.println("Desses "+total+" eleitores, quantos votaram branco?: ");
		
		float branco = scanner.nextFloat();
		
		float menosbranco = total - branco;
		
		System.out.println("Desses "+menosbranco+" restantes, quantos votaram nulo?: ");
		
		float nulo = scanner.nextFloat();
		
		float menosnulo = menosbranco - nulo;
		
		System.out.println("Desses "+menosnulo+", quantos tiveram seus votos válidos?: ");
		
		float valido = scanner.nextFloat();
		
		float menosvalido = menosnulo - valido;
		
		scanner.close();
		
		if (menosvalido != 0) {
			
			System.out.println("Houve uma falha na informação dos dados.");
		}
		else {
			float pv = (valido / total) * 100;
			float pb = (branco / total) * 100;
			float pn = (nulo / total) * 100;
			
			System.out.println("Tiveram ao total "+pv+"% de votos válidos");
			System.out.println("Tiveram ao total "+pb+"% de votos brancos");
			System.out.println("Tiveram ao total "+pn+"% de votos nulos");
		}
		

	}

}
