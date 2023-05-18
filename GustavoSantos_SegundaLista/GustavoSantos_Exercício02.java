//algoritmo: verifica qual dos 3 números digitados é o maior
//nome: Gustavo B(ThorfDivine)
//data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício02 {

    public static void main(String[] args) {
        //VARIAVEIS
        int n1; //recebe os valores
        int n2; //recebe o maior valor
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            n1=0;
            n2=0;

            for (int i = 0; i < 3; i++) { //nao precisa repetir o comando 3x, manda em loop
                
                System.out.println("digite algum número: ");
                n1 = l1.nextInt(); //recebendo os valores
                //vendo qual o maior
                if (n1>n2) {
                    n2 = n1;
                }

            }
            System.out.println("seu maior número foi: "+n2);
        //FIM.
    }
}