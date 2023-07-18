import com.sun.source.tree.TryTree;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static final int NUMERO_ALEATORIO_GRANDE_PARA_LIMPAR_TELA = 200;

    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        apresentacao();

        String continuar = "";

        Carrinho carrinho = new Carrinho();

        do {

            mostraMenu();

            int opcao = verificaOpcaoUsuario(input);

            limpaTela();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = input.nextLine();

                    System.out.print("Valor do produto: R$ ");
                    String preco = input.next();
                    BigDecimal precoBigDecimal;

                    try {
                        precoBigDecimal= new BigDecimal(preco);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida para o preço do produto. Tente novamente com um número válido.");
                        continue; // isso irá pular o restante do código na iteração atual do loop e iniciar a próxima iteração
                    }

                    System.out.print("Quantidade: ");
                    int quantidade = input.nextInt();

                    Produto produto = new Produto();
                    produto.setNome(nome);
                    produto.setPreco(precoBigDecimal);
                    produto.setQuantidade(quantidade);

                    carrinho.adicionarItem(produto);

                    break;

                case 2:
                    System.out.println("Segunda opção selecionada.");
                    break;

                case 3:
                    System.out.println("Terceira opção selecionada.");
                    break;

                case 4:
                    System.out.println("\nVolte sempre!");
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida/inexistente...");
            }

            System.out.print("\nDeseja continuar? [S/N] ");
            continuar = input.next();

            limpaTela();

        } while (!continuar.equalsIgnoreCase("N"));

        input.close();
        System.out.println("\nVolte sempre!");
    }

    private static void apresentacao() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("    \nDesenvolvido por Daniel Azevedo de O. Maia - 2023    ");
        Thread.sleep(1000);
        System.out.println("    \nSeja bem vindo(a) à JavaStore!    ");
        Thread.sleep(1000);
    }

    private static int verificaOpcaoUsuario(Scanner input) {

        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {

            System.out.print("\t\tOpção: ");

            try {
                opcao = input.nextInt();
                input.nextLine();  // Consumir o '\n' que ainda está no buffer
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Você não pode digitar caracteres alfabéticos!");
                input.nextLine();
            }
        }

        return opcao;

    }

    private static void mostraMenu() {

        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RESET = "\u001B[0m";

        System.out.println(ANSI_BLUE + "\n+-------------------------------------------------------------+");
        System.out.println("|                            MENU                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| 1. Comprar produto (criar novo carrinho/adicionar item)     |");
        System.out.println("| 2. Consultar preço de produto                               |");
        System.out.println("| 3. Gerenciar carrinho de produtos (adicionar/remover itens) |");
        System.out.println("| 4. Sair                                                     |");
        System.out.println("+-------------------------------------------------------------+" + ANSI_RESET);
    }

    private static void limpaTela() {
        for(int i = 0; i < NUMERO_ALEATORIO_GRANDE_PARA_LIMPAR_TELA; i++) {
            System.out.println("\n");
        }
    }

}