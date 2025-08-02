package questao02;
// 2. Escreva um programa que solicite ao usuário o seu peso e altura, calcule e imprima o seu IMC e a sua classificação.

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        System.out.println("digite seu peso");
        float peso = entrada.nextInt();
        System.out.println("digite sua altura");
        float altura = entrada.nextInt();
        float imc = peso / (altura *altura);
        System.out.println("\r\n" + //
                        "| IMC         | Classificação                |\r\n" + //
                        "| ----------- | ---------------------------- |\r\n" + //
                        "| < 18,5      | Magreza                      |\r\n" + //
                        "| 18,5 - 24,9 | Saudável                     |\r\n" + //
                        "| 25,0 - 29,9 | Sobrepeso                    |\r\n" + //
                        "| 30,0 - 34,9 | Obesidade Grau I             |\r\n" + //
                        "| 35,0 - 39,9 | Obesidade Grau II (Severa)   |\r\n" + //
                        "| >= 40       | Obesidade Grau III (mórbida) |");

        
        System.out.println(imc);

        




    }
}