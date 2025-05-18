public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        if (altura <= 0 || largura <= 0) {
            throw new IllegalArgumentException("Altura e largura devem ser maiores que zero.");
        }
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura deve ser maior que zero.");
        }
        this.largura = largura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String toString() {
        return "Retangulo [altura=" + altura + ", largura=" + largura +
                ", área=" + calcularArea() +
                ", perímetro=" + calcularPerimetro() + "]";
    }
}

