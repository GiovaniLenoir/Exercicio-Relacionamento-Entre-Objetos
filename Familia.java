import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Familia {
    private List<Gente> listaPessoas = new ArrayList<>();

    public void adicionarPessoas(Gente gente) {
        listaPessoas.add(gente);
    }

    public Gente pessoaMaisVelha() {
        if (listaPessoas.isEmpty()) {
            return null;
        }

        Gente maisVelha = listaPessoas.get(0);
        for (Gente gente : listaPessoas) {
            if (gente.getDataNascimento().isBefore(maisVelha.getDataNascimento())) {
                maisVelha = gente;
            }
        }
        return maisVelha;
    }

    public static void main(String[] args) {
        Familia familia = new Familia();
        familia.adicionarPessoas(new Gente("João", LocalDate.of(1990, 5, 10)));
        familia.adicionarPessoas(new Gente("Maria", LocalDate.of(1985, 3, 15)));
        familia.adicionarPessoas(new Gente("Pedro", LocalDate.of(2000, 8, 25)));

        Gente maisVelha = familia.pessoaMaisVelha();
        if (maisVelha != null) {
            System.out.println("Pessoa mais velha: " + maisVelha.getNome());
        } else {
            System.out.println("Nenhuma pessoa na família.");
        }
    }
}


