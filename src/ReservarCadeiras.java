import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
// Ja temos a string de cadeiras
// The system ask the chair desired until the negative answer
//
public class ReservarCadeiras {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] cadeiras = {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"};
        String[] cadeiras2 = {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"};
        System.out.println("CADEIRAS DISPONÍVEIS:");
        for (int i = 0; i < cadeiras.length; i++) {
            System.out.printf("[%s] ", cadeiras[i]);
        }
        System.out.println("\n===================================================");

        for (int i = 0; i < cadeiras.length; i++){
            System.out.println("Deseja reservar uma cadeira? [S/N]");
            String resp = t.nextLine().trim();

            if (resp.equalsIgnoreCase("N")){
                break;
            }

            System.out.println("Qual a cadeira a ser reservada?");
            String reserva = t.nextLine().trim();

            if (cadeiras[i].equalsIgnoreCase("==")){
                System.out.printf("A cadeira %s já está reservada!", cadeiras2[i]);
                System.out.println("\n");
            }

            if (Arrays.asList(cadeiras).contains(reserva)){
                cadeiras[i] = "==";
            }

            System.out.printf("[%s] ", cadeiras[i]);
        }
    }
}