package questao18;

import java.util.Scanner;

/// 18. Escreva um programa que, dados dois números inteiros positivos inseridos pelo usuário, verifique e imprima a quantidade de números primos entre eles.

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira dois numeros e sera mostrado os numeros impares no intervalo deles.");

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        int maior=0;
        int menor=0;

        boolean contador = true; // contador para caso nao divida por 0, marcar como 0

        if(n1 > n2){
            maior = n1;
            menor = n2;
        }
        else if(n2 > n1){

            maior = n2;
            menor = n1;
        }

        System.out.printf("no intervalo de %d e %d, os seguintes numeros são:\n", menor, maior);

        for(int i=menor; i < maior; i++){ // for para pegar o menor numero, e dividir pelo seus antecessores, vai verificar se algum dividir e ficar com o resto 0, se o ocorrer, ja nao será o numero primo

            contador = true;
            for(int j = i-1; j > 1;j--){

                if(i % j == 0){

                    System.out.printf("%d nao é primo.\n", i);
                    contador=false;
                    break;
                }

                
            }
            if(contador){

                System.out.printf("%d é primo.\n", i);
            }
            
            

        }

    }

}
