import java.util.Scanner;

public class EntenderFor {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = t.nextInt();
        for (int i = 1; i <= 10; i++){
            int n1 = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, n1);
        }

    }
}