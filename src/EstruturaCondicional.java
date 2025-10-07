import java.util.Scanner;

public class EstruturaCondicional {
    static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a quantidade de patas:");
    int qntdPernas = teclado.nextInt();
    String tipo;
    switch (qntdPernas) {
        case 1:
            tipo = "saci";
            break;
        case 2:
            tipo = "bípede";
            break;
        case 3:
            tipo = "tripé";
            break;
        case 4:
            tipo = "quadrúpede";
            break;
        case 6, 8:
            tipo = "aranha";
            break;
        default:
            tipo = "ET";
            break;
    }
    System.out.printf("Isso é um %s!", tipo);
    }
}