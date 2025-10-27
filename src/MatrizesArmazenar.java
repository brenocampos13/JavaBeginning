import java.util.Scanner;

public class MatrizesArmazenar {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[][] alunoNota = new String[3][2];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                alunoNota[i][j] = t.nextLine().trim();
            }
        }
        for (int j = 0; j < 3; j++){
            for (int c = 0; c < 2; c++){
                System.out.print(alunoNota[j][c] + " ");
            }
        }
    }
}
