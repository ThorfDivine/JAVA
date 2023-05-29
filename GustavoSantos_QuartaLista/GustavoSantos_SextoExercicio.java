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

       for (int i = 0; i < 10; i++) {
            System.out.println("escreva o valor: "+i);
            cont = l1.nextInt();

            if(cont < 0){
                i--;
            }
            else{
                res += cont;
            }
       }
       double res2 = Math.sqrt(res);
       System.out.println("o valor total foi de: "+res2);

    }

}
