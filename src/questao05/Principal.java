package questao05;
// 5. As laranjas custam R$0,50 cada se forem compradas menos do que uma dúzia, e R$0,30 se forem compradas pelo menos doze. Escreva um programa que leia o número de laranjas compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        int laranjas = 0;

        System.out.println("digite quantas laranjas deseja comprar: ");

        laranjas = entrada.nextInt();


        if(laranjas < 12){

            System.out.printf("%d laranjas, ficaram no valor de R$: %.2f", laranjas, 0.50 * laranjas);
            
        }
        else if(laranjas >= 12){

            System.out.printf("%d laranjas, ficaram no valor de R$: %.2f , pois foram  pelo menos 12", laranjas, 0.30 * laranjas);



        }
        else{
            System.out.println("insira um numero invalido, programa encerrado!");
        }





    }

}
