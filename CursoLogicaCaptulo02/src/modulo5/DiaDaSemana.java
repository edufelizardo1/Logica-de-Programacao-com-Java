package modulo5;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dias da Semana:");
		
		System.out.print("Digite um n�mero de 1 a 7 para saber qual dia da semana correspodente: ");
		Integer dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Digite um n�mero valido");
			break;
		}
		
		sc.close();
	}
	
	
}
