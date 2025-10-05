import java.util.Scanner;

public class Numeros {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = 0;
        int s = 0;
        String resp;
        do {
            System.out.println("Digite um número: ");
            int numero = t.nextInt();
            s = n += numero;
            System.out.println("Deseja somar outro número? [S/N] ");
            resp = t.next();
        } while (resp.equals("s"));
        System.out.printf("A soma dos números é igual á: %d\n", s);
    }
}