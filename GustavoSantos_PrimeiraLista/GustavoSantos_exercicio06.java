//algoritmo: calcule o perímetro de um círculo, onde o valor do raio será inserido pelo usuário. (Perímetro = 2π * r)
//nome: Gustavo B(ThorfDivine)
//data: 12/05/2023      

import java.util.Scanner;// sistema que trara a possibiblidade de receber informações
public class GustavoSantos_exercicio06 {
    public static void main(String [] args){
//VARIAVEIS
        int n11 = 0;
        Scanner at = new Scanner(System.in);// variavel que sera usada para receber informações
//INICIO
System.out.println("a atividade 6 foi escolhida: ");
System.out.println("digite o valor do raio de um circulo e lhe diremos o perímetro: ");
System.out.println("raio: "); // recebendo o valor do raio
n11 = at.nextInt();

System.out.println("o seu perimetro de acordo com o raio dado seria: " + ((2*3.14)* n11)); // calculando valor do perimetro

//FIM.



    }
}
