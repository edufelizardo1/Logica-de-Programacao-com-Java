package modulo3;

import java.util.Scanner;

public class ValorTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o o usuário: ");
		String n = sc.next();
		System.out.print("Digite o Valor do produto:");
		Double vp = sc.nextDouble();
		System.out.print("Informe a quantidade do produto:");
		Integer q = sc.nextInt();
		
		Double subTotal = vp * q;
		
		if (q >= 10) {
			Double dc = subTotal - (subTotal * 0.1);
			System.out.println("Usuário: " + n);
			System.out.println("Total: " + dc);
		} else {
			System.out.println("Usuário: " + n);
			System.out.println("Total: " + subTotal);
		}
		sc.close();
	}
}
