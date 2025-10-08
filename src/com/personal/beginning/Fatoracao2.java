package com.personal.beginning;

import java.util.Scanner;

public class Fatoracao2 {

    public static int Faturacao(int A){
        int c = A;
        int f = 1;
        while (c >= 1) {
            f *= c;
            c--;
        }
        return f;
    }

    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numero = t.nextInt();
        Faturacao(numero);
        int resultado = Faturacao(numero);
        System.out.println(resultado);
    }
}