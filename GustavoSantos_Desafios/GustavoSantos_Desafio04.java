//algoritmo: manipula um estoque imaginario
//nome: Gustavo B(ThorfDivine)
//data:16/05/2023
package GustavoSantos_Desafios;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class GustavoSantos_Desafio04{
    public static void main(String[] args) {
        
        //VARIAVEL
        String comando;
        int estoque;
        Scanner l1 = new Scanner(System.in);
        //INICIO
        //iniciando variavies
        estoque = 0;
        comando = " ";

        //iniciando laço responsavel pelo loop
        for (int i = 0; i > -1 ; i++) {
            System.out.println("o que deseja fazer? \n X - fechar o programa \n A-adicionar uma unidade ao estoque \n B-subtrair uma unidade do estoque \n C-mostrar o total do estoque ");
            comando = l1.next();

            if (comando.equals("X")) {
                System.out.println("fechando...");//fecha o programa
                break;
            }
            else if (comando.equals("A")) {
                System.out.println("somando...");//adiciona +1 para o estoque
                estoque++;
            }
            else if (comando.equals("B")) {
                System.out.println("subtraindo...");//subtrai 1 do estoque
                estoque--;
            }
            else if (comando.equals("C")) {
                System.out.println("seu estoque total é de: "+estoque);//mostra o estoque
            }
            else{
                System.out.println("error, digite um dos valores informados.");// informa do erro

            }
        }
        //FIM.

    }
}