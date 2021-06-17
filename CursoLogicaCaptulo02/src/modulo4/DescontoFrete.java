package modulo4;

import java.util.Scanner;

public class DescontoFrete {

	static final double FRETE = 15;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Valor do produto: R$");
		double vl = sc.nextDouble();
		
		boolean frete = vl >= 100;
		
		if(frete) {
			System.out.println("Valor total: R$" + vl);
		} else {
			System.out.println("Valor + Frete: R$" + (vl + FRETE));
		}
		
		sc.close();
		
	}
}
