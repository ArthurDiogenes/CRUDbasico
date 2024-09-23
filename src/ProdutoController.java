public class ProdutoController {
    private ProdutoRepository repository = new ProdutoRepository();

    // criar
    public void criarProduto(int id, String nome, double preco) {
        Produto produto = new Produto(id, nome, preco);
        repository.criar(produto);
        System.out.println("Produto criado com sucesso!");
    }

    // listar
    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        repository.listar().forEach(p -> {
            System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome() + ", Preço: " + p.getPreco());
        });
    }

    // buscar por id
    public void buscarProdutoPorId(int id) {
        Produto produto = repository.buscarPorId(id);
        if (produto != null) {
            System.out.println("Produto encontrado: ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    // update
    public void atualizarProduto(int id, String novoNome, double novoPreco) {
        Produto produtoAtualizado = new Produto(id, novoNome, novoPreco);
        repository.atualizar(produtoAtualizado);
        System.out.println("Produto atualizado com sucesso!");
    }

    // delete
    public void deletarProduto(int id) {
        repository.deletar(id);
        System.out.println("Produto deletado com sucesso!");
    }
}
