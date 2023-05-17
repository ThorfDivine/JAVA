//algoritmo: tentar acertar qual a senha, sem nenhuma dica
//nome: Gustavo B(ThorfDivine)
//data:16/05/2023
package GustavoSantos_Desafios;
import java.util.Scanner;

public class GustavoSantos_Desafio03{
    public static void main(String[] args) {
        
        //VARIAVEIS
        Scanner l1 = new Scanner(System.in);
        String senha;
        //INICIO
        //iniciando variavel responsavel pelas tentativas
        senha = " ";
        
        for (int i = 0; i > -1; i++) {
            System.out.println("tente acertar qual a senha: ");
            senha = l1.next();

            if (senha.equals("JumiraldsMeuXuxu")) {
                System.out.println("acertou! ");
                break;
            }
            else{
                System.out.println("Tente novamente");
            }
        }
        //FIM.


    }
}