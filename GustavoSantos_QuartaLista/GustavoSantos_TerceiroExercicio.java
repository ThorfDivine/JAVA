//algoritmo:some todos os números cujo quadrado (x²) for divisível por 4.
//autor: Gustavo B.(ThorfDivine)
//data: 29/05/2023
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class GustavoSantos_TerceiroExercicio{
    public static void main(String[] args) {
        //variaveis
        double dou1;
        int int1;
        Random gerador = new Random();
        Scanner l1 = new Scanner(System.in);
        //inicio
        //iniciando variaveis
        dou1  =  0.0;
        int1 =  0;


        for (int i = 0; i < 50; i++) {
            int1 += gerador.nextInt();
        }
        for (int i = 0; i < 50; i++) {
            int1 += gerador.nextDouble();
        }

        if (int1 > dou1) {
            System.out.println("os números interiros são maiores que os quebrados.\n soma inteiros: "+int1);
        }
        else if (int1 < dou1) {
            System.out.println("os números interiros são menores que os quebrados.\n soma quebrados: "+dou1);
        }
        //fim
    }
}