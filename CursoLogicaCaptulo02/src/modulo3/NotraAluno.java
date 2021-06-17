package modulo3;

import java.util.Scanner;

public class NotraAluno {

	static final Integer NOTA = 70;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double n = sc.nextDouble();
		
		Boolean passou = n >= NOTA ;
		
		if(passou) {
			System.out.println("O aluno passou.");
		} else {
			System.out.println("O aluno não passou.");
		}
		sc.close();
	}
}
