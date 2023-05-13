//algoritmo:  leia 4 números, inseridos pelo usuário, some os números e mostre o resultado na tela
//nome: Gustavo B(ThorfDivine)
//data: 12/05/2023      

import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio01 {
    public static void main(String [] args){
//VARIAVEIS
        int n11 = 0;
        int n21 = 0;
        int n31 = 0;
        int n41 = 0;
        double res = 0.0;
        Scanner at = new Scanner(System.in);// variavel que sera usada para receber informações
//INICIO
        System.out.println("a atividade 1 foi escolhida: ");
            System.out.println("digite 4 números inteiros em seguida para que eu possa soma-los: ");
            n11 = at.nextInt(); // recebendo informações
            n21 = at.nextInt(); // recebendo informações
            n31 = at.nextInt(); // recebendo informações
            n41 = at.nextInt(); // recebendo informações
            res = n11 + n21 + n31 + n41;//calculando
            
            System.out.println("bem, o resultado da sua soma foi de: " + res);//mostrando informações

//FIM.



    }
}
