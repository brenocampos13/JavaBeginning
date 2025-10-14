import java.util.Scanner;
import java.util.Arrays;
public class Vetores {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano estamos?");
        String ano = t.nextLine();
        String[] bissexto = {"2020", "2024", "2028", "2032"};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        if (Arrays.asList(bissexto).contains(ano)){
            System.out.println("O ano é bissexto");
            int[] dias = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i <= mes.length - 1; i++){
                System.out.printf("O mês %s tem %d dias!\n", mes[i], dias[i]);
            }
        } else {
            System.out.println("O ano não é bissexto!");

        }
    }
}