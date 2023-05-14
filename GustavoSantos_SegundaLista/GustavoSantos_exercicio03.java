package GustavoSantos_SegundaLista;
//algoritmo: calcula a media de 500 números digitados pelo usuario; 
//nome: Gustavo B.(ThorfDivine);
//data: 13/05/2023.
import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio03 {
    public static void main(String[] args){
        //VARIAVEIS
        int n1;
        int n2;
        int cont;
        int media;
        Scanner l1 = new Scanner(System.in);       
        //INICIO
        //iniciando variaveis
        n1 = 0; 
        n2 = 0;
        cont = 1;
        media = 0;
        //recebendo valores 
        while (cont <= 500) {//loop que conta os 500 numeros que serão recebidos
            n2 = n1 + n2; //o que faz com que memorize os números anteriores e não perca possibilitando a media
            if (cont == 1) { //faz com que receba o primeiro número da média, por pura estética 
        
                System.out.println("digite o primeiro número pra média: ");  
                n1 = l1.nextInt();//recebe o primeiro número da média
                media = (n1+n2)/cont;//calcula a média
                System.out.println("sua média por enquanto é: "+media);   
            }  
            else{
                System.out.println("digite o próximo número da media: ");
                n1 = l1.nextInt();//recebe o próximo número da média
                media = (n1+n2)/cont;//calcula a média
                System.out.println("Sua média por enquanto é: "+media);}        
                cont ++;
        }

        //FIM.
    }
}
