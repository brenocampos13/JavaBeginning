import java.util.Scanner;
import java.util.ArrayList;

public class Array {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Quantos números você quer adc?");
        int quantidade = t.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um número " + (i + 1) + ":");
            numeros.add(t.nextInt());
        }
        System.out.println("Números: " + numeros);
        t.close();
    }
}