//algoritmo: se for entre 94 e 456 vc acerta
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício07 {

    public static void main(String[] args) {
        //VARIAVEIS
        int n1;
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            n1=0;
        //recebendo valores
        for (int i = 0; i > -1; i++) {
            System.out.println("tente acertar o número: ");
            n1 = l1.nextInt();
            //verificando se acertou
            if (n1 >=94 && n1<=456) {
                break;
            }
            //errou tente dnv
            else{
                System.out.println("tente de novo");
            }
        }
        System.out.println("Acertou!");
           
        //FIM.
    }
}