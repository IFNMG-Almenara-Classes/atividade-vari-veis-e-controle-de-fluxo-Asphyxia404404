package questao07;
// 7. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é equilátero, isósceles ou escaleno.
//    O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois
//    lados.

import java.util.Scanner;

//    - Chama-se equilátero o triângulo que tem três lados iguais.
//    - Denominam-se isósceles o triângulo que tem o comprimento de dois lados iguais.
//    - Recebe o nome de escaleno o triângulo que tem os três lados diferentes.
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira os 3 lados do triangulo:");

        int trianguloLadoA, trianguloLadoB, trianguloLadoC;

        trianguloLadoA = entrada.nextInt();
        trianguloLadoB = entrada.nextInt();
        trianguloLadoC = entrada.nextInt();


        if(trianguloLadoA == trianguloLadoB && trianguloLadoA == trianguloLadoC){
            System.out.println("esse é um triangulo equilatero, todos os lados sao iguais.");
        }
        else if(trianguloLadoA != trianguloLadoB && trianguloLadoA != trianguloLadoC){

            System.out.println("esse é um triangulo escaleno, pois todos os lados sao diferentes");
        }
        else {
            System.out.println("esse é um triangulo isosceles, pois possue dois lados iguais");
        }
        

    }

}
