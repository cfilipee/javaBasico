import java.util.Scanner;

public class Concurso{

		static final Integer NOTA_MINIMA_MATERIA = 60;
		static final Integer NOTA_MINIMA_TOTAL = 150;

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);

		System.out.print("Digite a nota de Portugues: ");
		Integer nota_pt = insert.nextInt();

		System.out.print("Digite a nota de Matematica: ");
		Integer nota_mt = insert.nextInt();

		Integer notaTotal = nota_pt + nota_mt;

		System.out.println("Sua nota e: " + notaTotal);

		Boolean notaAprova = ( notaTotal >= NOTA_MINIMA_TOTAL && nota_mt >= NOTA_MINIMA_MATERIA && nota_pt >= NOTA_MINIMA_MATERIA );

		 	if (notaAprova){
		 	System.out.println("Parabens! Voce foi aprovado.");

		  } else {
		    System.out.println("Reprovado! Continue tentando.");	

		    insert.close();
		}


	}

}