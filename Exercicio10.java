package exercicios;

import java.util.*;

public class Exercicio10 {
	
	public static void main(String[]args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o seu salário:");
			
			float salario = sc.nextFloat();
			
			System.out.println("Digite o percentual de ajuste:");
			
			float percentual = sc.nextFloat();
			sc.close();
			
			float salarioFinal = (salario + (salario*(percentual/100)) );
			
			System.out.println("O reajuste de "+percentual+"% é igual a: "+salarioFinal+" reais");
		
		
		
	}

}
