import java.util.Scanner;

public class EntenderFor {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Tybe a number: ");
        int number = t.nextInt();
        for (int i = 1; i <= 10; i++){
            int n1 = number * i;
            System.out.printf("%d x %d = %d\n", number, i, n1);
        }
    }
}