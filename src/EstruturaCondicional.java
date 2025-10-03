import java.util.Scanner;

public class EstruturaCondicional {
    static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a quantidade de patas:");
    int qntdPernas = teclado.nextInt();
    String tipo;
        switch (qntdPernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}