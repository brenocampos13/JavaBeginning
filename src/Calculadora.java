import java.util.Scanner;

public class Calculadora{
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a number: ");
        String numero1 = keyboard.nextLine();
        int numero = Integer.parseInt(numero1);
        double raiz = Math.sqrt(numero);
        double cubic = Math.cbrt(numero);
        double absolut = Math.abs(numero);
        Parouimpar(numero);
        Expoente(numero);
        System.out.printf("A raiz de %d é igual á %.2f\n", numero, raiz);
        System.out.printf("A raiz cúbica de %d é igual á %.2f\n", numero, cubic);
        System.out.printf("O número absoluto de %d é igual á %.0f\n", numero, absolut);
    }
    public static void Parouimpar(int numero){
        if (numero % 2 == 0){
            System.out.printf("O número %d é par!\n", numero);
        } else {
            System.out.printf("O número %d é par!\n", numero);
        }
    }
    public static void Expoente(double numero){
        double expoente = 3;
        double cube2 = Math.pow(numero, expoente);
        System.out.printf("O %.0f elevado á %.0f é igual á %.3f\n", numero, expoente, cube2);
    }
}