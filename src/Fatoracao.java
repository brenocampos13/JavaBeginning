import java.util.Scanner;

public class Fatoracao {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numero = t.nextInt();
        int f = 1;
        int c = numero;
        while (c >= 1){
            f *= c;
            c--;
        }
        System.out.println(f);
    }
}