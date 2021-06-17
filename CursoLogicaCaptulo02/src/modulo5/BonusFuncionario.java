package modulo5;

import java.util.Scanner;

public class BonusFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a meta de faturamento: ");
		Double meta = sc.nextDouble();
		System.out.print("Entre com a meta de faturamento: ");
		Double faturamento = sc.nextDouble();
		System.out.print("Entre com a meta de faturamento: ");
		Double media = sc.nextDouble();
		
		Double oitenta = (meta * .8);
		Boolean META = faturamento >= meta;
		Boolean OITENTA = faturamento >= oitenta && faturamento < meta;
		
		if(META) {
			System.out.println("Valor a receber de bônus: R$ " + media);
		}else if (OITENTA) {
			System.out.println("Valor a receber de bônus: R$ " + (media * 0.8));
		} else {
			System.out.println("Não hávera bonificação.");
		}
		sc.close();
	}
}
