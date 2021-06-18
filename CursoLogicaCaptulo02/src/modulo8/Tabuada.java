package modulo8;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor que você deseja descobrir a tabuada: ");
		int i = sc.nextInt();
		
		tabuada(i);
		
		sc.close();
	}
	
	static void tabuada(int j) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(j + " X " + i + " = " + j * i);
		}
	}
}
