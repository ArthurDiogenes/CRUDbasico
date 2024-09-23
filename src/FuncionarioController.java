public class FuncionarioController {
    private FuncionarioRepository repository = new FuncionarioRepository();

    // criar
    public void criarFuncionario(int id, String nome, String cargo) {
        Funcionario funcionario = new Funcionario(id, nome, cargo);
        repository.criar(funcionario);
        System.out.println("Funcionário criado com sucesso!");
    }

    // listar
    public void listarFuncionarios() {
        System.out.println("Lista de Funcionários:");
        repository.listar().forEach(f -> {
            System.out.println("ID: " + f.getId() + ", Nome: " + f.getNome() + ", Cargo: " + f.getCargo());
        });
    }

    // buscar por id
    public void buscarFuncionarioPorId(int id) {
        Funcionario funcionario = repository.buscarPorId(id);
        if (funcionario != null) {
            System.out.println("Funcionário encontrado: ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }

    // update
    public void atualizarFuncionario(int id, String novoNome, String novoCargo) {
        Funcionario funcionarioAtualizado = new Funcionario(id, novoNome, novoCargo);
        repository.atualizar(funcionarioAtualizado);
        System.out.println("Funcionário atualizado com sucesso!");
    }

    // delete
    public void deletarFuncionario(int id) {
        repository.deletar(id);
        System.out.println("Funcionário deletado com sucesso!");
    }
}
