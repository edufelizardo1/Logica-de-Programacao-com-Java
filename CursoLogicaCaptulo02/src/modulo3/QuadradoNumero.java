package modulo3;

import java.util.Scanner;

public class QuadradoNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero real: ");
		Double r = sc.nextDouble();

		Double q = Math.pow(r, 2);
		
		System.out.println("O quadrado do n�mero: " + q);
		
		sc.close();
	}
}
