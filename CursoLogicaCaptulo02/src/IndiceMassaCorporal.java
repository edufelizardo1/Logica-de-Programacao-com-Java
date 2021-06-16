import java.util.Scanner;

public class IndiceMassaCorporal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		Double p = sc.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double a = sc.nextDouble();
		
		Double imc = p / (a*a);
		
		System.out.println("O seu IMC é " + imc + " kg/m");
	}
}
