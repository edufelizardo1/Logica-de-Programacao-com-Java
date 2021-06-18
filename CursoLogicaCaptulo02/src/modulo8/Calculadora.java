package modulo8;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*Entra com dados para a opeação*/
		System.out.print("Enter com o primeiro número: ");
		double p = sc.nextDouble();

		System.out.print("Enter com o segundo número: ");
		double s = sc.nextDouble();
		
		/*Apresenta as opções*/
		lista();
		
		int i = sc.nextInt();
		
		/*Chama o método de chaves*/
		chave(i, p, s);

		sc.close();
	}
	
	/*Opções*/
	static void lista() {
		System.out.println();
		System.out.println("Escolha a operação:");
		System.out.println("1-Soma:");
		System.out.println("2-Subtração:");
		System.out.println("3-Divisão:");
		System.out.println("4-Multiplicação:");
	}

	/*Chaves*/
	static void chave(int i, double p, double s) {
		switch (i) {
		case 1:
			System.out.println("Resutado: " + getSoma(p, s));
			break;
		case 2:
			System.out.println("Resutado: " + getSubtracao(p, s));
			break;
		case 3:
			System.out.println("Resutado: " + getDivisao(p, s));
			break;
		case 4:
			System.out.println("Resutado: " + getMultiplicacao(p, s));
			break;
		default:
			System.out.println("Escolha uma opção valida.");
			break;
		}
	}
	
	/*Soma*/
	static double getSoma(double p, double s) {
		double soma = p + s;

		return soma;
	}

	/*Subtração*/
	static double getSubtracao(double p, double s) {
		double subtracao = p - s;

		return subtracao;
	}

	/*Divisão*/
	static double getDivisao(double p, double s) {
		double divisao = p / s;

		return divisao;
	}

	/*Multiplicação*/
	static double getMultiplicacao(double p, double s) {
		double multiplicacao = p * s;

		return multiplicacao;
	}

}
