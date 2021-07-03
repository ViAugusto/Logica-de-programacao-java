package exercicios;

public class Exercicio15 {
	
	public static void main(String[]args) throws InterruptedException {
		
		for(int seg = 59; seg>=0; seg--){ //roda primeira vez
			for(int min = 59; min>=0; min--) { //roda a segunda vez

				System.out.println(seg+":"+min);
				Thread.sleep(500);
			}
		}
	}
}
