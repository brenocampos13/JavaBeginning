import java.util.Scanner;
import java.util.ArrayList;
public class MatrizesArmazenar {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int[][] numerosPares = new int[3][3];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                numerosPares[i][j] = t.nextInt();
                int numerosPares1 = numerosPares[i][j];

                if (numerosPares1 % 2 == 0){
                    pares.add(numerosPares1);
                } else {
                    impares.add(numerosPares1);
                }
            }
        }
        for (int j = 0; j < 3; j++){
            for (int c = 0; c < 3; c++){
                System.out.print(numerosPares[j][c] + " ");
            }
            System.out.print(pares);
            System.out.println(impares);
        }
    }
}
