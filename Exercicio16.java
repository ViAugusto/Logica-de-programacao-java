//Solicita o nome, sexo do aluno e suas 4 notas. Ao final exibe o nome, sexo e a média aritmética do aluno. Efetuar esse calculo 3 vezes.

package exercicios;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[]args) {
		
	int cont = 0;
	while (cont<=3){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Diga o nome do aluno: ");
		
		String nome = scanner.next();
		
		System.out.println("Diga o sexo do aluno (F ou M): ");
		
		String sexo = scanner.next();
		
		System.out.println("Diga sua primeira nota: ");
		
		float nota1 = scanner.nextFloat();
		
		System.out.println("Diga sua segunda nota: ");

		float nota2 = scanner.nextFloat();
		
		System.out.println("Diga sua terceira nota: ");
		
		float nota3 = scanner.nextFloat();
		
		System.out.println("Diga sua quarta nota: ");
		
		float nota4 = scanner.nextFloat();
		
		System.out.println("Qual a nota mínima para o aluno ser aprovado?");
		
		float min = scanner.nextFloat();
		scanner.close();
		
		float media = (nota1 + nota2 + nota3 + nota4 ) / 4;
		
		if(media < min) {
			if(sexo == "F") {
				System.out.println("A "+nome+", do sexo "+sexo+", foi reprovada na matéria com uma média de: "+media);	
			}
			System.out.println("O "+nome+", do sexo "+sexo+", foi reprovado na matéria com uma média de: "+media);
		}
		else {
			if(sexo == "F") {
				System.out.println("A "+nome+", do sexo "+sexo+", foi aprovada na matéria com uma média de: "+media);	
			}
			System.out.println("O "+nome+", do sexo "+sexo+", foi aprovado na matéria com uma média de: "+media);
			}
		
		cont++;
		}
	}
}