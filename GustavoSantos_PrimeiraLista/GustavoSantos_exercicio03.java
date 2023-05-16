//algoritmo: calcule a conversão do real para dólar
//nome: Gustavo B(ThorfDivine)
//data: 12/05/2023      

import java.util.Scanner; // sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio03 {
    public static void main(String [] args){
//VARIAVEIS
        int n11 = 0;
        int n21 = 0;
        Scanner at = new Scanner(System.in);// variavel que sera usada para receber informações
//INICIO
        System.out.println("a atividade 3 foi escolhida: ");
        System.out.println("digite primeiro a cotação atual do dólar e depois quantos reais você gostaria de converter:  ");
        System.out.println("Dólar: "); 
        n11 = at.nextInt(); // recebendo valor do dolar
        System.out.println("Real: "); 
        n21 = at.nextInt(); //recebendo valor em real

        System.out.println("o seu valor em Dólar seria: $" + (n21 / n11) ); // mostrando valor em dolar
    
//FIM.



    }
}
