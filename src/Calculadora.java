import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a number: ");
        String numero1 = keyboard.nextLine();
        int numero = Integer.parseInt(numero1);
        MatOp.Parouimpar(numero);
        System.out.print("\n");
        MatOp.Expoente(numero);
        System.out.print("\n");
        MatOp.RaizQuadrada(numero);
        System.out.print("\n");
        MatOp.RaizCubica(numero);
        System.out.print("\n");
        MatOp.Absolut(numero);
        System.out.print("\n");
        MatOp.TabuadaLoop(numero);
    }
}