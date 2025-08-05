package questao14;

import java.util.Scanner;

// 14. Uma pizzaria fornece 10% de desconto para funcionários e 5% de desconto para clientes VIP. Faça um programa que calcule o valor total a ser pago pela venda de uma pizza. O programa deverá ler o valor da compra e um código que indica o tipo de cliente: 1-Comum, 2-VIP e 3-Funcionário.
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("o valor da pizza é 30 reais, insira o tipo de cliente para desconto,(1-Comum, 2-VIP e 3-Funcionário.):");
        
        float valorDaPizza=30;
        int n1= entrada.nextInt();

        if(n1 == 1){
            System.out.printf("como cliente comum, nao possuindo desconto, o valor a ser pago é: %.2f reais", valorDaPizza);
        }
        else if(n1 == 2){

            System.out.printf("como cliente VIP, adicionando desconto de 5 porcento, o valor a ser pago é:%.2f", valorDaPizza - (0.05 * valorDaPizza));
        }

        else if(n1 == 3){

            System.out.printf("como funcionarios, adicionando desconto de 10 porcento, o valor a ser pago é:%.2f", valorDaPizza - (0.10 * valorDaPizza));
        }
        else{
            System.out.println("opcao invalida, programa encerrado!");
        }

    }

}
