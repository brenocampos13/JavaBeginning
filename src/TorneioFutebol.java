import java.util.Scanner;

public class TorneioFutebol {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] times = new String[3];
        int qtdTimes = 0;

        System.out.println("Digite um time ('fim' encerra):");

        while (true) {
            System.out.println("Digite o time (Maximo 3):");
            String nome = t.nextLine().trim();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            if (nome.isEmpty()) {
                System.out.println("Termo inválido, digite novamente!");
                continue;
            }

            boolean repetido = false;
            for (int i = 0; i < qtdTimes; i++) {
                if (times[i].equalsIgnoreCase(nome)) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Este time já foi adicionado!");
            } else {
                times[qtdTimes] = nome;
                qtdTimes++;
            }
        }
        System.out.println("CONFRONTOS");

        for (int i = 0; i < qtdTimes; i++){
            for (int j = i + 1; j < qtdTimes; j++){
                System.out.println(times[i] + "[] x []" + times[j]);
            }
        }
    }
}