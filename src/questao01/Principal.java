package questao01;

import java.util.Scanner;

// 1. Escreva um programa que receba dois inteiros e informe qual o maior deles. Ex:
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira 2 numeros e sera dado o maior deles:");

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        if(n1 > n2){

        System.out.printf("o primeiro numero(%d) é maior que o segundo(%d)\n", n1, n2);

        }
        else if(n2 > n1){

        System.out.printf("o segundo numero(%d) é maior que o primeiro(%d)\n", n2, n1);




        }
        else{
        System.out.println("ambos numeros possuem valores iguais");

        }

    }
}