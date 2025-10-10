import java.util.Scanner;

public class Passos {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite de onde começar:");
        int numero = 0;
        int numero1 = t.nextInt();
        System.out.println("Digite até onde vai o loop:");
        int numero2 = t.nextInt();
        System.out.println("Digite quantos passos:");
        int numero3 = t.nextInt();
        for (int i = numero1; i <= numero2; i+=numero3){
            System.out.println(i);
        }
    }
}