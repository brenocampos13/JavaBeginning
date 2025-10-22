import java.util.Scanner;

public class Gabarito {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] gabarito = new String[5];
        int qntdResp = 0;

        while (qntdResp < 5) {
            System.out.printf("Digite a resposta %d da prova:\n", qntdResp + 1);
            gabarito[qntdResp] = t.nextLine().trim();
            qntdResp++;
        }

        String[] nomeAlunos = new String[5];
        String[][] respAlunos = new String[5][3];
        int qntdAlunos = 0;

        while (true) {
            System.out.println("Digite o nome do aluno:");

            String nome = t.nextLine().trim();
            nomeAlunos[qntdAlunos] = nome;

            if (nome.equalsIgnoreCase("fim")){
                break;
            }

            System.out.printf("Digite o gabarito da prova de %s\n", nomeAlunos[qntdAlunos]);

            for (int i = 0; i < qntdResp; i++) {
                respAlunos[qntdAlunos][i] = t.nextLine().trim();
            }
            qntdAlunos++;
        }

        float notaSala = 0;

        for (int i = 0; i < qntdResp; i++) {
            float nota = 0;
            for (int j = 0; j < 3; j++){
                if (respAlunos[i][j].equalsIgnoreCase(gabarito[j])){
                    nota += 2;
                    notaSala += 2;
                }
            }
            System.out.printf("Nota de %s: %.2f\n", nomeAlunos[i], nota);
        }

        float media = notaSala / (qntdAlunos * 3 * 2);

        System.out.printf("A média da sala foi de %.2f", media);
    }
}
