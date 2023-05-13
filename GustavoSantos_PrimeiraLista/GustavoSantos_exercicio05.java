//algoritmo: leia a idade do usuário e mostre a sua faixa etária
//nome: Gustavo B(ThorfDivine)
//data: 12/05/2023      

import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio05 {
    public static void main(String [] args){
//VARIAVEIS
    int n11 = 0;
    Scanner at = new Scanner(System.in);// variavel que sera usada para receber informações
//INICIO
    System.out.println("a atividade 5 foi escolhida: ");
    System.out.println("diga qual a sua idade: ");
    n11 = at.nextInt(); // recebendo informações
    //ANALIZE DA FAIXA ETÁRIA
    if (n11 <= 12) {
        System.out.println("sua faixa etaria de acordo com a idade dada seria: criança");
    }
    else if(n11 < 12 && n11 >= 19 ){
        System.out.println("sua faixa etaria de acordo com a idade dada seria: adolescente");
    }
    else if( n11 < 19 && n11 >= 65 ){
        System.out.println("sua faixa etaria de acordo com a idade dada seria: adulto");
    }
    else{
        System.out.println("sua faixa etaria de acordo com a idade dada seria: idoso");
    }
//FIM.



    }
}
