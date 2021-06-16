import java.util.Scanner;

public class CalcularValorTroco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor de produto: ");
		
		Double ValorProduto = sc.nextDouble();
		
		System.out.print("Digite um valor de valor passado pelo cliente: ");
		
		Double ValorPassadoPeloCliente = sc.nextDouble();
		
		
		Double resultado = ValorPassadoPeloCliente - ValorProduto;
		
		System.out.println("Valor de troco: " + resultado);
		
		sc.close();
	}
}
