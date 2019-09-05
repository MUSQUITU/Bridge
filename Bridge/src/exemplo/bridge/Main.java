package exemplo.bridge;

/**
 *
 * @author camila
 */
public class Main {
    public static void main(String[] args) {
        CarroAbstrato carrinho = new Comentarios(new Fiat());
        carrinho.montar();
        
        carrinho = new Comentarios(new Toyota());
        carrinho.montar();
        
        carrinho = new Comentarios(new Volkswagen());
        carrinho.montar();
    }
}
