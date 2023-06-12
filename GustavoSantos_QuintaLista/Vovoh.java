//algoritmo: criar um metodo com 5 atributos e 1 metodo contrutor
//nome: Gustavo Batista(ThorfDivine)
//data: 12/06/2023
public class Vovoh {
    public static void main(String[] args){
        vovohs lila = new vovohs("azul", 7000, 100000000F, 'L', true);
        System.out.println(lila.anosDVo);
        System.out.println(lila.corDVo);
        System.out.println(lila.inicialN);
        System.out.println(lila.vivaS);
        System.out.println(lila.qntQFlt);
    }
}
class vovohs{
    String corDVo;
    int anosDVo; 
    Float qntQFlt;
    char inicialN; 
    boolean vivaS;
    public vovohs(String corVo, int anosVo, Float qntFlt, char inicial, boolean viva){
        corVo = corDVo;
        anosVo = anosDVo;
        qntFlt = qntQFlt;
        inicial = inicialN;
        viva = vivaS;
    }
}
