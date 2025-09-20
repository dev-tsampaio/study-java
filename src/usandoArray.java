import java.util.Arrays;

public class usandoArray {
    public static void main(String[] args) {
        Integer[] idades = new Integer[3]; // Criada uma lista chamada "idades" que recebe valores inteiros = aloca 3 posições na lista.
        idades[0] = 21; // posição 0 recebe 21
        idades[1] = 22; // posição 1 recebe 22
        idades[2] = 23; // posição 2 recebe 23

        System.out.println(Arrays.toString(idades)); // Imprimir a lista inteira, covertendo idades(Integer) para string.
        System.out.println(idades[0]); //Imprimi o indice 0 da lista.
        System.out.println(); // ESPAÇO vazio no terminal

        for (int i=0; i<idades.length; i++){ // Repita de 0 até o tamanho do array, i for menor que 3 .
            System.out.println(idades[i]);
        }
        System.out.println(); // ESPAÇO vazio no terminal

        Integer[] numeros = new Integer[]{1,2,3,4,5}; // Declada a lista de Inteiros que ja vai receber os valores
        for(int i=0; i<numeros.length; i++){ // Repita de 0 até o tamanho do array, i for menor que 4 .
            System.out.println(numeros[i]);
        }
        System.out.println(); // ESPAÇO vazio no terminal

        for(int num : numeros){  // For each (int num é uma varivel local, vai percorrer a lista numeros)
            System.out.println(num); // Imprima valores de num
        }


    }
}
