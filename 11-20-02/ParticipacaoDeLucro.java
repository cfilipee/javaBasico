import java.util.Scanner;

public class ParticipacaoDeLucro{

	static final Double META_FATURAMENTO_ANUAL = 500000.00;
	static final Double BONUS_MEDIA_SALARIAL = 450.60;
	//static final Double META_80 = 400000.00;
	
	public static void main(String[] args) {

		Scanner insert = new Scanner(System.in);

		System.out.print("Digite o faturamento do ano anterior: ");
		Double faturamentoReal = insert.nextDouble();

		Boolean atingiuMeta = faturamentoReal >= META_FATURAMENTO_ANUAL;
		Boolean atingiuMeta80 = faturamentoReal < META_FATURAMENTO_ANUAL && faturamentoReal >= META_FATURAMENTO_ANUAL * 0.8; 

		if (atingiuMeta) {
			System.out.println("Parabens! Voce atingiu a meta. Seu bonus eh de: " + BONUS_MEDIA_SALARIAL);
		
		} else if (atingiuMeta80) {
			System.out.println("Voce quase atingiu a meta! Seu bonus eh de: " + BONUS_MEDIA_SALARIAL * 0.8);
		
		} else {
			System.out.println("Voce nao atingiu a meta!");
		
		}
	

	insert.close();

	}

}