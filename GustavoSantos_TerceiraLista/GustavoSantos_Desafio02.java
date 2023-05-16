//algoritmo: faz uma lista em que mostra qual número a pessoa escolheu, na mesma quantia do número.
//nome: Gustavo B.(ThorfDivine)
//data: 13/05/2023
package GustavoSantos_TerceiraLista;

import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_Desafio02 {
    public static void main(String[] args) {
    //VARIAVEIS
    int n1;
    int n2;
    Scanner l1;
    //INICIO
        //iniciando as variaveis
        n1 = 0;
        n2 = 1;
        l1 = new Scanner(System.in);
        //recebendo info do laço
        System.out.println("digite um numero, iremos repetir esse numero o tanto de vezes que esse numero representa: ");
        n1 = l1.nextInt();
        //começando laço de repetição
        do{
            System.out.println(n1);
            n2++;
        }while (n2 < n1);

    //FIM.    




    }
}
