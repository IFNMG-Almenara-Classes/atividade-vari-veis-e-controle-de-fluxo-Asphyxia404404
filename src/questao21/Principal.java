// 21. Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou não se aposentar. As condições para aposentadoria são:
//     - Ter pelo menos 65 anos,
//     - Ou ter trabalhado pelo menos 30 anos,
//     - Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
package questao21;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira a idade:");
        int idade = entrada.nextInt();
        
        System.out.println("insira o tempo de serviço:");
        int tempoServiço = entrada.nextInt();


        if(idade >= 65 || tempoServiço >= 30 || idade >= 60 && tempoServiço >=25){

            System.out.printf("ele pode se aposentar, com %d anos e %d de tempo de serviço.", idade, tempoServiço);
        }
        else{
            System.out.printf("ele não pode se aposentar, com %d anos e %d de tempo de serviço.",idade, tempoServiço);
            
        }



    }

}
