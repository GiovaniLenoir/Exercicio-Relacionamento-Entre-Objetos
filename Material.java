public class Material {
    private String nome;
    private String descricao;
    private double preco;
    private double volume;
    private double peso;
    private int quantidadeEmEstoque;

    public Material(String nome, String descricao, double preco, double volume, double peso, int quantidadeEmEstoque) {
        if (preco < 0 || volume <= 0 || peso <= 0 || quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("Valores inválidos para o material.");
        }
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("O volume deve ser maior que zero.");
        }
        this.volume = volume;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarUnidades(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a ser adicionada deve ser positiva.");
        }
        this.quantidadeEmEstoque += quantidade;
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a ser vendida deve ser positiva.");
        }
        if (quantidade > this.quantidadeEmEstoque) {
            throw new IllegalArgumentException("Quantidade insuficiente em estoque.");
        }
        this.quantidadeEmEstoque -= quantidade;
    }

    public void colocarEmPromocao(double porcentagemDesconto) {
        if (porcentagemDesconto < 0 || porcentagemDesconto > 100) {
            throw new IllegalArgumentException("A porcentagem de desconto deve ser entre 0 e 100.");
        }
        this.preco -= this.preco * (porcentagemDesconto / 100);
    }

    public double calcularPrecoPorMetroCubico() {
        return preco / volume;
    }

    public double calcularDensidade() {
        return peso / volume;
    }

    @Override
    public String toString() {
        return "Material [Nome: " + nome + ", Preço: R$" + preco + ", Volume: " + volume +
                "m³, Peso: " + peso + "kg, Estoque: " + quantidadeEmEstoque + "]";
    }
}

