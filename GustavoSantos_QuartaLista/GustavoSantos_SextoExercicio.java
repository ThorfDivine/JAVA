//algoritmo: recebendo 10 valores não negativos
//nome: Gustavo B(ThorfDivine)
//data: 29/05/2023
import javax.print.DocFlavor.STRING;
import javax.sound.midi.VoiceStatus;
import java.lang.Math;

import java.util.Scanner;
public class GustavoSantos_SextoExercicio{
    public static void main(String[] args){
        //variaveis
        int cont = 0, res = 0;
        Scanner l1 = new Scanner(System.in);
        //inicio
        //contando
       for (int i = 0; i < 10; i++) {
            //recebendo valores
            System.out.println("escreva o valor: "+i);
            cont = l1.nextInt();
            //verificando
            if(cont < 0){
                i--;
            }
            else{
                res += cont;
            }
       }
       //informando
       double res2 = Math.sqrt(res);
       System.out.println("o valor total foi de: "+res2);

    }

}
