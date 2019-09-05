
package exemplo.bridge;

/**
 *
 * @author camila
 */
public class Fiat implements Carro{

    @Override
    public void Ano(String Nome) {
        System.out.println(Nome + ": 2019\n");
    }

    @Override
    public void Modelo(String Nome) {
        System.out.println( Nome + ": Palio");
    }
    
    
}
