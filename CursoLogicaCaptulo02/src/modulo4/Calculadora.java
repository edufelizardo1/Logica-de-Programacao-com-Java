package modulo4;

import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero:");
		double pri = sc.nextDouble();
		System.out.print("Entre com a opera��o (1 - soma, 2-subtra��o, 3 - divis�o, 4"
				+ "- multiplica��o: ");
		Integer ope = sc.nextInt();
		System.out.print("Digite o n�mero:");
		double sec = sc.nextDouble();
	
		double soma = pri + sec;
		double sub = pri - sec;
		double div = pri / sec;
		double mult = pri * sec;
		
		if (ope == 1) {
			System.out.println("Valor: " + soma);
		} else if (ope == 2) {
			System.out.println("Valor: " + sub);
		} else if (ope == 3) {
			System.out.println("Valor: " + div);
		} else {
			System.out.println("Valor: " + mult);
		}
		
		sc.close();
	}
}
