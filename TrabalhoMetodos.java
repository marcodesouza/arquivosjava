//////////////////////// 8< /////////////////////////
package FuncoesMetodos;

import java.util.Scanner;

public class TrabalhoMetodos {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        //int numeros[] = {5, 13, 2, 7, 11, 14, 6};
        int numeros[] = new int[10];
        String Numeros[] = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto", "Sexto", "Setimo", "Oitavo", "Nono", "Decimo"};
        int numeros_ordenados[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + Numeros[i] + " numero: ");
            numeros[i] = r.nextInt();
        }

        // imprime os numeros na sequência em que foram lidos
        System.out.println("\nOs Numeros digitados foram:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        //ordena o vetor "numeros[]" chamando o método BubbleSort
        //o resultado vai ser armazenado no vetor "numeros_ordenado[]"
        numeros_ordenados = BubbleSort(numeros);

        // imprime os numeros ordenados
        System.out.println("\nOrdenados ficam:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros_ordenados[i] + " ");
        }

        System.out.println();

    }

    //inicio do método BubbleSort
    public static int[] BubbleSort(int V[]) {
        int aux = 0;
        for (int i = 0; i < V.length - 1; i++) {
            for (int j = 0; j < V.length - 1; j++) {
                if (V[j] > V[j + 1]) {
                    aux = V[j];
                    V[j] = V[j + 1];
                    V[j + 1] = aux;
                }
            }
        }
        return V;
    } // fim do método BubbleSort
}

