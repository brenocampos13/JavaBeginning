import java.util.Scanner;

public class Tabuada {
    static void main() {
        int contador = 1;
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número para calcular:");
        int numero = t.nextInt();
        MatOp.TabuadaLoop(numero);
    }

}