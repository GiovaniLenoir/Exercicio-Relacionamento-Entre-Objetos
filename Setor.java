import java.util.ArrayList;
import java.util.List;

public class Setor {
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public double totalFolhaDePagamentoSetor() {
        double total = 0;
        for (Funcionario funcionario : listaFuncionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    public double totalFolhaDePagamentoDept(int departamento) {
        double total = 0;
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getDepartamento() == departamento) {
                total += funcionario.getSalario();
            }
        }
        return total;
    }

    public Funcionario funcionarioMaiorSalario() {
        if (listaFuncionarios.isEmpty()) {
            return null;
        }

        Funcionario maior = listaFuncionarios.get(0);
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getSalario() > maior.getSalario()) {
                maior = funcionario;
            }
        }
        return maior;
    }

    public Funcionario acharFuncionario(String nome, String matricula) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNome().equals(nome) && funcionario.getMatricula().equals(matricula)) {
                return funcionario;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Setor setor = new Setor();

        setor.adicionarFuncionario(new Funcionario("João", "001", 10, 3000.0));
        setor.adicionarFuncionario(new Funcionario("Maria", "002", 20, 4500.0));
        setor.adicionarFuncionario(new Funcionario("Carlos", "003", 10, 5000.0));

        System.out.println("Total da folha do setor: R$" + setor.totalFolhaDePagamentoSetor());
        System.out.println("Total da folha do departamento 10: R$" + setor.totalFolhaDePagamentoDept(10));

        Funcionario maiorSalario = setor.funcionarioMaiorSalario();
        if (maiorSalario != null) {
            System.out.println("Funcionário com maior salário: " + maiorSalario.getNome());
        }

        Funcionario achado = setor.acharFuncionario("Maria", "002");
        if (achado != null) {
            System.out.println("Funcionário encontrado: " + achado.getNome() + ", matrícula: " + achado.getMatricula());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}

