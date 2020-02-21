import java.util.Scanner;

public class MMA {

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		Double peso = insert.nextDouble();

		Boolean pesoLeve = peso <= 60;
		Boolean pesoMedio = peso > 60 && peso <= 90;
		Boolean pesoPesado = peso > 90 && peso <= 140;

		if  (pesoLeve) {
			System.out.println("Sua Categoria eh leve!");
		} else if (pesoMedio) {
			System.out.println("Sua Categoria eh Medio!");
		} else if (pesoPesado) {
			System.out.println("Sua Categoria eh Pesado!");
		} else {
			System.out.println("Vc nao se enquadra em nenhuma categoria!");
		}

		insert.close();
	}

}