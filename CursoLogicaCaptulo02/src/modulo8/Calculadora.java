package modulo8;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*Entra com dados para a opea��o*/
		System.out.print("Enter com o primeiro n�mero: ");
		double p = sc.nextDouble();

		System.out.print("Enter com o segundo n�mero: ");
		double s = sc.nextDouble();
		
		/*Apresenta as op��es*/
		lista();
		
		int i = sc.nextInt();
		
		/*Chama o m�todo de chaves*/
		chave(i, p, s);

		sc.close();
	}
	
	/*Op��es*/
	static void lista() {
		System.out.println();
		System.out.println("Escolha a opera��o:");
		System.out.println("1-Soma:");
		System.out.println("2-Subtra��o:");
		System.out.println("3-Divis�o:");
		System.out.println("4-Multiplica��o:");
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
			System.out.println("Escolha uma op��o valida.");
			break;
		}
	}
	
	/*Soma*/
	static double getSoma(double p, double s) {
		double soma = p + s;

		return soma;
	}

	/*Subtra��o*/
	static double getSubtracao(double p, double s) {
		double subtracao = p - s;

		return subtracao;
	}

	/*Divis�o*/
	static double getDivisao(double p, double s) {
		double divisao = p / s;

		return divisao;
	}

	/*Multiplica��o*/
	static double getMultiplicacao(double p, double s) {
		double multiplicacao = p * s;

		return multiplicacao;
	}

}
