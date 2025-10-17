import java.util.Scanner;
import java.util.Arrays;

public class TorneioFutebol {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String[] times = new String[3];
        for (int i = 0; i <= times.length - 1; i++) {
            System.out.printf("Digite um time (%d/3):\n", i + 1);
            times[i] = t.nextLine();
        }

    }
}
