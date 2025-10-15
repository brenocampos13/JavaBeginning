import java.util.Arrays;
import java.util.Scanner;

public class Vetores2 {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o tamanho do array:");
        int tam = t.nextInt();
        int[] n = new int [tam];
        System.out.println("Digite o valor inicial do array:");
        int valor = t.nextInt();
        Arrays.fill(n, valor);
        System.out.printf("Criamos a array com %d casas e todas com o número %d como inicial!\n", tam, valor);
        for (int i: n){
            System.out.print(valor + " ");
        }
    }
}