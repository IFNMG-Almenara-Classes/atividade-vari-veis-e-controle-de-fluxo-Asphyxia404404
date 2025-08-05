package questao13;

// 13. Construa um programa que exiba um menu com 5 opções:
// 1 - Somar
// 2 – Subtrair
// 3 - Multiplicar
// 4 – Dividir
// 5 - Sair

// ```
// Ao escolher uma das opções entre 1 e 4, o programa deve solicitar que o usuário informe dois números, calcular a operação escolhida, imprimir o resultado e apresentar o menu novamente. Ao selecionar a opção 5, o programa deve ser finalizado. Escolhendo uma opção que não existe no menu, o programa deve apresentar o menu novamente.

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int opcao=0;

        while(opcao != 5){

            System.out.println("1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair\nEscolha uma das opções:");

            opcao = entrada.nextInt();

            if(opcao == 1){

                System.out.println("insira dois numeros para somar: ");
                int n1 = entrada.nextInt();
                int n2 = entrada.nextInt();

                System.out.printf("A soma de %d e %d, é %d.\n", n1, n2, n1 + n2);


            }
            else if(opcao == 2){

                  System.out.println("insira dois numeros para subtrair: ");
                int n1 = entrada.nextInt();
                int n2 = entrada.nextInt();

                System.out.printf("A subtração de %d e %d, é %d.\n", n1, n2, n1 - n2);



            }
            else if(opcao == 3){

                     System.out.println("insira dois numeros para multiplicar: ");
                int n1 = entrada.nextInt();
                int n2 = entrada.nextInt();

                System.out.printf("A multiplicação de %d e %d, é %d.\n", n1, n2, n1 * n2);


            }
            else if(opcao == 4){

                     System.out.println("insira dois numeros para dividir: ");
                float n1 = entrada.nextFloat();
                float n2 = entrada.nextFloat();

                System.out.printf("A divisão de %.2f e %.2f, é %.2f.\n", n1, n2, n1 / n2);



            }
            else if(opcao == 5){
                System.out.println("Programa encerrado!");
            }
            else{
                System.out.println("opcao invalida, digite novamente apenas de 1 a 5!");
            }
        }



    }
    
}
