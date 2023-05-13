package GustavoSantos_SegundaLista;
//algoritmo: lista todos os números inteiros dentre os 2 selecionados 
//nome: Gustavo B.(ThorfDivine)
//
import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio02 {
    public static void main(String[] args){
        //VARIAVEIS
        int n1;
        int n2;
        Scanner l1 = new Scanner(System.in);       
        //INICIO
        //iniciando variaveis
        n1 = 0; 
        n2 = 0;
        //recebendo valores
        System.out.println("escreva o número antecessor ao  primeiro número da contagem: ");
        n1 = l1.nextInt();
        System.out.println("escrvea o número sucessor ao ultimo número da contagem: ");
        n2 = l1.nextInt();

        while (n1 <= n2) {// loop que conta os numeros
            n1 ++;
            if (n1 < n2) {
                System.out.println(n1);             
            }
            
           
        }
        //FIM.
    }
}
