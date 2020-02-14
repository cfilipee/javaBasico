import java.util.Scanner;

public class frete2{

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);


		System.out.print("Digite o valor do produto: ");
		Double valorProduto = insert.nextDouble();

		Boolean precisoCobrarFrete = valorProduto >= 100;

		if(precisoCobrarFrete){
			valorProduto += 15.0;
		}

		//Double valorFinal = valorProduto + valorFrete;

		System.out.print("O valor total da sua compra e de: " + valorProduto);

	}

}