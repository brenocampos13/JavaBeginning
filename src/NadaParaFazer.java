import java.util.Scanner;

public class NadaParaFazer {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int ano = 2025;
        System.out.println("what year were you born?");
        int nasc = t.nextInt();
        int velinhas = ano - nasc;
        System.out.printf("you need to put %d candles on top the cake", velinhas);

    }
}