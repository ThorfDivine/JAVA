
//nome: gustavo b (thorfdivine)
//algoritmo: mostra se passou ou se reprovou
//data: 08/05/2023

package JAVA.exemplos;

import java.util.Scanner;

import javax.swing.*;

public class test1 {
    public static void main(String[] args) {
        // VARIAVEIS
        Double n1, n2, n3, n4, media;
        Scanner at = new Scanner(System.in);
        JFrame janela = new JFrame();

        // INICIO

        // iniciando variaveis
        n1 = n2 = n3 = n4 = media = 0.0;

        // pedindo as notas
        System.out.println("digite 4 notas para que eu faça as médias: ");

        // recebendo notas
        n1 = at.nextDouble();
        n2 = at.nextDouble();
        n3 = at.nextDouble();
        n4 = at.nextDouble();

        // calculando a media
        media = (n1 + n2 + n3 + n4) / 4;

        // vendo se a media esta boa
        if (media >= 6) {
            JOptionPane.showMessageDialog(janela, "passou! parabéns!!");  
            JOptionPane.showInputDialog(janela, "digite alguma coisa");
        } else if (media >= 4 && media < 6) {
            JOptionPane.showMessageDialog(janela, "quase, recuperação");  
        } else {
            JOptionPane.showMessageDialog(janela, "qua qua qua, reprovou!!");  
        }

        //FIM.
    }
}