//algoritmo: mostra se o número recebidop é par ou ímpar
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício10 {

    public static void main(String[] args) {
        //VARIAVEIS
        int n1;
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            n1 =0;
        //recebendo valores
        System.out.println("digite 1 número: ");
            n1 = l1.nextInt();
        //vendo se é par ou ímpar
        if (n1%2 == 0) {
            System.out.println("seu número é par");
        }
        else if (n1%2 == 1) {
            System.out.println("seu número é ímpar");
        }
        //FIM.
    }
}