//algoritmo: mostrar o sucessor e o antecessor de um número
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício05 {

    public static void main(String[] args) {
        //VARIAVEIS
        int n1;
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            n1=0;
            //recebdo número
        System.out.println("digite um número, motrarei o sucessor e o antecessor: ");
        n1 = l1.nextInt();
        //mostrando sucessores e antecessores
        System.out.println("antecessor: "+(n1-1)+", número: "+n1+", sucessor: "+(n1+1));
        
        //FIM.
    }
}