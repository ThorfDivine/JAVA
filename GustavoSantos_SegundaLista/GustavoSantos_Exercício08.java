//algoritmo: um algoritmo que indica em que parte do anime vc esta, baseado nas informações recebidas
//Nome: Gustavo B(ThorfDivine)
//Data: 17/05/2023
package GustavoSantos_SegundaLista;
import java.util.Scanner;

public class GustavoSantos_Exercício08 {

    public static void main() {
        //VARIAVEIS
        int ep;
        double time;
        String nome;
        String indicacao; //deveria ser char, porem o Scanner n aceita

        Scanner l1 = new Scanner(System.in);
        //INICIO
            //iniciando variaveis
            ep=0;
            time = 0.0;
            nome= " ";
            indicacao= " ";
        //recebendo valores
        System.out.println("ola, qual o nome do seu anime? ");
        nome = l1.next();
        System.out.println("hmm.. e em qual ep? ");
        ep = l1.nextInt();
        System.out.println("muito bom, muito bom. em que parte exatamente vc esta do episodio?(00.00)");
        time = l1.nextDouble();
        System.out.println("qual a classificação indicativa?");
        //indicando em que parte do anime vc esta
        if (time <=0.0) {
            System.out.println("Voce esta no ep: "+ep+" ainda no começo");
        }
        else if(time>0.0 && time<24.00){
            System.out.println("Voce esta no ep: "+ep+" no momento: "+time);
        }
        else {
            System.out.println("voce terminou esse ep("+ep+") agora esta no ep: "+(ep +1));
        }
        //FIM.
    }
}