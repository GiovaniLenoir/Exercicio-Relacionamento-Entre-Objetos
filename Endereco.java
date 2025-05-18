public class Endereco {
    private String logradouro;
    private String complemento;
    private int numero;

    public Endereco(String logradouro, String complemento, int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número deve ser maior que zero.");
        }
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereço: " + logradouro + ", Nº " + numero + ", " + complemento;
    }
}

