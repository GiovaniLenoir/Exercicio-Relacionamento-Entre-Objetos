public class Funcionario {
    private String nome;
    private String matricula;
    private int departamento;
    private double salario;

    public Funcionario(String nome, String matricula, int departamento, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", departamento=" + departamento +
                ", salario=" + salario +
                '}';
    }
}

