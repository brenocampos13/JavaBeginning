import java.util.Scanner;
public class Procedimento {
    static int c;
    static int a = 0;
    static int b = 1;
    static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= 12; i++){
            Fibonacci(a, b);
        }
    }
    public static void Fibonacci (int A, int B) {
        c = a + b;
        System.out.println(c);
        a = b;
        b = c;
    }
}