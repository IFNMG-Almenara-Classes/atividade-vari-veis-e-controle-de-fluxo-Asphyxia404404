package questao22;

// 22. Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês correspondente a este número. Isto é, janeiro se 1, fevereiro se 2, e assim por diante.

public class Principal {

    public static void main(String[] args) {
        
        

                int mes = 4; // msm coisa da 15, só que sem pedir ao usuario.
        
                    if(mes < 1 || mes > 12){
        
        
                    System.out.println("insira apenas um numero entre 1 a 12, esse numero nao corresponde a um mes!");
                          
                        System.exit(0);
                    }
        
                    switch(mes){
        
                        case 1:
                    System.out.println("janeiro");
                    break;
        
        
                       case 2:
                    System.out.println("fevereiro");
                    break;
        
                       case 3:
                    System.out.println("março");
                    break;
        
                       case 4:
                    System.out.println("abril");
                    break;
        
                       case 5:
                    System.out.println("maio");
                    break;
        
                       case 6:
                    System.out.println("junho");
                    break;
        
                       case 7:
                    System.out.println("julho");
                    break;
        
                       case 8:
                    System.out.println("agosto");
                    break;
        
                       case 9:
                    System.out.println("setembro");
                    break;
        
                       case 10:
                    System.out.println("outubro");
                    break;
        
                      case 11:
                    System.out.println("novembro");
                    break;
        
                      case 12:
                    System.out.println("dezembro");
                    break;
        
                      
        
                    }
        








    }

    }
    

