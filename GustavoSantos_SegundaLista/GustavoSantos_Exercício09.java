//algoritmo: mostra se os números recebidos são um maior que o outro, menor ou igual
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício09 {

    public static void main(String[] args) {
        //VARIAVEIS
        int n1;
        int n2;
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            n1 =0;
            n2 = 0;
        //recebendo valores
        System.out.println("digite 2 números em sequencia: ");
            n1 = l1.nextInt();
            n2 = l1.nextInt();
        //verificando se é maior, menor ou igual
        if (n1>n2) {
            System.out.println("o n1° número é maior");
        }
        else if (n1==n2) {
            System.out.println("números iguais");
        }
        else if(n1<n2){
            System.out.println("2° número é mair que o primeiro");
        }
        //FIM.
    }
}