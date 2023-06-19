/*algoritmo: criando uma classe "cinto" com 5 métodos
 *nome: Gustavo
 *Data: 07/06/2023
 */
public class Cinto {
    public static void main(String[] args){
        system.out.println(cintos.hit());
        system.out.println(cintos.intensidadeMaxDoHit());
        system.out.println(cintos.agarrar());
        system.out.println(cintos.partir());
        system.out.println(cintos.existir());
        system.out.println(cintos.formarLetra());
    }
    
}
class cintos{
    String hit(){
        return "plaft";
    } 
    float intensidadeMaxDoHit(){
        return 10.5f;
    }
    void agarrar(){
        System.out.println("você coletou isso com o cinto");
    }
    int partir(){
        return 2;
    }
    boolean existir(){
        return true;
    }
    char formarLetra(){
        return 's';
    }
}
