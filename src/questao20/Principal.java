package questao20;
// 20. Faça um programa para verificar se um determinado número inteiro é divisível por 3 ou 5, mas não simultaneamente pelos dois.

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira:");
        int n1 = entrada.nextInt();

        if(n1 % 3 == 0 && n1 % 5 == 0){

            System.out.printf("%d é divisivel simultaneamente por 3 e 5.", n1);
        }

        else if(n1 % 3 == 0){

            System.out.printf("%d é divisivel por 3.", n1);
        }

        else if( n1 % 5 == 0){

            System.out.printf("%d é divisivel por 5.", n1);
        }

    }
}
