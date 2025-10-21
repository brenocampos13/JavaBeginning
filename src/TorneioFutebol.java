import java.util.Scanner;

public class TorneioFutebol {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] times = new String[3];
        int qntdTimes = 0;

        while (qntdTimes < 3) {
            System.out.printf("Digite 3 times (%d)\n",qntdTimes + 1);
            String nome = t.nextLine().trim();

            if (nome.isEmpty()){
                System.out.println("Termo inválido, digite novamente!");
            }

            boolean repetido = false;
            for (int i = 0; i < qntdTimes; i++){
                if (times[i].equalsIgnoreCase(nome)){
                    repetido = true;
                    break;
                }
            }
            if (repetido){
                System.out.println("O time já está na lista!");
            } else {
                times[qntdTimes] = nome;
                qntdTimes++;
            }
        }
        System.out.println("CONFRONTOS:");

        for (int i = 0; i < qntdTimes; i++){
            for (int j = i + 1; j < qntdTimes; j++){
                System.out.println(times[i] + " [] x [] " + times[j]);
            }
        }
    }
}