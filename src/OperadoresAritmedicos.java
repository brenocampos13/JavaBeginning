import java.util.Scanner;

public class OperadoresAritmedicos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = teclado.nextInt();
        int total = n1 + n2;
        System.out.printf("O resultado é: %s!\n", total);
    }
}

