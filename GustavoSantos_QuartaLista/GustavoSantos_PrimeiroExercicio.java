//algoritmo:some todos os números cujo quadrado (x²) for divisível por 4.
//autor: Gustavo B.(ThorfDivine)
//data: 29/05/2023
import java.util.Scanner;
import java.lang.Math;
public class GustavoSantos_PrimeiroExercicio{
    public static void main(String[] args) {
        //variaveis
        double n1;
        double res;
        int i= 0;
        String control;
        Scanner l1 = new Scanner(System.in);
        //inicio
        //iniciando variaveis
        n1 = res= 0.0;
        control = "s";

        while(control.equals("s")) {
            i ++;
            if (i == 1) {
                System.out.println("escreva o primeiro número da soma");
                n1 = l1.nextDouble();
            }
            else{
                System.out.println("escreva o próximo número da soma");
                n1 = l1.nextDouble();}            
         
            if (Math.pow(n1, 2) % 4 ==0) {
                res += n1;
            }
            System.out.println("\n até agora foram digitados: "+i+" números e o total até agora é: "+res);
            System.out.println("quer continuar? s/n");
            control = l1.next();
            
        }
        //fim
    }
}