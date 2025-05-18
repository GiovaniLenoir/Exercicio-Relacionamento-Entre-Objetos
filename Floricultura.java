import java.util.ArrayList;

public class Floricultura {
    private ArrayList<Flor> flores;

    public Floricultura() {
        flores = new ArrayList<>();
    }

    public void adicionarFlor(Flor flor) {
        flores.add(flor);
    }

    public Flor florMaisCara() {
        Flor maisCara = flores.get(0);
        for (Flor flor : flores) {
            if (flor.getPreco() > maisCara.getPreco()) {
                maisCara = flor;
            }
        }
        return maisCara;
    }

    public void compararReceita() {
        double receitaPresente = 0;
        double receitaNaoPresente = 0;

        for (Flor flor : flores) {
            if (flor.isPresente()) {
                receitaPresente += flor.getPreco();
            } else {
                receitaNaoPresente += flor.getPreco();
            }
        }

        System.out.println("Receita com flores para presente: R$" + receitaPresente);
        System.out.println("Receita com flores normais: R$" + receitaNaoPresente);

        if (receitaPresente > receitaNaoPresente) {
            System.out.println("A loja teve mais receita com flores para presente.");
        } else if (receitaNaoPresente > receitaPresente) {
            System.out.println("A loja teve mais receita com flores não para presente.");
        } else {
            System.out.println("As receitas foram iguais.");
        }
    }

    public void imprimirTodas() {
        for (Flor flor : flores) {
            System.out.println(flor);
        }
    }

    public static void main(String[] args) {
        Floricultura loja = new Floricultura();

        try {
            loja.adicionarFlor(new Flor("Rosa", 10.0, "Maria", true));
            loja.adicionarFlor(new Flor("Lírio", 15.5, "João", false));
            loja.adicionarFlor(new Flor("Tulipa", 20.0, "Ana", true));
            loja.adicionarFlor(new Flor("Orquídea", 25.0, "Carlos", false));
            loja.adicionarFlor(new Flor("Girassol", 12.0, "Bianca", true));

            System.out.println("Todas as flores vendidas:");
            loja.imprimirTodas();

            System.out.println("\nFlor mais cara:");
            System.out.println(loja.florMaisCara());

            System.out.println("\nComparação de receita:");
            loja.compararReceita();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

