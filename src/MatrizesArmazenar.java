import java.util.Scanner;
import java.util.ArrayList;
public class MatrizesArmazenar {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int[] numerosPares = new int[9];

        for (int i = 0; i < 9; i++){
            numerosPares[i] = t.nextInt();

            if (numerosPares[i] % 2 == 0){
                pares.add(numerosPares[i]);

            } else {
                impares.add(numerosPares[i]);

            }
        }
        System.out.print(pares);
        System.out.println(impares);
    }
}
