package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("A soma de " + a + " e " + b + " é igual a: " + somar);
        System.out.println("A subtração de " + a + " e " + b + " é igual a: " + subtrair);
        System.out.println("A multiplicação de " + a + " e " + b + " é igual a: " + multiplicar);
        System.out.println("A divisão de " + a + " e " + b + " é igual a: " + dividir);


        sc.close();
    }
    public static int somar (int a, int b) {
        return a + b;
    }
    public static int subtrair (int a, int b) {
        return a-b;
    }
    public static int multiplicar (int a, int b) {
        return a*b;
    }
    public static double dividir (int a, int b) {
        return (double) a/b;
    }
}
