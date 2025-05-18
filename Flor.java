public class Flor {
    private String nomeFlor;
    private double preco;
    private String nomeCliente;
    private boolean presente;

    public Flor(String nomeFlor, double preco, String nomeCliente, boolean presente) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.nomeFlor = nomeFlor;
        this.preco = preco;
        this.nomeCliente = nomeCliente;
        this.presente = presente;
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        this.nomeFlor = nomeFlor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "Flor [Nome: " + nomeFlor + ", Preço: R$" + preco +
                ", Cliente: " + nomeCliente + ", Presente: " + (presente ? "Sim" : "Não") + "]";
    }
}

