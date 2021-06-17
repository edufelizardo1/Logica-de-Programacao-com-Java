package modulo3;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MININA_PARA_TIRAR_CARTEIRA = 18;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade: ");
		Integer idade = sc.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MININA_PARA_TIRAR_CARTEIRA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar a carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar a carteira.");
		}
		sc.close();
	}
}
