package GustavoSantos_SegundaLista;
//algoritmo: lista todos os números inteiros de 0-1000 
//nome: Gustavo B.(ThorfDivine)
//
import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio01 {
    public static void main(String[] args){
        //VARIAVEIS
        int n1;
        Scanner l1 = new Scanner(System.in);       
        //INICIO
        //iniciando variaveis
        n1 = 0; 

        while (n1 <= 1000) {// loop que conta os numeros
            if (n1 < 1000) {
                System.out.println(n1 +", ");
                n1++;
            }else{
                System.out.println(n1);
                n1++;
            }
           
        }
        //FIM.
    }
}
