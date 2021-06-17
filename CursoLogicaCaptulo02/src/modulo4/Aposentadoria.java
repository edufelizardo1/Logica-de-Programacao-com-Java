package modulo4;

import java.util.Scanner;

public class Aposentadoria {

	static final Integer IDADE = 55;
	static final Integer CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a idade: ");
		Integer idade = sc.nextInt();
		System.out.print("Entre com tem de contribuição: ");
		Integer contribuicao = sc.nextInt();
		
		boolean faixaEtaria = idade >= IDADE;
		boolean faixaContribuicao = contribuicao >= CONTRIBUICAO;
		
		if(faixaEtaria && faixaContribuicao) {
			System.out.println("Pode se aposentar.");
		} else {
			System.out.println("Não pode se aposentar.");
		}
		
		sc.close();
	}
}
