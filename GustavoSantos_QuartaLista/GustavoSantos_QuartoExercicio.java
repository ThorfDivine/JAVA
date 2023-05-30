//algoritmo: ver se é palavrinha ou palavrão
//autor: Gustavo B(ThorfDivine)
//29/05/2023
import javax.print.DocFlavor.STRING;
import javax.sound.midi.VoiceStatus;

import java.util.Scanner;
public class GustavoSantos_QuartoExercicio {
    public static void main(String[] args){
        //variaveis
        String palavra = " ";
        int cont = 0;
        Scanner l1 = new Scanner(System.in);
        //inicio
        //recebendo valores
        System.out.println("digite uma palavra: ");
        palavra = l1.nextLine();
        cont = palavra.length();

        //averiguando
        if (cont >= 11) {
            System.out.println("voce escreveu um palavrão");
        }
        else{
            System.out.println("voce escreveu uma palavrinha");
        }

    }

}
