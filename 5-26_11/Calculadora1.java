import java.util.Scanner;

public class Calculadora1{

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		Double primeiroNumero = insert.nextDouble();

		System.out.print("Digite 1 para (+) 2 para (-) 3 (*) 4 (/): ");
		Integer operacaoEscolhida = insert.nextInt();

		System.out.print(operacaoEscolhida + " Foi a operacao escolhida.");

		System.out.print("\nDigite o segundo numero: ");
		Double segundoNumero = insert.nextDouble();

		Boolean adicao = operacaoEscolhida.equals(1);
		Boolean subtracao = operacaoEscolhida.equals(2);
		Boolean multiplicacao = operacaoEscolhida.equals(3);
		Boolean divisao = operacaoEscolhida.equals(4);

		Double resultado = null;

		if(adicao) {		

			resultado = primeiroNumero + segundoNumero;	

		}  if (subtracao) {
			
			 resultado = primeiroNumero - segundoNumero;

		}  if (multiplicacao) {
			
			 resultado = primeiroNumero * segundoNumero;

		}  if (divisao) {
			
			 resultado = primeiroNumero / segundoNumero;
		}	 	 

		System.out.println("O resultado e " + resultado);
	}

}