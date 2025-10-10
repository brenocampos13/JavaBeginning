import java.util.Scanner;

public class Calc {
    static float numeros = 0;
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float numero;
        int qntdNumeros = 0;
        int pares = 0;
        int impares = 0;
        int mq100 = 0;
        float media = 0;
        do{
            System.out.println("Digite um número:");
            numero = t.nextInt();
            numeros += numero;
            if (numero > 0){
                qntdNumeros += 1;
            } else {
            }
            if (numero % 2 == 0) {
                pares += 1;
                //System.out.println("O número é par");
            } else {
                impares += 1;
                //System.out.println("O número é impar!");
            }
            if (numero > 100){
                mq100 += 1;
            } else {
            }
        }while (numero != 0);
        media = numeros / qntdNumeros;
        System.out.printf("Foram digitados um total de %d números!\n", qntdNumeros);
        System.out.printf("A soma dos números foi de %.0f!\n",numeros);
        System.out.printf("Quantidade de números pares: %d!\n", pares);
        System.out.printf("Quantidade de números ímpares: %d!\n", impares);
        System.out.printf("Maiores que cem: %d!\n", mq100);
        System.out.printf("A média de todos os números é de %.2f\n", media);

    }
}