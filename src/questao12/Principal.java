package questao12;
// 12. Construa um programa que solicite números inteiros ao usuário repetidamente. Ao receber o valor “**0**”, o programa deve imprimir a quantidade de números pares que foram digitados e a média de todos os números digitados, exceto o “**0**”.

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float n1 = 1;
        int contadorDePar = 0;
        float media = 0;

        System.out.println("digite quantos numeros quiser, e 0 para encerrarm, da a media e os numeros pares:");
        for (int i = 0; n1 != 0; i++) {

            n1 = entrada.nextInt();

            if (n1 != 0) {
                media += n1;

                if (n1 % 2 == 0) {
                    contadorDePar++;

                }

            } else if (n1 == 0) {

                System.out.printf("%d numeros pares foram digitados, e media de todos os numeros digitados é:%.2f", contadorDePar, media / i);
            }
        }

    }

}
