import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ReservarCadeiras {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        ArrayList <String> cadeiras = new ArrayList<>(10);

        System.out.println("CADEIRAS DISPONÍVEIS:");

        for (int i = 0; i <= 9; i++) {
            cadeiras.add("B" + (i + 1));
        }
        System.out.print(cadeiras);
        System.out.println("\n=========================================");

        int qntdCad = 0;

        for (int i = 0; i < cadeiras.size(); i++) {
            System.out.println("\nDeseja reservar uma cadeira? [S/N]");
            String resp = t.nextLine().trim();

            if (resp.equalsIgnoreCase("N")) {
                System.out.printf("Você reservou %d cadeiras!", qntdCad);
                break;
            }

            System.out.println("Qual a cadeira a ser reservada?");
            String reserva = t.nextLine().trim();
            int indice = cadeiras.lastIndexOf(reserva);

            if (indice < 0){
                System.out.println("Está cadeira já foi reservada!");

            } else {
                cadeiras.set(indice, "==");
                qntdCad++;
            }

            System.out.println("=========================================");
            System.out.println(cadeiras);
            System.out.println("=========================================");
        }
    }
}
//"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"