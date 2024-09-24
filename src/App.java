import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Selecione uma opcao:");
            System.out.println("1. Gerenciar Produtos");
            System.out.println("2. Gerenciar Funcionários");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciarProdutos(produtoController, scanner);
                    break;
                case 2:
                    gerenciarFuncionarios(funcionarioController, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        scanner.close();
    }

    public static void gerenciarProdutos(ProdutoController produtoController, Scanner scanner) {
        int opcaoProduto = -1;

        while (opcaoProduto != 0) {
            System.out.println("\nGerenciamento de Produtos:");
            System.out.println("1. Criar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto por ID");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Deletar Produto");
            System.out.println("0. Voltar ao Menu Principal");
            opcaoProduto = scanner.nextInt();

            switch (opcaoProduto) {
                case 1:
                    System.out.println("Informe o ID do produto:");
                    int idProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o nome do produto:");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Informe o preço do produto:");
                    double precoProduto = scanner.nextDouble();
                    produtoController.criarProduto(idProduto, nomeProduto, precoProduto);
                    break;
                case 2:
                    produtoController.listarProdutos();
                    break;
                case 3:
                    System.out.println("Informe o ID do produto:");
                    int idBuscarProduto = scanner.nextInt();
                    produtoController.buscarProdutoPorId(idBuscarProduto);
                    break;
                case 4:
                    System.out.println("Informe o ID do produto que deseja atualizar:");
                    int idAtualizarProduto = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Informe o novo nome do produto:");
                    String novoNomeProduto = scanner.nextLine();
                    System.out.println("Informe o novo preço do produto:");
                    double novoPrecoProduto = scanner.nextDouble();
                    produtoController.atualizarProduto(idAtualizarProduto, novoNomeProduto, novoPrecoProduto);
                    break;
                case 5:
                    System.out.println("Informe o ID do produto que deseja deletar:");
                    int idDeletarProduto = scanner.nextInt();
                    produtoController.deletarProduto(idDeletarProduto);
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    public static void gerenciarFuncionarios(FuncionarioController funcionarioController, Scanner scanner) {
        int opcaoFuncionario = -1;

        while (opcaoFuncionario != 0) {
            System.out.println("\nGerenciamento de Funcionários:");
            System.out.println("1. Criar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Buscar Funcionário por ID");
            System.out.println("4. Atualizar Funcionário");
            System.out.println("5. Deletar Funcionário");
            System.out.println("0. Voltar ao Menu Principal");
            opcaoFuncionario = scanner.nextInt();

            switch (opcaoFuncionario) {
                case 1:
                    System.out.println("Informe o ID do funcionário:");
                    int idFuncionario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o nome do funcionário:");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.println("Informe o cargo do funcionário:");
                    String cargoFuncionario = scanner.nextLine();
                    funcionarioController.criarFuncionario(idFuncionario, nomeFuncionario, cargoFuncionario);
                    break;
                case 2:
                    funcionarioController.listarFuncionarios();
                    break;
                case 3:
                    System.out.println("Informe o ID do funcionário:");
                    int idBuscarFuncionario = scanner.nextInt();
                    funcionarioController.buscarFuncionarioPorId(idBuscarFuncionario);
                    break;
                case 4:
                    System.out.println("Informe o ID do funcionário que deseja atualizar:");
                    int idAtualizarFuncionario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o novo nome do funcionário:");
                    String novoNomeFuncionario = scanner.nextLine();
                    System.out.println("Informe o novo cargo do funcionário:");
                    String novoCargoFuncionario = scanner.nextLine();
                    funcionarioController.atualizarFuncionario(idAtualizarFuncionario, novoNomeFuncionario, novoCargoFuncionario);
                    break;
                case 5:
                    System.out.println("Informe o ID do funcionário que deseja deletar:");
                    int idDeletarFuncionario = scanner.nextInt();
                    funcionarioController.deletarFuncionario(idDeletarFuncionario);
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}
