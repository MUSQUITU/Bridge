
package exemplo.bridge;

/**
 *
 * @author camila
 */
public abstract class CarroAbstrato {
    protected Carro carrinho;
    
    public CarroAbstrato (Carro c){
        carrinho = c;
    }
    public void Ano(String Nome){
        carrinho.Ano(Nome);
    }
    public void Modelo(String Nome){
        carrinho.Modelo(Nome);
    }
    
    public abstract void montar();
}
