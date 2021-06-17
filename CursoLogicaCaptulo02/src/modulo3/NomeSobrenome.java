package modulo3;

import java.util.Scanner;

public class NomeSobrenome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.println("Seu nome completo é " + nome + " " + sobrenome);
		
		sc.close();
	}
}
