import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class PraticaVetores {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] numeros = new int [5];
        int par = 0;
        int impar = 0;
        for (int i = 0; i <= numeros.length - 1; i++){
            System.out.printf("Digite um valor (%d/5):", i + 1);
            numeros[i] = t.nextInt();
            System.out.println(numeros[i]);
            if (numeros[i] % 2 == 0){
                par += 1;
            } else {
                impar += 1;
            }
        }
        for (int x = 0; x <= numeros.length - 1; x++){
            System.out.print(numeros[x] + " ");
        }
        System.out.printf("Foram digitados %d número(s) par(es) e %d número(s) impar(es)!", par, impar);
    }
}