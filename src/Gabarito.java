import java.util.Scanner;

public class Gabarito {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] gabarito = new String[5];
        int qntdResp = 0;

        while (qntdResp < 5) {
            System.out.printf("Digite a resposta %d da prova:\n", qntdResp + 1);
            String resposta = t.nextLine().trim();
            gabarito[qntdResp] = resposta;
            qntdResp++;
        }

        String[] nomeAlunos = new String[5];
        String[] respAlunos = new String[5];
        int[] respAlunos2 = new int[5];
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
                String resposta = t.nextLine().trim();
                respAlunos[i] = resposta;
            }
            qntdAlunos++;
        }

        float nota = 0;
        int qntdAcertos = 0;
        float notaSala = 0;

        for (int i = 0; i < qntdResp; i++) {

            boolean acertou = false;
            if (respAlunos[i].equals(gabarito[i])) {
                nota += 2;
                notaSala += 2;
                qntdAcertos += 1;
                acertou = true;
            }
        }

        float media = (notaSala + notaSala) / 2;

        for (int i = 0; i < qntdAlunos; i++) {
            System.out.printf("O aluno %s acertou %d questões e sua nota foi %.2f!\n", nomeAlunos[i], qntdAcertos, nota);
        }
        System.out.printf("A média da sala foi de %.2f", media);
    }
}
