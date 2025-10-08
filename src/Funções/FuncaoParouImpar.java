package Funções;

import java.util.Scanner;

public class FuncaoParouImpar {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numero = t.nextInt();
        String resultado = ParouImpar(numero);
        System.out.println(resultado);
    }
    public static String ParouImpar(int A){
        String par = "O número é par!";
        String impar = "O número é impar";
        if (A % 2 == 0) {
            return par;
        } else {
            return impar;
        }
    }
}