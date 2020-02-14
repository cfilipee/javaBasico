import java.util.Scanner;

public class variavel {

    
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double valorProduto = entrada.nextDouble();

       // System.out.println("O valor do produto: " + valorProduto);


        System.out.print("Digite (1) para pagamento a vista ou (2) para pagamento a prazo: ");
        Integer tipoPagamento = entrada.nextInt(); 

        final boolean pagamentoAvista = tipoPagamento.equals(1);        
       

        double juros = 0.0; // A variável 'Juros' necessita ser declarada (Qual o seu tipo)antes de ser usada em uma condição IF.
                            // Por isso, não há necessidade de declará-la novamente dentro de uma condição.
                            //Porém, eu não posso usá-la dentro de uma condição sem antes declará-la.

        if (!pagamentoAvista){
            juros = 10.0;
        } 

        Double acrescimo = valorProduto * juros / 100;
        Double valorTotal = acrescimo + valorProduto;

        System.out.println("O valor da compra eh: " + valorTotal);

        entrada.close();
    
    }
}