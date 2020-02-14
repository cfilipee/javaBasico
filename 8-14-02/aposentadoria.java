import java.util.Scanner;

public class aposentadoria{

	public static void main(String[] args) {

		int idadeMinima = 55;
		int tempoDeContribuicao = 25;

		Scanner insert = new Scanner(System.in);
	
		System.out.print("Digite sua idade: ");
		idadeMinima = insert.nextInt();

		System.out.print("Digite seu tempo de contribuicao: ");
		tempoDeContribuicao = insert.nextInt();

		if ((idadeMinima >= 55) && (tempoDeContribuicao >= 25)){

		System.out.println("Voce esta apto a aposentadoria");

		} else{

			System.out.println("Voce nao cumpre os requisitos para aposentadoria");
		}

	}

}