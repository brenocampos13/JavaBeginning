import java.util.Scanner;

public class CadastroAlunos {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String[] nomes = new String[3];
        float[] nota1 = new float[3];
        float[] nota2 = new float[3];
        double[] media = new double[3];
        int qntdAlunos = 0;
        float mediaTotal = 7;
        for (int i = 0; i <= nomes.length - 1; i++){
            System.out.printf("Digite um nome (%d/3):\n", i + 1);
            nomes[i] = t.nextLine();
            System.out.printf("Digite a primeira nota de %s:\n", nomes[i]);
            nota1[i] = t.nextFloat();
            System.out.printf("Digite a segunda nota de %s:\n", nomes[i]);
            nota2[i] = t.nextFloat();
            media[i] = (nota1[i] + nota2[i]) / 2;
            t.nextLine();
            if (media[i] >= mediaTotal){
                qntdAlunos += 1;
            }
        }
        System.out.println("ALUNOS CADASTRADOS:");
        System.out.println("===================");
        for (int c = 0; c <= nomes.length - 1; c++){
            System.out.printf("A média do aluno %s é %.2f\n", nomes[c], media[c]);
        }
        System.out.printf("Foram encontrados %d alunos acima da média que é: %.2f\n", qntdAlunos, mediaTotal);
    }
}