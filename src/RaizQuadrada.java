import java.util.Scanner;
import java.math.MathContext;
import java.lang.Math;

public class RaizQuadrada {
    static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Vamos calcular a raiz quadrada!");
        System.out.println("Digite um número: ");
        double numero = teclado.nextInt();
        double total = Math.sqrt(numero);
        System.out.printf("A raiz quadrada de %.2f é: %.2f\n", numero, total);
    }
}