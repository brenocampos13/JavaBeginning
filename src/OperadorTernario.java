import java.util.Scanner;

public class OperadorTernario {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = keyboard.nextLine();
        System.out.println("Digite sua idade:");
        int idade = keyboard.nextInt();
        String result = (idade > 18)?"true":"false";
        System.out.println(result);
    }
}
