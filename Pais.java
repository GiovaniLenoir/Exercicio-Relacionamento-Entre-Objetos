import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private double dimensao;
    private List<Pais> paisesDeFronteira = new ArrayList<>();

    public Pais(String nome, double dimensao) {
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void adicionarPaisesDeFronteira(Pais pais) {
        paisesDeFronteira.add(pais);
    }

    public boolean fazFronteira(Pais pais) {
        return paisesDeFronteira.contains(pais);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", dimensao=" + dimensao +
                ", paisesDeFronteira=" + paisesDeFronteira +
                '}';
    }

    public List<Pais> fronteirasIguais(Pais outroPais) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais pais : paisesDeFronteira) {
            if (outroPais.paisesDeFronteira.contains(pais)) {
                comuns.add(pais);
            }
        }
        return comuns;
    }
}

