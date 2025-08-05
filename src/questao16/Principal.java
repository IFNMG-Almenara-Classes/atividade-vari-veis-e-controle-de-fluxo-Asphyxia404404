package questao16;
// 16. Construa um programa que imprima a Tabuada da divisão e multiplicação de um determinado inteiro informado pelo usuário. A tabuada deve apresentar as operações e os resultados entre o número e os números do intervalo entre 1 e 10.

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("insira um numero e sera dada a tabuada de divisão e multiplicação:");
        int n1 = entrada.nextInt();

        System.out.println("\tDivisão");
        for(float i=1; i <= 10; i++){

            System.out.printf("%d / %.0f = %.2f\n", n1, i, n1 / i);
        }

        System.out.println("\tMultiplicação");
        for(int i=1; i <=10; i++){

            System.out.printf("%d x %d = %d\n", i, n1, i * n1);


        }
    }
    
}
