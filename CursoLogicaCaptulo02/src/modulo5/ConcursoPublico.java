package modulo5;

import java.util.Scanner;

public class ConcursoPublico {

	static final Double MATERIAS = 60.0;
	static final Double NOTA_FINAL = 150.0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota de português: ");
		Double portugues = sc.nextDouble();
		System.out.print("Digite a nota de matematica: ");
		Double matematica = sc.nextDouble();
		
		Double somaNota = portugues + matematica;
		
		Boolean notaFinal = somaNota >= NOTA_FINAL;
		Boolean materiaPortugues = portugues >= MATERIAS;
		Boolean materiaMatematica = matematica >= MATERIAS;
		
		if(notaFinal && (materiaMatematica && materiaPortugues)) {
			System.out.println("Passou no concurso publico");
		} else {
			System.out.println("Não passou no concurso publico");
		}
		
		sc.close();
	}
}
