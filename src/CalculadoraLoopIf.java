import java.util.Scanner;

public class CalculadoraLoopIf {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        // Pergunta se o usuário deseja começar
        System.out.println("Deseja começar?");
        int n = 0, s = 0, soma = 0, ttl = 0;
        // Primeiro loop do software para anti crash
        while (true) {
            String resp = t.nextLine();
            if (resp.equals("S")) {
                break;
            } else if (resp.equals("N")) {
                System.out.println("Até logo!");
                System.exit(0);
            } else {
                System.out.println("Termo inválido, tente novamente!");
            }
        }
        // Segundo loop do software para captar os números
        do {
            System.out.println("Digite um número: ");
            n = t.nextInt();
            //Acrescenta 1 numero na contagem
            s += n;
            // Efetua a soma
            soma = soma + n;
            // Pergunta se quer digitar outro número
            System.out.println("Deseja digitar outro número? [0/1]");
            // Capta e converte a resposta
            int resp2 = t.nextInt();
            ttl = resp2;
        } while (ttl == 0); // Enquanto a resposta for 0 o software continua
        //Output da quantidade de números digitados e da soma deles
        System.out.printf("Foram digitados %d números\n", n);
        System.out.printf("A soma dos números digitados foi: %d\n", soma);
    }
}