public class exercicioEstruturaDeRepetição {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000;

        double valorTotal = 30000; // Definido o valor do carro.

        for (int parcela = 1; parcela <= valorTotal; parcela++){ // int parcela = 1 (primeira parcela do carro)
            double valorParcela = valorTotal / parcela; // difinindo a logica do valor da parcela

                if(valorParcela < 1000){ // Se valorParcela for menor que 1000 ele para o sistema
                    break;
                }
                 System.out.printf(">(%d) Parcelas de R$ %.2f%n", parcela, valorParcela); // Imprima os possiveis parcelamentos ( Acima de 1000 reais ).


                    // Mesma estrutura porem mais verboso...
              /*  if(valorParcela >= 1000){ // Se valorParcela for maior ou igual a 1000,
                    System.out.printf(">(%d) Parcelas de R$ %.2f%n", parcela, valorParcela); // Imprima os possiveis parcelamentos ( Acima de 1000 reais ).
                } else {
                    break; // Se não for maior que 1000, pare o sistema.
                }*/
        }


    }
}
