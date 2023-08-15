
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static final int LINHAS_PARA_LIMPAR_TELA = 200;
    public static final String AZUL = "\u001B[34m";
    public static final String RESETAR_FORMATACAO = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        apresentacao();

        String continuar = "";

        Carrinho carrinho = new Carrinho();
        new BancoDeDadosFicticio();

        do {

            mostraMenu();

            int opcao = validaOpcaoUsuario(input);

            limpaTela();

            switch (opcao) {

                case 1:

                    mostrarProdutosEstoque();

                    System.out.print("Informe ID do produto desejado: \n");

                    opcao = validaOpcaoUsuario(input);

                    while(!BancoDeDadosFicticio.relacaoParaConsulta.containsKey(opcao)) {
                        System.out.println("Este ID de produto não existe! Informe o ID correto!");
                        opcao = validaOpcaoUsuario(input);
                    }

                    Produto produto = BancoDeDadosFicticio.relacaoParaConsulta.get(opcao);

                    carrinho.adicionarItem(produto);

                    System.out.println(produto.getNome());

                    break;

                case 2:
                    mostrarProdutosEstoque();
                    System.out.print("Informe ID do produto para checar preço: \n");

                    opcao = validaOpcaoUsuario(input);

                    if (BancoDeDadosFicticio.relacaoParaConsulta.containsKey(opcao)) {
                        String nomeProdutoEncontrado = BancoDeDadosFicticio.relacaoParaConsulta.get(opcao).getNome();
                        BigDecimal precoProdutoEncontrado = BancoDeDadosFicticio.relacaoParaConsulta.get(opcao).getPreco();

                        System.out.println("\n----------------------------------------");
                        System.out.println("DADOS DO PRODUTO CONSULTADO: ");

                        System.out.println(nomeProdutoEncontrado);
                        System.out.println("R$ " + precoProdutoEncontrado);
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println("Produto inexistente!");
                    }


                    break;

                case 3:
                    // TODO Item 3 a ser implementado!
                    break;

                case 4:
                    System.out.println("\nVolte sempre!");
                    return;

                default:
                    System.out.println("Opção inválida ou inexistente...");
                    continue;
            }


            System.out.println("\n[ 1 ] Retornar ao menu principal");
            System.out.println("[ 2 ] Finalizar");
            System.out.print("Escolha uma das opções acima: \n");

            opcao = validaOpcaoUsuario(input);

            while (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida!");
                System.out.print("Escolha uma das opções acima: \n");
                opcao = validaOpcaoUsuario(input);
            }

            if (opcao == 2) {
                continuar = "N";
            }

            limpaTela();

        } while (!continuar.equalsIgnoreCase("N"));

        System.out.println("\nVolte sempre!");

        input.close();

    }

    private static void apresentacao() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("    \nDesenvolvido por Daniel Azevedo de O. Maia - 2023    ");
        Thread.sleep(1000);
        System.out.println("    \nSeja bem vindo(a) à JavaStore!    ");
        Thread.sleep(1000);
    }

    private static void mostraMenu() {

        System.out.println(AZUL + "\n+-------------------------------------------------------------+");
        System.out.println("|                            MENU                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| 1. Comprar produto (criar novo carrinho/adicionar item)     |");
        System.out.println("| 2. Consultar preço de produto                               |");
        System.out.println("| 3. Gerenciar carrinho de produtos (adicionar/remover itens) |");
        System.out.println("| 4. Sair                                                     |");
        System.out.println("+-------------------------------------------------------------+" + RESETAR_FORMATACAO);
    }

    private static int validaOpcaoUsuario(Scanner input) {

        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {

            System.out.print("\t\tOpção: ");

            try {
                opcao = input.nextInt();
                consumirBuffer(input);
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Você não pode digitar caracteres alfabéticos!");
                consumirBuffer(input);
            }
        }

        return opcao;

    }

    private static void limpaTela() {

        for (int i = 0; i < LINHAS_PARA_LIMPAR_TELA; i++) {
            System.out.println("\n");
        }
    }

    private static void mostrarProdutosEstoque() {

        List<Produto> estoque = BancoDeDadosFicticio.produtos;

        System.out.printf("%-10s %-30s\n", "Código", "Nome");
        System.out.println("-----------------------------------");
        for (Produto produto : estoque) {
            System.out.printf("%-10d %-30s\n",
                    produto.getCodigo(),
                    produto.getNome());
        }

        System.out.println();

    }

    private static void consumirBuffer(Scanner input) {
        input.nextLine();
    }


}