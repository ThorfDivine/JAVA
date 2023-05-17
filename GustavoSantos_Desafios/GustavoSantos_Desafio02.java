//algoritmo: receber notas e fala se está aprovado ou não e contar aprovados e reprovados
//nome: Gustavo B(ThorfDivine)
//data:16/05/2023
package GustavoSantos_Desafios;
import java.util.Scanner;

public class GustavoSantos_Desafio02 {
    public static void main(String[] args ) {
        
        //VARIAVEL
        Scanner l1 = new Scanner(System.in);
        int n1;
        double not1;
        double not2;
        String yn;
        int apvd;
        int rpvd;
        double media;


        //INICIO
            //iniciando variaveis
            yn = " "; // responsavel por parar
            n1 = 0; //contadora
            rpvd = 0; //reprovados
            apvd = 0; //aprovados
            not1 = 0.0; //nota1
            not2 = 0.0; //nota2
            media =0.0; //media das 2 notas

            System.out.println("para parar o programa diga nao a pergunta, só podem ser usados números inteiros.");
             do{
                n1++;

                    System.out.println("digite a primeira nota: ");
                    not1 = l1.nextDouble();
                
                    System.out.println("digite a segunda nota: ");
                    not2 = l1.nextDouble();

                    media = (not1 + not2)/2; //recebe a media


                if (media >= 5.0) { //passou
                    apvd++; //conta quantos passaram
                    System.out.println("aprovado!");
                }


                if(media > 0.0 && media < 5){ //reprovou
                    rpvd++; // conta os reprovados
                    System.out.println("reprovado");
                }
                 
                System.out.println("deseja continuar? sim/nao"); 
                yn = l1.next(); // recebe o valor de sim ou nao

                if(yn.equals("nao")){ //verifica se é pra parar o programa
                    System.out.println("parando programa, foram :"+apvd+" aprovados e "+rpvd+" reprovados, obrigado pela atenção!");
                    break;// para o programa
                }
                
            }while (n1 > 0);
        //FIM.
    }
}
