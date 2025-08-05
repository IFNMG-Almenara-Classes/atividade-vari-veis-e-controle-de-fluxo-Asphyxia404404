package questao17;
// 17. O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto de todos os seus antecessores, incluindo si próprio e excluindo o zero. Exemplo de número fatorial: 6! = 6 x 5 x 4 x 3 x 2 x 1 = 720. Construa um programa que solicite do usuário um número e imprima o seu fatorial.


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        
        System.out.println("insira um numero e sera dado seu fatorial: ");
        
        int n1 = entrada.nextInt();
        int fator =n1;

        for(int i = n1-1; i > 0; i--){

            fator = fator * i;



        }
        System.out.printf("o fatorial de %d, é: %d",n1, fator);

    }
}
