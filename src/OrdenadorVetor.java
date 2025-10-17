import java.util.Scanner;
import java.util.Arrays;

public class OrdenadorVetor {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i <= numeros.length - 1; i++){
            System.out.printf("Digite um número (%d/5):\n", i + 1);
            numeros[i] = t.nextInt();
        }
        Arrays.sort(numeros);
        for (int c = 0; c <= numeros.length - 1; c++){
            System.out.println(numeros[c]);
        }
    }
}