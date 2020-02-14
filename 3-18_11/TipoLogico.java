import java.util.Scanner;
public class TipoLogico{

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = insert.nextInt();


		final int idadeParaTirarCarteira = 18;

		
		Boolean podeTirarCarteira = idade >= idadeParaTirarCarteira;


		if (podeTirarCarteira) {
			System.out.println("Sim, Ele pode tirar carteira.");
		} 	else {
			System.out.println("Nao. Ele nao pode tirar carteira.");
		}

	}

}