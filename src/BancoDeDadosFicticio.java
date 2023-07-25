import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BancoDeDadosFicticio {

    public static List<Produto> produtos = new ArrayList<>();
    public static HashMap<Long, Produto> relacaoParaConsulta = new HashMap<>();

    static {

        produtos.add(new Produto(1L, "PlayStation 5", new BigDecimal("5000.00")));
        produtos.add(new Produto(2L, "Xbox Series X", new BigDecimal("4500.00")));
        produtos.add(new Produto(3L, "Nintendo Switch", new BigDecimal("3000.00")));
        produtos.add(new Produto(4L, "Apple MacBook Pro", new BigDecimal("10000.00")));
        produtos.add(new Produto(5L, "Dell XPS 15", new BigDecimal("9500.00")));
        produtos.add(new Produto(6L, "Google Pixel 6", new BigDecimal("4000.00")));
        produtos.add(new Produto(7L, "Apple iPhone 13", new BigDecimal("8000.00")));
        produtos.add(new Produto(8L, "Samsung Galaxy S21", new BigDecimal("5000.00")));
        produtos.add(new Produto(9L, "Apple iPad Pro", new BigDecimal("6000.00")));
        produtos.add(new Produto(10L, "Amazon Kindle Oasis", new BigDecimal("1500.00")));
        produtos.add(new Produto(11L, "Logitech MX Master 3", new BigDecimal("700.00")));
        produtos.add(new Produto(12L, "Corsair K95 RGB Platinum", new BigDecimal("1200.00")));
        produtos.add(new Produto(13L, "Asus ROG Swift PG279Q", new BigDecimal("2500.00")));
        produtos.add(new Produto(14L, "Bose QuietComfort 35 II", new BigDecimal("1500.00")));
        produtos.add(new Produto(15L, "Sony WH-1000XM4", new BigDecimal("1800.00")));
        produtos.add(new Produto(16L, "Apple AirPods Pro", new BigDecimal("1200.00")));
        produtos.add(new Produto(17L, "WD Black SN850 1TB", new BigDecimal("1000.00")));
        produtos.add(new Produto(18L, "Samsung 980 Pro 1TB", new BigDecimal("900.00")));
        produtos.add(new Produto(19L, "Intel Core i9-10900K", new BigDecimal("3000.00")));
        produtos.add(new Produto(20L, "AMD Ryzen 9 5950X", new BigDecimal("3200.00")));

        for (Produto produto : produtos) {
            relacaoParaConsulta.put(produto.getCodigo(), produto);
        }

    }
}
