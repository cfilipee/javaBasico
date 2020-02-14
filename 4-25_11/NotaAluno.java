import java.util.Scanner;

public class NotaAluno{

	static final double NOTA_MINIMA = 7.0;

	public static void main(String[] ars){


		Scanner insert = new Scanner(System.in);

		System.out.print("Digite a sua nota: ");
		double nota = insert.nextDouble();

		boolean aprovado = nota >= NOTA_MINIMA;

		if (aprovado){
			System.out.println("Parabens! Voce foi aprovado.");
		} else {
			System.out.println("Reprovado!");
		}

	}

}