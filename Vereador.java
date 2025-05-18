public class Vereador {
    private String nome;
    private String partido;
    private int projetosApresentados;
    private int projetosAprovados;

    public Vereador(String nome, String partido, int projetosApresentados, int projetosAprovados) {
        if (projetosApresentados < 0 || projetosAprovados < 0 || projetosAprovados > projetosApresentados) {
            throw new IllegalArgumentException("Dados inválidos para projetos.");
        }
        this.nome = nome;
        this.partido = partido;
        this.projetosApresentados = projetosApresentados;
        this.projetosAprovados = projetosAprovados;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getProjetosApresentados() {
        return projetosApresentados;
    }

    public int getProjetosAprovados() {
        return projetosAprovados;
    }

    public double getDesempenho() {
        if (projetosApresentados == 0) return 0.0;

        double indiceTrabalho;
        if (projetosApresentados <= 5) {
            indiceTrabalho = 0.80;
        } else if (projetosApresentados <= 10) {
            indiceTrabalho = 1.00;
        } else if (projetosApresentados <= 17) {
            indiceTrabalho = 1.08;
        } else {
            indiceTrabalho = 1.22;
        }

        return ((double) projetosAprovados / projetosApresentados) * indiceTrabalho;
    }

    @Override
    public String toString() {
        return "Vereador: " + nome + " | Partido: " + partido +
                " | Apresentados: " + projetosApresentados +
                " | Aprovados: " + projetosAprovados +
                " | Desempenho: " + String.format("%.2f", getDesempenho());
    }
}

