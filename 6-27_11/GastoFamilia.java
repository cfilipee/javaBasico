import java.util.Scanner;

public class GastoFamilia{

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);

		System.out.print("Digite o valor da luz: ");
		Double valorLuz = insert.nextDouble();

		System.out.print("Digite o valor da agua: ");
		Double valorAgua = insert.nextDouble();

		System.out.print("Digite o valor do telefone: ");
		Double valorTelefone = insert.nextDouble();

		System.out.print("Digite o valor da escola do filho: ");
		Double valorEscolaFilho = insert.nextDouble();

		System.out.print("Digite o valor da fatura do cartao: ");
		Double valorFaturaCartao = insert.nextDouble();

		System.out.print("Digite o valor do super mercado: ");
		Double valorSuperMercado = insert.nextDouble();

		Double valorTotal = valorLuz += valorAgua += valorTelefone += valorEscolaFilho += valorFaturaCartao += valorSuperMercado;

		System.out.println("O valor total das suas dividas e: " + valorTotal);


	}

}