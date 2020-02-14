import java.util.Scanner;
public class CalculoRaizQuadrada{

	public static void main(String[] args) {
	
	Scanner insert = new Scanner(System.in);

		System.out.print("Digite o numero: ");
		int numero = insert.nextInt();

		System.out.println("A raiz quadrada e: " + numero*numero);


	}

}