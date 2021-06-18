package modulo7;

import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Digite " + (i + 1) + "° tarefa: ");
			tarefas[i] = sc.nextLine();
		}
		
		System.out.println();
		
		int i = 0;
		
		while (i < tarefas.length) {
			System.out.println((i +1) + "° tarefa: " + tarefas[i]);
			i++;
		}
		sc.close();
	}
}
