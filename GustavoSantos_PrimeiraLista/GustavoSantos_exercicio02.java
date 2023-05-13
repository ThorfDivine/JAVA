//algoritmo: receba 4 números, inserido pelo usuário; calcule o quadrado de cada um (número²); some todos os valores e mostre o resultado
//nome: Gustavo B(ThorfDivine)
//data: 12/05/2023      

import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio02{
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
        res = Math.pow(n41, 2) + Math.pow(n31, 2) + Math.pow(n21, 2) + Math.pow(n11, 2);//calculando
    
    System.out.println("bem, o resultado da sua soma foi de: " + res);//mostrando informações

//FIM.




    }
}
