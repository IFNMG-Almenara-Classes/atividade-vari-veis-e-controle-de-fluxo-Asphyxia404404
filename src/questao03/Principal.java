package questao03;

import java.util.Scanner;

// 3. Escreva um programa que receba um número e informe se o número é par ou ímpar. Ex:
//    ```text
//      Digite um número: 10
//      > O número 10 é par
//    ```
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);



        System.out.print("digite um numero, e será mostrado se ele é par ou impar: ");

        int numero = entrada.nextInt();

        if (numero % 2 == 0){
            System.out.printf("%d, é um numero par!\n", numero);
        }
        else if(numero % 2 != 0){
            System.out.printf("%d, é um numero impar!\n", numero);
        }
    }

}
