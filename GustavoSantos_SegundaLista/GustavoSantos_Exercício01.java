//algoritmo: desconta 15% de um valor
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício01 {
    public static void main(String[]args) {
        //VARIAVEIS
        int n1;
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            n1=0;

            //recebendo valores
            System.out.println("digite um valor e irei descontar 15% dele: ");
            n1 = l1.nextInt(); // recebe o valor
            System.out.println("o seu valor com desconto é: "+ (n1*0.85)); //desconta do valor

        //FIM.
    }
}