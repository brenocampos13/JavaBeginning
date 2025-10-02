import java.util.Scanner;

public class Calculadora{
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a number: ");
        String numero1 = keyboard.nextLine();
        int numero = Integer.parseInt(numero1);
        float parouimpar = numero % 2;
        double expoente = 3;
        if (parouimpar == 0){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
        double raiz = Math.sqrt(numero);
        double cube2 = Math.pow(numero, expoente);
        double cubic = Math.cbrt(numero);
        double absolut = Math.abs(numero);
        System.out.printf("A raiz de %d é igual á %.2f\n", numero, raiz);
        System.out.printf("O %d elevado á %.0f é igual á %.2f!\n", numero, expoente, cube2);
        System.out.printf("A raiz cúbica de %d é igual á %.2f\n", numero, cubic);
        System.out.printf("O número absoluto de %d é igual á %.0f\n", numero, absolut);
    }
}