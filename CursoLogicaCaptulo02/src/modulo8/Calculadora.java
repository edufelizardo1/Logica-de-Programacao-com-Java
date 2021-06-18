package modulo8;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter com o primeiro n�mero: ");
		double p = sc.nextDouble();

		System.out.print("Enter com o segundo n�mero: ");
		double s = sc.nextDouble();

		System.out.println();
		System.out.println("Escolha a opera��o:");
		System.out.println("1-Soma:");
		System.out.println("2-Subtra��o:");
		System.out.println("3-Divis�o:");
		System.out.println("4-Multiplica��o:");
		int i = sc.nextInt();

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

		sc.close();
	}

	static double getSoma(double p, double s) {
		double soma = p + s;

		return soma;
	}

	static double getSubtracao(double p, double s) {
		double soma = p - s;

		return soma;
	}

	static double getDivisao(double p, double s) {
		double soma = p / s;

		return soma;
	}

	static double getMultiplicacao(double p, double s) {
		double soma = p * s;

		return soma;
	}

}
