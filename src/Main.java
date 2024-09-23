import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nSistema de Gerenciamento:");
            System.out.println("1. Criar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto por ID");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Deletar Produto");
            System.out.println("6. Criar Funcionário");
            System.out.println("7. Listar Funcionários");
            System.out.println("8. Buscar Funcionário por ID");
            System.out.println("9. Atualizar Funcionário");
            System.out.println("10. Deletar Funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Criar Produto
                    System.out.print("Digite o ID do produto: ");
                    int idCriarProduto = scanner.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    String nomeCriarProduto = scanner.next();
                    System.out.print("Digite o preço do produto: ");
                    double precoCriarProduto = scanner.nextDouble();
                    produtoController.criarProduto(idCriarProduto, nomeCriarProduto, precoCriarProduto);
                    break;

                case 2:
                    // Listar Produtos
                    produtoController.listarProdutos();
                    break;

                case 3:
                    // Buscar Produto por ID
                    System.out.print("Digite o ID do produto: ");
                    int idBuscarProduto = scanner.nextInt();
                    produtoController.buscarProdutoPorId(idBuscarProduto);
                    break;

                case 4:
                    // Atualizar Produto
                    System.out.print("Digite o ID do produto a ser atualizado: ");
                    int idAtualizarProduto = scanner.nextInt();
                    System.out.print("Digite o novo nome do produto: ");
                    String nomeAtualizarProduto = scanner.next();
                    System.out.print("Digite o novo preço do produto: ");
                    double precoAtualizarProduto = scanner.nextDouble();
                    produtoController.atualizarProduto(idAtualizarProduto, nomeAtualizarProduto, precoAtualizarProduto);
                    break;

                case 5:
                    // Deletar Produto
                    System.out.print("Digite o ID do produto a ser deletado: ");
                    int idDeletarProduto = scanner.nextInt();
                    produtoController.deletarProduto(idDeletarProduto);
                    break;

                case 6:
                    // Criar Funcionário
                    System.out.print("Digite o ID do funcionário: ");
                    int idCriarFuncionario = scanner.nextInt();
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeCriarFuncionario = scanner.next();
                    System.out.print("Digite o cargo do funcionário: ");
                    String cargoCriarFuncionario = scanner.next();
                    funcionarioController.criarFuncionario(idCriarFuncionario, nomeCriarFuncionario, cargoCriarFuncionario);
                    break;

                case 7:
                    // Listar Funcionários
                    funcionarioController.listarFuncionarios();
                    break;

                case 8:
                    // Buscar Funcionário por ID
                    System.out.print("Digite o ID do funcionário: ");
                    int idBuscarFuncionario = scanner.nextInt();
                    funcionarioController.buscarFuncionarioPorId(idBuscarFuncionario);
                    break;

                case 9:
                    // Atualizar Funcionário
                    System.out.print("Digite o ID do funcionário a ser atualizado: ");
                    int idAtualizarFuncionario = scanner.nextInt();
                    System.out.print("Digite o novo nome do funcionário: ");
                    String nomeAtualizarFuncionario = scanner.next();
                    System.out.print("Digite o novo cargo do funcionário: ");
                    String cargoAtualizarFuncionario = scanner.next();
                    funcionarioController.atualizarFuncionario(idAtualizarFuncionario, nomeAtualizarFuncionario, cargoAtualizarFuncionario);
                    break;

                case 10:
                    // Deletar Funcionário
                    System.out.print("Digite o ID do funcionário a ser deletado: ");
                    int idDeletarFuncionario = scanner.nextInt();
                    funcionarioController.deletarFuncionario(idDeletarFuncionario);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
