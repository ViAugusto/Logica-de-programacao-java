/* 22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais 
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o mês possua 4 semanas exatas). */

package exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quantas horas o funcionário trabalhou ao mês: ");
		
		int horaTotal = scanner.nextInt();
		
		System.out.println("Digite o salário por hora: ");
		
		int salarioHora = scanner.nextInt();
		
		scanner.close();
		
		if (horaTotal == 160) {
			int salario = horaTotal * salarioHora;
			System.out.println("O salário total dele é igual a: "+salario);
			
		} else {
			int horaExtra = horaTotal - 160; /*aqui eu calculo quantas horas extras ele trabalhou.*/
			int salarioHoraExtra = salarioHora * 50/100; /*variável para descobrir o valor recebido por hora extra*/
			int salarioExtra = horaExtra * salarioHoraExtra; /*descobrir quanto ele ganhou em hora extra*/
			int salarioFinal = salarioExtra + (horaTotal * salarioHora );
			
			System.out.println("Ele recebeu ao total R$"+salarioFinal);
		}
	}

}
