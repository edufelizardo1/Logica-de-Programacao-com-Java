package modulo4;

import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número:");
		double pri = sc.nextDouble();
		System.out.print("Entre com a operação (1 - soma, 2-subtração, 3 - divisão, 4"
				+ "- multiplicação: ");
		Integer ope = sc.nextInt();
		System.out.print("Digite o número:");
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
