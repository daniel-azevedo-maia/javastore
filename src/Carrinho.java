import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal valorTotal;

    public void adicionarItem(Produto produto) {
        this.produtos.add(produto);
        System.out.println("Produto adicionado ao carrinho!");

    }


}
