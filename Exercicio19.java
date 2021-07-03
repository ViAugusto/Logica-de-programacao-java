/*21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é 
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */

package exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Que horas começou o jogo? (informe apenas o número da hora, entre 0 até 23");
		
		int inicio = scanner.nextInt();
		
		System.out.println("Que horas acabou o jogo? (mesmo esquema seu bobo) ");
		
		int fim = scanner.nextInt();
		scanner.close();
		
		if (inicio < fim ) {
			int tempoTotal = fim - inicio;
			System.out.println("O tempo total de jogo foi de: "+tempoTotal);
			
		} else {
			while (inicio < 24) {
				
				
			}

		}
		
	}

}
