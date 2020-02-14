import java.util.Scanner;

public class frete{

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);

		Double valorFrete = 15.00;

		System.out.print("Digite o valor do produto: ");
		Double valorProduto = insert.nextDouble();

		if(valorProduto >= 100){
			valorFrete = 0.0;
		}

		Double valorFinal = valorProduto + valorFrete;

		System.out.print("O valor total da sua compra e de: " + valorFinal);

	}

}