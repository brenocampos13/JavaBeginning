package com.personal.beginning;

public class Funcoes {
    static int a = 0;
    static int b = 1;
    static int c;

    static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= 10; i++){
            int proximoFib = Fibonacci();
            System.out.println(proximoFib);
        }
    }
    public static int Fibonacci(){
        c = a + b;
        a = b;
        b = c;
        return c;
    }
}