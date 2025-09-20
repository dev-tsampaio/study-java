import java.util.Scanner;

public class usandoWhile {
    public static void main(String[] args) {
        // While = Enquanto ...
        Scanner sc = new Scanner(System.in);

        String senha = "devjava"; // defino uma senha que será de acesso ao servidor
        int tentativas = 3; // defino um numero de tentativas de acesso

        while(tentativas>0){ // "Enquanto tentativas for maior que 0, execute ....
            System.out.print("Digite a senha para ter acesso ao servidor:");
            String senhaDigitada = sc.next(); // Recebe a senha digitada no console.
            if (senhaDigitada.equals(senha)){ // "Se senhaDigitada for igual a senha, acesso liberado !" .equals = igual ( Tipo String ).
                System.out.println("Acesso ao servidor liberado!");
                break; // para o sistema, para o while.
            } else { // Se não , senha incorreta!
                System.out.println("Senha incorreta!");
                tentativas--; // Numero de tentativas abaixa a cada vez que você digita a senha errada.
                System.out.println("Você possui ("+tentativas+") restantes!"); // Retorna ao usuario quantas tentativas ainda le resta.
            }
            if(tentativas==0){ // Se tentativas for igual a 0 , acesso bloqueado! Tentativas esgotadas.
                System.out.println("Acesso bloqueado! Numero de tentativas esgotado");
                break;
            }
        }

        sc.close();
    }
}
