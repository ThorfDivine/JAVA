//algoritmo: recebe a base e a altura de um triângulo e calcula a area; 
//nome: Gustavo B.(ThorfDivine);
//data: 17/05/2023.
package GustavoSantos_SegundaLista;
import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio03 {
    public static void main(String[] args){
        //VARIAVEIS
        int alt; //altura
        int bas; //base
        int are; //area
        Scanner l1 = new Scanner(System.in);       
        //INICIO
        //iniciando variaveis
        alt = 0; 
        bas = 0;
        are = 0;
        //recebendo valores 
        System.out.println("digite a altura do triângulo: ");
        alt = l1.nextInt(); //recebe altura
        System.out.println("digite a base do triângulo: ");
        bas = l1.nextInt(); //recebe base
        are = alt*bas/2; //calcula area
        System.out.println("sua area é: "+are);
        
        //FIM.
    }
}
