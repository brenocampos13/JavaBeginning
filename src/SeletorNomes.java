import java.util.Scanner;
import java.util.Arrays;

public class SeletorNomes {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String[] nomes = new String[4];
        int totNome = 0;
        for (int i = 0; i <= nomes.length - 1; i++){
            System.out.printf("Digite um nome (%d/4):\n", i + 1);
            nomes[i] = t.nextLine();
            if (nomes[i].contains("C")){
                totNome += 1;
            }
        }
        System.out.printf("Foram guardados %d nomes com a inicial C\n", totNome);
    }
}