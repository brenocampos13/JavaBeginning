import java.util.Scanner;

public class Tabuada2 {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int contador = 1;
        System.out.println("Digite um número:");
        int numero = t.nextInt();

        while (contador <= 10){
            int n1 = numero * contador;
            System.out.printf("%d x %d = %d\n", numero, contador, n1);
            contador++;
        }
    }
}
