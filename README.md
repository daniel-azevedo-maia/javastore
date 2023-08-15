JavaStore é um projeto Java simples que simula uma loja online com um conjunto básico de funcionalidades. 
O usuário pode adicionar produtos a um carrinho, consultar preços de produtos e gerenciar um carrinho de compras.

Classes:

Main
É o ponto de entrada do programa. Responsável por:

Apresentar o software ao usuário.
Exibir um menu com as opções disponíveis.
Tratar as opções selecionadas pelo usuário.
Gerenciar as entradas e saídas do programa.

BancoDeDadosFicticio
Como o nome sugere, essa classe simula um banco de dados com uma lista predefinida de produtos e um mapa para consulta rápida de produtos por código.

Carrinho
Representa o carrinho de compras do usuário.

Produto
Representa um produto individual com atributos como código, nome e preço.

Funcionalidades
Comprar produto (criar novo carrinho/adicionar item): Esta opção permite ao usuário inserir um novo produto, especificando seu nome e preço, que é então adicionado ao carrinho.
Consultar preço de produto: Ao escolher esta opção, o usuário verá uma lista de produtos disponíveis. Ele pode inserir o ID do produto para obter detalhes sobre o nome e o preço desse produto.
Gerenciar carrinho de produtos (adicionar/remover itens): Essa opção ainda não foi implementada (marcada como TODO).
Sair: Encerra o programa.

Como Executar
Compile todas as classes Java usando javac.
Execute a classe Main usando java Main.

Notas
A função de limpeza da tela está configurada para imprimir várias linhas em branco, o que pode não ser a abordagem mais eficaz para todos os sistemas.
O "banco de dados" é apenas uma simulação e os dados não são persistentes.

Autor:
Desenvolvido por Daniel Azevedo de O. Maia - 2023.
