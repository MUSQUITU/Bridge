package exemplo.bridge;

/**
 *
 * @author camila
 */
public class Volkswagen implements Carro {

    @Override
    public void Ano(String Nome) {
        System.out.println(Nome + ": 2005\n");
    }

    @Override
    public void Modelo(String Nome) {
        System.out.println(Nome + ": Golzinho");
    }
    
}
