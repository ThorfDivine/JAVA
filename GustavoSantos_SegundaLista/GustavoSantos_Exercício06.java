//algoritmo: calcular os valores dos sorvetes de acordo com o escolhido
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício06 {

    public static void main(String[] args) {
        //VARIAVEIS
        int kiwi;
        int laranja;
        int roma;
        double res;
        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            kiwi=0;
            laranja=0;
            roma=0;
            res=0.0;
        
            //recebendo valores
            System.out.println("quantos sorvetes de laranja vc quer? ");
            laranja = l1.nextInt();
            System.out.println("quantos sorvetes de kiwi vc quer? ");
            kiwi = l1.nextInt();
            System.out.println("quantos sorvetes de roma vc quer? ");
            roma = l1.nextInt();
            res = (roma*7.99)+(kiwi*3.20)+(laranja*2.39);

            System.out.println("seu total foi de: "+res+", \n laranja: "+(laranja*2.39)+"\n kiwi: "+(kiwi*3.20)+"\n roma: "+(roma*7.99));
        //FIM.
    }
}