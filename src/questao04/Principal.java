package questao04;
// 4. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:

import java.util.Scanner;

// |                  |                             |
// | ---------------- | --------------------------- |
// | ACESSO PERMITIDO | caso a senha seja válida.   |
// | ACESSO NEGADO    | caso a senha seja inválida. |
// Ex:
// ```text
//   Digite a senha: 1234
//   > ACESSO PERMITIDO
// ```
// ```text
//   Digite a senha: 9999
//   > ACESSO NEGADO
// ```
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


    int senha = 1;

    while(senha != 0 ){

        System.out.println("insira a senha: ");
        senha = entrada.nextInt();
        if(senha == 1234){

            System.out.println("> ACESSO PERMITIDO\nprograma encerrado!");
            senha = 0;

        }
        else{
            System.out.println(" > ACESSO NEGADO\ninsira a senha novamente!");
        }

    }

    }
}
