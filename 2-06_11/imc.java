import java.util.Scanner;

public class imc{

	public static void main (String[] args){

	Scanner insert = new Scanner (System.in);

		System.out.print("Digite seu peso: ");
		int peso = insert.nextInt();

		System.out.print("Digite sua altura: ");
		double altura = insert.nextDouble();

		double resultado = peso / (altura * altura);
		System.out.println("Seu IMC e: " + resultado);



	}

}