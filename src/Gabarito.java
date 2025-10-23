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

        while (true) {
            System.out.println("Digite o nome do aluno:");

            String nome = t.nextLine().trim();
            nomeAlunos[qntdAlunos] = nome;

            if (nome.equalsIgnoreCase("fim")){
                break;
            }

            qntdAlunos++;
        }

        float[] nota = new float[qntdAlunos];
        int[] qntdAcertos = new int[qntdAlunos];
        float notaSala = 0;

        String[][] respAlunos = new String[5][5];

        for (int i = 0; i < qntdAlunos; i++) {
            System.out.printf("Digite o gabarito da prova de %s\n", nomeAlunos[i]);

            for (int j = 0; j < respAlunos.length; j++) {
                respAlunos[i][j] = t.nextLine().trim();

                if (respAlunos[i][j].equalsIgnoreCase(gabarito[j])) {
                    nota[i] += 2;
                    qntdAcertos[i] += 1;
                    notaSala += 2;
                }
            }
        }

        for (int i = 0; i < qntdAlunos; i++) {
                System.out.printf("O aluno %s acertou %d questões e sua nota foi %.2f!\n", nomeAlunos[i], qntdAcertos[i], nota[i]);
        }

        float media = notaSala / qntdAlunos;
        System.out.printf("A média da sala é de %.2f", media);
    }
}