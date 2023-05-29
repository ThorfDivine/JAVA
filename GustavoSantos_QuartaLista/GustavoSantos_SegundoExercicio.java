//algoritmo:some todos os números cujo quadrado (x²) for divisível por 4.
//autor: Gustavo B.(ThorfDivine)
//data: 29/05/2023
import java.util.Scanner;
import java.lang.Math;
public class GustavoSantos_SegundoExercicio{
    public static void main(String[] args) {
        //variaveis
        double n1;
        double n2;
        double n3;
        double res;
        Scanner l1 = new Scanner(System.in);
        //inicio
        //iniciando variaveis
        n1 = n2 = n3 = res= 0.0;

        while(res != 48 && res != 72) {
                System.out.println("escreva o primeiro número da soma");
                n1 = l1.nextDouble();
            
                System.out.println("escreva o próximo número da soma");
                n2 = l1.nextDouble();  
                
                System.out.println("escreva o próximo número da soma");
                n3 = l1.nextDouble();
         
                res = n1 + n2 + n3;
            
            System.out.println("\n o total agora é: "+res);      
        }
        //fim
    }
}