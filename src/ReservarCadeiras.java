import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class ReservarCadeiras {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        ArrayList cadeiras = new ArrayList<>(10);

        System.out.println("CADEIRAS DISPONÍVEIS:");

        for (int i = 0; i <= 9; i++) {
            cadeiras.add("B" + (i + 1));
        }
        System.out.print(cadeiras);
        System.out.println("\n===================================================");

        for (int i = 0; i < cadeiras.size(); i++) {
            System.out.println("\nDeseja reservar uma cadeira? [S/N]");
            String resp = t.nextLine().trim();

            if (resp.equalsIgnoreCase("N")) {
                break;
            }

            System.out.println("Qual a cadeira a ser reservada?");
            String reserva = t.nextLine().trim();

            if (Arrays.asList(cadeiras).contains(reserva)) {
                cadeiras.remove(reserva);
            } else {
                System.out.println("Este acento já foi ocupado!");
            }

            System.out.println(cadeiras);
        }
    }
}
//"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"