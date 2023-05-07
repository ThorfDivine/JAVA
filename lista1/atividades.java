//algoritmo: concluir as atividades recebidas
//nome: Gustavo B(ThorfDivine)
//data: 07/05/2023
import java.util.Scanner;
public class atividades{
    public static void main(String[] args ){
        //Variaveis
        Scanner at = new Scanner(System.in);
        double atividade, n11, n21, n31, n41, res; 

        //inicio
        n11 = 0.0;
        n21 = 0.0;
        n31 = 0.0;
        n41 = 0.0;
        res = 0.0;
        
        // recebendo quais atividades
        System.out.println("Ola, tudo bem? para evitar a fadiga da navegação por arquivos, tudo foi posto nesse mesmo arquivo, pois bem, basta que o senhor escolha o número(inteiro) da atividade(de 1 à 6) :");
        atividade = at.nextInt();
        // primeira atividade
        
        if(atividade == 1){
//algoritmo:  leia 4 números, inseridos pelo usuário, some os números e mostre o resultado na tela
//nome: Gustavo B(ThorfDivine)
//data: 07/05/2023      

            System.out.println("a atividade 1 foi escolhida: ");
            System.out.println("digite 4 números inteiros em seguida para que eu possa soma-los: ");
            n11 = at.nextInt(); 
            n21 = at.nextInt(); 
            n31 = at.nextInt(); 
            n41 = at.nextInt(); 
            
            System.out.println("bem, o resultado da sua soma foi de: " + (n11 + n21 + n31 + n41));

        }

        else if(atividade == 2 ){
//algoritmo: receba 4 números, inserido pelo usuário; calcule o quadrado de cada um (número²); some todos os valores e mostre o resultado
//nome: Gustavo B(ThorfDivine)
//data: 07/05/2023

            System.out.println("a atividade 2 foi escolhida: ");
            System.out.println("digite 4 números inteiros em seguida para que eu possa eleva-los ao quadrado e soma-los:");
            n11 = at.nextInt(); 
            n21 = at.nextInt(); 
            n31 = at.nextInt(); 
            n41 = at.nextInt(); 
            res = Math.pow(n11, 2) + Math.pow(n21, 2) + Math.pow(n31, 2) + Math.pow(n41, 2);

            System.out.println("após elevar ao quadrado e somar, o resultado foi: " + res);

        }
        else if(atividade == 3 ){
//algoritmo: baseado na cotação atual do dólar, calcule a conversão do número inserido pelo usuário para dólar
//nome: Gustavo B(ThorfDivine)
//data: 07/05/2023

            System.out.println("a atividade 3 foi escolhida: ");
            System.out.println("digite primeiro a cotação atual do dólar e depois quantos reais você gostaria de converter:  ");
            System.out.println("Dólar: "); 
            n11 = at.nextInt(); // recebendo valor do dolar
            System.out.println("Real: "); 
            n21 = at.nextInt(); //recebendo valor em real

            System.out.println("o seu valor em Dólar seria: $" + (n21 / n11) ); // mostrando valor em dolar
        }
        else if(atividade == 4 ){
//algoritmo: dizer de que tipo seriam as opções dadas
//nome: Gustavo B(ThorfDivine)
//data: 07/05/2023

            System.out.println("a atividade 4 foi escolhida: ");
            System.out.println(" a. Dinheiro (Dólar, Real, Yens): double/float \n b. Temperatura: double \n c. Sexo (Gênero): char\n d. Idade, Datas: int\n e. Frases, letras de músicas: string\n f. Preços, Peso: double \n g. Resposta (Sim ou Não): boolean");
        }
        else if(atividade == 5 ){
//algoritmo: leia a idade do usuário e mostre a sua faixa etária
//nome: Gustavo B(ThorfDivine)
//data: 07/05/2023

            System.out.println("a atividade 5 foi escolhida: ");
            System.out.println("diga qual a sua idade: ");
            n11 = at.nextInt();

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


        }
        else if(atividade == 6 ){
//algoritmo: calcule o perímetro de um círculo, onde o valor do raio será inserido pelo usuário. (Perímetro = 2π * r)
//nome: Gustavo B(ThorfDivine)
//data: 07/05/2023
            System.out.println("a atividade 6 foi escolhida: ");
            System.out.println("digite o valor do raio de um circulo e lhe diremos o perímetro: ");
            System.out.println("raio: "); // recebendo o valor do raio
            n11 = at.nextInt();

            System.out.println("o seu perimetro de acordo com o raio dado seria: " + ((2*3.14)* n11)); // calculando valor do perimetro

        }
        else{
            System.out.println("por favor, para que uma atividade seja escolhida digite um número de 1 à 6. rode o programa de novo");
        }

    }
}