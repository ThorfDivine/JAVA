/*algoritmo: criando uma classe "casa" com 10 atributos e 5 métodos
 *nome: Gustavo
 *Data: 07/06/2023
 */
public class Casa {
    public static void main(String[] args) {
        casas.corExterna = "azul";
        casas.peso = 1000.09f;
        casas.tatuBolinhas = 22;
        casas.tamanho = 80;
        casas.serBranca = false;
        casas.corInterna = "verde";

        
        System.out.println(casas.corExterna);
        System.out.println(casas.peso);
        System.out.println(casas.tatuBolinhas);
        System.out.println(casas.tamanho);
        System.out.println(casas.serBranca);
        System.out.println(casas.corInterna);

        System.out.println();
        System.out.println(casas.existe);
        System.out.println(casas.gerarMoleculas());
        System.out.println(casas.deterionar());
        System.out.println(casas.explodir());
        System.out.println(casas.ficarQuente());
        System.out.println(casas.esfriar());
        System.out.println(casas.absorverAgua());
        
    }
}

class casas{
    String corExterna;
    float peso;
    int tatuBolinhas;
    char tamanho;
    boolean serBranca;
    String dono;
    String corInterna;
    String corTeto;
    int idade;
    boolean existe;

    void gerarMoleculas(){}
    void deterionar(){}
    void explodir(){}
    void ficarQuente(){}
    void esfriar(){}
    void absorverAgua(){}
}
