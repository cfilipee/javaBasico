import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args){

		Scanner insert = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		Double peso = insert.nextDouble();

		Boolean pesoLeve = peso <= 60;
		//Boolean pesoMedio = peso > 60 && peso <= 90;
		//Boolean pesoPesado = peso > 90;

		if (pesoLeve) {
			System.out.print("Peso Leve!");
		} else {

			Boolean pesoMedio = peso > 60 && peso <= 90;
			
			if (pesoMedio) {
				System.out.print("Peso Medio! ");
			} else {

					Boolean pesoPesado = peso > 90;

					if (pesoPesado) {
						System.out.print("Peso Pesado! ");
						}

					}

		}

		insert.close();
	}

}