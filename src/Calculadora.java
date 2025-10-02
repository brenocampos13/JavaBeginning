import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        int parouimpar = numero / 2;
        double aoCubo1 = numero;
        double expoente = 3;
        if (parouimpar == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
        double raiz = Math.sqrt(numero);
        double aoCubo2 = Math.pow(aoCubo1, expoente);
        double cubico = Math.cbrt(numero);
        double absoluto = Math.abs(numero);
        System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        System.out.printf("O número " + numero + " elevado ao cubo é: %.2f\n", aoCubo2);
        System.out.printf("A raiz cúbica de " + numero + " é: %.2f\n", cubico);
        System.out.printf("O valor absoluto de: " + numero + " é %.0f", absoluto);
    }
}