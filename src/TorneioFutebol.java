import java.util.Scanner;

public class TorneioFutebol {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] times = new String[3];
        int qntdTimes = 0;

        System.out.println("Digite um time ('fim' encerra):");

        while (true) {
            System.out.println("Digite o time (Max. 3):");
            String nome = t.nextLine().trim();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            if (nome.isEmpty()) {
                System.out.println("Termo incorreto, digite novamente!");
                continue;
            }
            boolean repetido = false;
            for (int i = 0; i < qntdTimes; i++) {

                if (times[i].equalsIgnoreCase(nome)) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                System.out.println("Este time já está na lista!");
            } else {
                times[qntdTimes] = nome;
                qntdTimes++;
            }
        }

        System.out.println("CONFRONTOS:");

        for (int i = 0; i < qntdTimes; i++) {
            for (int j = i + 1; j < qntdTimes; j++) {
                System.out.println(times[i] + "[] X []" + times[j]);
            }
        }
    }
}