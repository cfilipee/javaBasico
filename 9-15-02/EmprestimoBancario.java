public class EmprestimoBancario{

	public static void main(String[] args){

		Double salario = 2000.0;
		Double emprestimo = 4000.0;

		Boolean movimentaMetadeDoValor = true
		Boolean possuiTempoDeConta = true;
		Boolean temNomeLimpo = true;

		Boolean liberarEmprestimo = movimentaMetadeDoValor && possuiTempoDeConta && temNomeLimpo;

		if (liberarEmprestimo = salario * 2 ) {
			System.out.println("Pode liberar Emprestimo!");
		} else{
			System.out.println("Nao pode liberar Emprestimo!");
		}

	}

}