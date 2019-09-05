package exemplo.bridge;

/**
 *
 * @author camila
 */
public class Toyota implements Carro {

    @Override
    public void Ano(String Nome) {
        System.out.println(Nome + ": 2016 \n");
    }

    @Override
    public void Modelo(String Nome) {
        System.out.println(Nome + ": Etios");
    }
    
}
