import java.util.Scanner;

public class VotoObrigatorio {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = keyboard.nextInt();
    if (idade >= 18 && idade <= 70) {
        System.out.println("O voto é obrigatório!");
    } else if ((idade >= 16 && idade <= 17) || (idade >= 70 && idade <=100)) {
        System.out.println("O voto é opcional!");
    } else if (idade >= 100){
            System.out.println("Você realmente tem essa idade? KEKW");
    } else {
            System.out.println("Você ainda não vota!");
        }
    }
}
