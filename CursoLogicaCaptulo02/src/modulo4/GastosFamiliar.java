package modulo4;

import java.util.Scanner;

public class GastosFamiliar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o valor da conta de luz: R$ ");
		double contas = sc.nextDouble();
		System.out.print("Entre com o valor da conta de água: R$ ");
		contas += sc.nextDouble();
		System.out.print("Entre com o valor da conta de telefone: R$ ");
		contas += sc.nextDouble();
		System.out.print("Entre com o valor da escola do filho: R$ ");
		contas += sc.nextDouble();
		System.out.print("Entre com o valor da fatura do cartão: R$ ");
		contas += sc.nextDouble();
		System.out.print("Entre com o valor de gasto com supermercdo: R$ ");
		contas += sc.nextDouble();
		
		System.out.println();
		System.out.println("Valor total de despesas: R$ " + contas);
		
		sc.close();
	}
}
