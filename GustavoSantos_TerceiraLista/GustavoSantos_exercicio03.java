package GustavoSantos_TerceiraLista;
//algoritmo: calcula a media de 500 números digitados pelo usuario ou gerado pela IA; 
//nome: Gustavo B.(ThorfDivine);
//data: 13/05/2023.

import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
import java.lang.Math;// sistema que trara a possibiblidade de fazer operações

public class GustavoSantos_exercicio03 {
    public static void main(String[] args){

        //VARIAVEIS

        int n1;
        int n2;
        int media;
        int sct;//variavel que seleciona se é aleatório ou digitado 1 por 1
        Scanner l1 = new Scanner(System.in);       
        

        //INICIO

        //iniciando variaveis
         
        n1 = 0; 
        n2 =0;
        sct=0;
        media = 0;

        //recebendo valores 

        //selecionando se é automatico ou manual
        System.out.println("escolha entre 1(um número aleatorio pra média) ou 2(escolher todos os 500 números): ");
        sct = l1.nextInt();

        //if/else responsavel pela escolha de automatico e manual
        if(sct==1){

            for(int cont = 1;cont <= 500; cont++){//loop que conta os 500 numeros que serão recebidos 
    
                    System.out.println("digite o próximo número da media: ");
                    n1 = (int)(Math.random() * 101);//recebe o próximo número da média
                    n2 = n1+n2;//guarda os valores
                    media = n2/cont;//calcula a média
                    System.out.println("seu n1 é: "+n1+", seu n2 é: "+n2+" seu contador é: "+cont+" Sua média por enquanto é: "+media);        
    
            }
            
            System.out.println("Sua média final é: "+media);
        }
        
        if(sct==2){
        for(int cont = 1;cont <= 500; cont++) {//loop que conta os 500 numeros que serão recebidos

            if (cont == 1) { //faz com que receba o primeiro número da média, por pura estética 
        
                System.out.println("digite o primeiro número pra média: ");  
                n1 = l1.nextInt();//recebe o primeiro número da média
                n2 =  n2 + n1;
                media = n2/cont;//calcula a média
                System.out.println("sua média por enquanto é: "+media);   
            } 

            else{
                
                System.out.println("digite o próximo número da media: ");
                n1 = l1.nextInt();//recebe o próximo número da média
                n2 =  n2 + n1;
                media = n2/cont;//calcula a média
                System.out.println("seu n1 é: "+n1+", seu n2 é: "+n2+" seu contador é: "+cont+" Sua média por enquanto é: "+media);}        

        }

        System.out.println("Sua média final é: "+media);}
            

        //FIM.
    }
}
