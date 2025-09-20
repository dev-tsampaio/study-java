import java.util.Scanner;

public class usandoSwitch {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo

        Scanner sc = new Scanner(System.in); // Chamando uma entrada de valor no cmd
        Integer dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;

            default:
                System.out.println("Dia invalido");
        }



        sc.close(); // fechamento da entrada de valores
    }
}
