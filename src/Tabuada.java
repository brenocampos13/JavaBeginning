import java.util.Scanner;

public class Tabuada {
    static void main() {
        int contador = 1;
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número para calcular:");
        String numero = t.nextLine();
        int numero1 = Integer.parseInt(numero);
        int number = numero1;
        while (contador <= 10){
            int n1 = numero1 * contador;
            System.out.printf("%d x %d = %d\n", numero1, contador, n1);
            contador++;
        }
    }
}