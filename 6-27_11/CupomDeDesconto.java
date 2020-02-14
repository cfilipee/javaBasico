
public class CupomDeDesconto{

	public static void main(String[] args){

		boolean periodoDePromocao = true;
		boolean carrinhoMaior100 = false;

		boolean aplicarDesconto = periodoDePromocao && carrinhoMaior100;

		if (aplicarDesconto) {
			
			System.out.println("Sim! Desconto concedido.");
		} else {
			System.out.println("Nao! Voce nao possui desconto.");
		}

	}

}