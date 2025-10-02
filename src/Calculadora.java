import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = keyboard.nextInt();
        int parouimpar = numero / 2;
        double yoCube1 = numero;
        double exp1 = 3;
        if (parouimpar == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
        double raiz = Math.sqrt(numero);
        double cube2 = Math.pow(yoCube1, exp1);
        double cubic = Math.cbrt(numero);
        double absolute = Math.abs(numero);
        System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        System.out.printf("O número " + numero + " elevado ao cubo é: %.2f\n", cube2);
        System.out.printf("A raiz cúbica de " + numero + " é: %.2f\n", cubic);
        System.out.printf("O valor absoluto de: " + numero + " é %.0f", absolute);
    }
}