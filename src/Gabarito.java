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

        int qntdAlunos = 0;
        String[] nomeAlunos = new String[5];
        String[][] respAlunos = new String[5][5];

        while (true) {
            System.out.println("Digite o nome do aluno:");

            String nome = t.nextLine().trim();
            nomeAlunos[qntdAlunos] = nome;

            if (nome.equalsIgnoreCase("fim")){
                break;
            }

            qntdAlunos++;
        }

        float nota = 0;
        int qntdAcertos = 0;
        float notaSala = 0;

        for (int i = 0; i < respAlunos.length; i++) {
            System.out.printf("Digite o gabarito da prova de %s\n", nomeAlunos[i]);

            for (int j = 0; j < respAlunos.length; j++) {
                respAlunos[i][j] = t.nextLine().trim();
                if (respAlunos[i][j].equals(gabarito[i])) {
                    nota += 2;
                    notaSala += 2;
                    qntdAcertos += 1;
                }
            }
        }

        float media = (notaSala + notaSala) / qntdAlunos;

        for (int i = 0; i < qntdAlunos; i++) {
            System.out.printf("O aluno %s acertou %d questões e sua nota foi %.2f!\n", nomeAlunos[i], qntdAcertos, nota);
        }
        System.out.printf("A média da sala foi de %.2f", media);
    }
}
