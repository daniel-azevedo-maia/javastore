import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal valorTotal;

    public void adicionarItem(Produto produto) throws InterruptedException {
        this.produtos.add(produto);

        System.out.printf(String.format("Você adicionou %s no carrinho!%n", produto.getNome()));
        Thread.sleep(1000);

    }


}
