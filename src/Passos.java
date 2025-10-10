import java.util.Scanner;

public class Passos {
    static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        numero1 = t.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = t.nextInt();
        System.out.println("Digite os passos:");
        numero3 = t.nextInt();
        for (int i = numero1; i <= numero2; i += numero3){
            System.out.println(i);
        }
    }
}