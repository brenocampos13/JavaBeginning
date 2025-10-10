import java.util.Scanner;

public class Passos {
    static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner t = new Scanner(System.in);
        System.out.println("Digite onde começará o loop:");
        numero1 = t.nextInt();
        System.out.println("Digite onde terminará o loop:");
        numero2 = t.nextInt();
        System.out.println("Digite os passos do loop:");
        numero3 = t.nextInt();
        for (int i = numero1; i <= numero2; i += numero3){
            System.out.println(i);
        }
    }
}