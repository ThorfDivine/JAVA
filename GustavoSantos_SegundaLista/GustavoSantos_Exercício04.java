//algoritmo: trocar o lugar dos valores
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício04 {

    public static void main(String[] args) {
        //VARIAVEIS
        int n1; 
        int n2;
        int n3;
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            n1=0;
            n2=0;
            n3=0;
            //recebendo os valores
            System.out.println("digite 2 valores em sequencia: ");
            n1= l1.nextInt();
            n2= l1.nextInt();
            //trocando os valores
            n3 = n1;
            n1 = n2;
            n2 = n3;
            //mostrando os valores
            System.out.println("após trocar os valores, o resultado foi: n1: "+n1+" n2: "+n2);

        //FIM.
    }
}