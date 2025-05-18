public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + "\n" + endereco.toString();
    }

    public static void main(String[] args) {
        try {
            Endereco endereco1 = new Endereco("Rua das Flores", "Apto 202", 120);
            Endereco endereco2 = new Endereco("Av. Brasil", "Casa", 45);

            Pessoa pessoa1 = new Pessoa("Carlos Silva", endereco1);
            Pessoa pessoa2 = new Pessoa("Ana Souza", endereco2);

            System.out.println(pessoa1);
            System.out.println();
            System.out.println(pessoa2);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

