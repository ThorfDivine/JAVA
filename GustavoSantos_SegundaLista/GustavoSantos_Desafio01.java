//algoritmo: exibe todos os números de 0 a 200, e mostra quais são multiplos de 10
//nome: Gustavo B.(ThorfDivine)
//data: 13/05/2023
package GustavoSantos_SegundaLista;

public class GustavoSantos_Desafio01 {
    public static void main(String [] args){
    //VARIAVEIS
    int n1;
    int n2;
    //INICIO
        //iniciando variaveis
        n1 =1;
        n2 =1;
        //começando laço de repetição
        while (n1<=200) { 
        
        if (n2==10) { // identificando se o número é multiplo de 10
            System.out.println("o número: "+ n1 +" é um múltiplo de 10");
            n2 = 0;
        }
        else{
        System.out.println("seu numero atual é: "+n1);}
        n2++;
        n1++;    
        }
    //FIM.    




    }
}
