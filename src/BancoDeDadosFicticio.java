import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BancoDeDadosFicticio {

    public static List<Produto> produtos;
    public static HashMap<Integer, Produto> relacaoParaConsulta = new HashMap<>();

    static {

        produtos = new ArrayList<>();

        produtos.add(new Produto(1, "PlayStation 5", new BigDecimal("5000.00")));
        produtos.add(new Produto(2, "Xbox Series X", new BigDecimal("4500.00")));
        produtos.add(new Produto(3, "Nintendo Switch", new BigDecimal("3000.00")));
        produtos.add(new Produto(4, "Apple MacBook Pro", new BigDecimal("10000.00")));
        produtos.add(new Produto(5, "Dell XPS 15", new BigDecimal("9500.00")));
        produtos.add(new Produto(6, "Google Pixel 6", new BigDecimal("4000.00")));
        produtos.add(new Produto(7, "Apple iPhone 13", new BigDecimal("8000.00")));
        produtos.add(new Produto(8, "Samsung Galaxy S21", new BigDecimal("5000.00")));
        produtos.add(new Produto(9, "Apple iPad Pro", new BigDecimal("6000.00")));
        produtos.add(new Produto(10, "Amazon Kindle Oasis", new BigDecimal("1500.00")));
        produtos.add(new Produto(11, "Logitech MX Master 3", new BigDecimal("700.00")));
        produtos.add(new Produto(12, "Corsair K95 RGB Platinum", new BigDecimal("1200.00")));
        produtos.add(new Produto(13, "Asus ROG Swift PG279Q", new BigDecimal("2500.00")));
        produtos.add(new Produto(14, "Bose QuietComfort 35 II", new BigDecimal("1500.00")));
        produtos.add(new Produto(15, "Sony WH-1000XM4", new BigDecimal("1800.00")));
        produtos.add(new Produto(16, "Apple AirPods Pro", new BigDecimal("1200.00")));
        produtos.add(new Produto(17, "WD Black SN850 1TB", new BigDecimal("1000.00")));
        produtos.add(new Produto(18, "Samsung 980 Pro 1TB", new BigDecimal("900.00")));
        produtos.add(new Produto(19, "Intel Core i9-10900K", new BigDecimal("3000.00")));
        produtos.add(new Produto(20, "AMD Ryzen 9 5950X", new BigDecimal("3200.00")));

        for (Produto produto : produtos) {
            relacaoParaConsulta.put(produto.getCodigo(), produto);
        }

    }
}
