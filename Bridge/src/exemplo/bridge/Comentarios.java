
package exemplo.bridge;

/**
 *
 * @author camila
 */
public class Comentarios extends CarroAbstrato{

    public Comentarios(Carro c) {
        super(c);
    }

    @Override
    public void montar() {
       Modelo("Modelo");
       Ano ("Ano");
     
    }
    
}
