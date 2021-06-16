package modulo3;

import java.util.Scanner;

public class NotraAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double n = sc.nextDouble();
		
		Boolean p;
		
		if(n >= 7) {
			p = true;
		} else {
			p = false;
		}
		
		if(p == true) {
			System.out.println("O aluno passou.");
		} else {
			System.out.println("O aluno não passou.");
		}
		sc.close();
	}
}
