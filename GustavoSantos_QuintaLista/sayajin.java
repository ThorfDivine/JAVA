//algoritmo: classe sayajin com 10 metodos, 1 metodo construtor e 10 atributos
//nome: Gustavo Batista(ThorfDivine)
//data: 12/06/2023
public class sayajin {

    public static void main(String[] args){
        sayan goku = new sayan("goku", 50, 100.5, 'S', true, "azul", "preto", "tom de laranja", 1.80, 10.0, 15.0);
        System.out.println(goku.classeDoSayajin);
        System.out.println(goku.nomeDoSayajin);
        System.out.println(goku.idadeDoSayajin);
        System.out.println(goku.tamanhoDoCabelo);
        System.out.println(goku.tamanhoDaCoxa);
        System.out.println(goku.tamanhoDoKi);
        System.out.println(goku.classeDoSayajin);
        System.out.println(goku.homem);
        System.out.println(goku.corDoBelo);
        System.out.println(goku.corDoKi);
        System.out.println(goku.corDaPele);
    }
}

    class sayan{   
    String nomeDoSayajin;
    int idadeDoSayajin;
    double tamanhoDoKi;
    char classeDoSayajin;
    boolean homem;
    String corDoKi;
    String corDoBelo;
    String corDaPele;
    double altura;
    double tamanhoDoCabelo;
    double tamanhoDaCoxa;

        sayan(String nomeSayajin, int idadeSayajin, double tamanhoKi, char classeSayajin, boolean eHomem, String corKi,String corBelo, String corPele, double alturas, double tamanhoCabelo, double tamanhoCoxa){
        this.nomeDoSayajin = nomeSayajin;
        this.idadeDoSayajin = idadeSayajin;
        this.tamanhoDoKi = tamanhoKi;
        this.classeDoSayajin = classeSayajin;
        this.homem = eHomem;
        this.corDoKi = corKi;
        this.corDoBelo = corBelo;
        this.corDaPele = corPele;
        this.altura = alturas;
        this.tamanhoDoCabelo = tamanhoCabelo;
        this.tamanhoDaCoxa = tamanhoCoxa;
        }
    String elevarKI(){
        return "elevando";
    }
    void crescer(){}
    void virarSSJ1(){}
    void virarSSJ2(){}
    void virarSSJ3(){}
    void virarSSJ4(){}
    void virarSSJG(){}
    void virarSSJGSSJ(){}
    void virarMUI(){}
    void virarOozaru(){}



    


    }