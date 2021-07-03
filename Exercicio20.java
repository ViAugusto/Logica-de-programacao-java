/* 22) A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais 
de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. 
Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva 
o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o m�s possua 4 semanas exatas). */

package exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quantas horas o funcion�rio trabalhou ao m�s: ");
		
		int horaTotal = scanner.nextInt();
		
		System.out.println("Digite o sal�rio por hora: ");
		
		int salarioHora = scanner.nextInt();
		
		scanner.close();
		
		if (horaTotal == 160) {
			int salario = horaTotal * salarioHora;
			System.out.println("O sal�rio total dele � igual a: "+salario);
			
		} else {
			int horaExtra = horaTotal - 160; /*aqui eu calculo quantas horas extras ele trabalhou.*/
			int salarioHoraExtra = salarioHora * 50/100; /*vari�vel para descobrir o valor recebido por hora extra*/
			int salarioExtra = horaExtra * salarioHoraExtra; /*descobrir quanto ele ganhou em hora extra*/
			int salarioFinal = salarioExtra + (horaTotal * salarioHora );
			
			System.out.println("Ele recebeu ao total R$"+salarioFinal);
		}
	}

}
