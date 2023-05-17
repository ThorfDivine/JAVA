//algoritmo: verifica qual o maior número dentre os digitados enquando n for digitado o zero
//nome: Gustavo B(ThorfDivine)
//data: 16/05/2023

package GustavoSantos_Desafios;

import java.util.Scanner;

public class GustavoSantos_Desafio01 {
    public static void main(String [] args) {
        //VARIAVEL
        Scanner l1 = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        //INICIO
            //iniciando variaveis
            n1 = 1;
            n2 = 1;
            n3 = 0;

        //começando laço responsavel por receber número
        while (n1 == 1) {
            if (n1 == 1) { //faz com que receba o primeiro número, por pura estética 
        
                System.out.println("digite o primeiro : ");  
                n2 = l1.nextInt();//recebe o primeiro número da média
                
                   
            } 

            else{ //faz com que receba o restante dos números, por pura estética 
                
                System.out.println("digite o próximo número: ");
                n2 = l1.nextInt();//recebe o próximo número da média
                        
        }
        if (n2 >= n3) {// identifica se o número digitado foi o maior até agora
            n3 =  n2;    
            }
        System.out.println("seu maior número por enquanto é: "+n3);
        
        
        if (n2 == 0) {//se o numero 0 for digitado o programa ira parar
            System.out.println("você digitou o número 0, agora irei parar o programa!");
            n1=0;
        }
        }
        //FIM.  


    }
}
