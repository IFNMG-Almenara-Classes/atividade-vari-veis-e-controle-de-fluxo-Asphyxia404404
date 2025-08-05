package questao06;
import java.util.Scanner;

// 6. Escreva um programa que receba três inteiros e informe qual o menor deles.


public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("insira 3 numeros, e sera retornado o menor: ");
        
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        
        if(n1 < n2 && n1 < n3){
            
            System.out.printf("dentre os numeros:%d, %d, %d, o menor é:%d\n", n1,n2, n3,n1 );
            
        }
        else if(n2 < n1 && n2 < n3){
            System.out.printf("dentre os numeros:%d, %d, %d, o menor é:%d\n", n1,n2, n3,n2 );

        }
        else if(n3 < n1 && n3 < n2){
            System.out.printf("dentre os numeros:%d, %d, %d, o menor é:%d\n", n1,n2, n3,n3 );

        }
        else if (n1 == n2 && n1 == n3){
            System.out.printf("os numeros:%d, %d, %d sao iguais", n1,n2, n3);

        }

        


    }
    
    
}
