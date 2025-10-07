import java.util.Scanner;
public class Calculadora {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = t.nextInt();
        MatOp.Parouimpar(number);
        //System.out.println("\n");
        MatOp.RaizQuadrada(number);
        MatOp.Absolut(number);
        MatOp.RaizCubica(number);
        MatOp.Expoente(number);
        MatOp.TabuadaLoop(number);
    }
}