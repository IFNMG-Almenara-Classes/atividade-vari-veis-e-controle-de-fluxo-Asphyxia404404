package questao19;

import java.util.Scanner;

// 19. Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana correspondente a este número. Isto é, domingo se 1, segunda-feira se 2, e assim por diante.
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira um numero e ele sera correspondente com o dia da semana.");

        int n1 = entrada.nextInt();

        switch (n1) {
            case 1:

                System.out.printf("%d corresponde a domingo", n1);
                break;

            case 2:
                 System.out.printf("%d corresponde a segunda-feira", n1);
                break;

            case 3:
                 System.out.printf("%d corresponde a terça-feira", n1);
                break;

            case 4:
                 System.out.printf("%d corresponde a quarta-feira", n1);
                break;

            case 5:
                 System.out.printf("%d corresponde a quinta-feira", n1);
                break;

            case 6:
                 System.out.printf("%d corresponde a sexta-feira", n1);
                break;

            case 7:
                 System.out.printf("%d corresponde a sábado", n1);
                break;




            default:
                System.out.println("opcao invalida, apenas do 1 ao 7, encerrando programa!");
        }

    }

}
