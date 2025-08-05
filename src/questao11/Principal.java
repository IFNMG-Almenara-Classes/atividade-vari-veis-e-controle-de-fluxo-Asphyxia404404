package questao11;
// 11. Construa um programa que solicite do usuário um número inteiro e positivo e imprima todos os números pares entre 0 e o número digitado.
// 

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("insira um numero inteiro positivo, para ver os numeros pares entre ele e 0.");

        int n1 = entrada.nextInt();

        for(int i=0; i < n1; i++){

            if(i % 2 == 0){
                System.out.printf("%d,", i);
            }
        }
        System.out.printf(" esses sao os numeros pares no intervalo de 0 a %d.\n",n1);

    }

}
