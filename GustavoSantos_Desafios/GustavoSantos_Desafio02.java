//algoritmo: receber notas e fala se está aprovado ou não e contar aprovados e reprovados
//nome: Gustavo B(ThorfDivine)
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
            yn = " ";
            n1 = 0;
            rpvd = 0;
            apvd = 0;
            not1 = 0.0;
            not2 = 0.0;
            media =0.0;

            System.out.println("para parar o programa diga nao a pergunta, só podem ser usados números inteiros.");
             do{
                n1++;

                    System.out.println("digite a primeira nota: ");
                    not1 = l1.nextDouble();
                
                    System.out.println("digite a segunda nota: ");
                    not2 = l1.nextDouble();

                    media = (not1 + not2)/2; //recebe a media


                if (media >= 5.0) {
                    apvd++;
                    System.out.println("aprovado!");
                }


                if(media > 0.0 && media < 5){
                    rpvd++;
                    System.out.println("reprovado");
                }
                 
                System.out.println("deseja continuar? sim/nao");
                yn = l1.next();

                if(yn.equals("nao")){
                    System.out.println("parando programa, foram :"+apvd+" aprovados e "+rpvd+" reprovados, obrigado pela atenção!");
                    n1 = -11;
                }
                
            }while (n1 > 0);
        //FIM.
    }
}
