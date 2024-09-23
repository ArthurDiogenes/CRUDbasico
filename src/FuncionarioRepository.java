import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void criar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listar() {
        return funcionarios;
    }

    public Funcionario buscarPorId(int id) {
        return funcionarios.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
    }

    public void atualizar(Funcionario funcionario) {
        Funcionario funcionarioExistente = buscarPorId(funcionario.getId());
        if (funcionarioExistente != null) {
            funcionarioExistente.setNome(funcionario.getNome());
            funcionarioExistente.setCargo(funcionario.getCargo());
        }
    }

    public void deletar(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
    }
}
