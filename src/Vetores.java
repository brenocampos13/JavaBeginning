import java.util.Scanner;
import java.util.Arrays;
public class Vetores {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano estamos?");
        String ano = t.nextLine();
        String[] bissexto = {"2020", "2024", "2028", "2032", "2036", "2040"};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        if (Arrays.asList(bissexto).contains(ano)) {
            System.out.println("O ano é bissexto!");
            int[] totB = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int c = 0; c <= mes.length - 1; c++) {
                System.out.printf("O mês de %s tem %d dias!\n",mes[c], totB[c]);
            }
        } else {
            System.out.println("O ano não é bissexto!");
            int[] tot = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int c = 0; c <= mes.length - 1; c++) {
                System.out.printf("O mês de %s tem %d dias!\n",mes[c], tot[c]);
            }
        }
    }
}