import java.util.Scanner;
public class Procedimento {
    static int x1;
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número:");
        int A = t.nextInt();
        System.out.println("Digite um número:");
        int B = t.nextInt();
        ParOuImpar(A, B);
        System.out.println(x1);
    }
    public static void ParOuImpar ( int A, int B) {
        x1 = A + B;
    }
}