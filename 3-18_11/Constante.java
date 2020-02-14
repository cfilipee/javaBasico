import java.util.Scanner;

public class Constante{

	static final int IDADEMINIMA_PARA_TIRAR_CARTEIRA = 18;

	public static void main(String[] args) {
		
		Scanner insert = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = insert.nextInt();

		boolean podeTirarCarteira = idade >= IDADEMINIMA_PARA_TIRAR_CARTEIRA;

		if (podeTirarCarteira){
			System.out.println("Sim. Voce pode tirar carteira.");
		} else{
			System.out.println("Nao. Voce nao pode tirar carteira.");
		}

	}
}