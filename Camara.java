import java.util.*;

public class Camara {
    private List<Vereador> vereadores;

    public Camara() {
        vereadores = new ArrayList<>();
    }

    public void adicionarVereador(Vereador vereador) {
        vereadores.add(vereador);
    }

    public int totalProjetosApresentados() {
        int total = 0;
        for (Vereador vereador : vereadores) {
            total += vereador.getProjetosApresentados();
        }
        return total;
    }

    public int totalProjetosAprovados() {
        int total = 0;
        for (Vereador vereador : vereadores) {
            total += vereador.getProjetosAprovados();
        }
        return total;
    }

    public Vereador vereadorMaisProjetosAprovados() {
        Vereador melhor = vereadores.get(0);
        for (Vereador vereador : vereadores) {
            if (vereador.getProjetosAprovados() > melhor.getProjetosAprovados()) {
                melhor = vereador;
            }
        }
        return melhor;
    }

    public Vereador vereadorMaiorDesempenho() {
        Vereador melhor = vereadores.get(0);
        for (Vereador vereador : vereadores) {
            if (vereador.getDesempenho() > melhor.getDesempenho()) {
                melhor = vereador;
            }
        }
        return melhor;
    }

    public double desempenhoMedio() {
        double soma = 0;
        for (Vereador vereador : vereadores) {
            soma += vereador.getDesempenho();
        }
        return soma / vereadores.size();
    }

    public List<Vereador> vereadoresAcimaDaMedia() {
        double media = desempenhoMedio();
        List<Vereador> acima = new ArrayList<>();
        for (Vereador vereador : vereadores) {
            if (vereador.getDesempenho() > media) {
                acima.add(vereador);
            }
        }
        return acima;
    }

    public String partidoMelhorDesempenhoMedio() {
        Map<String, List<Double>> desempenhoPorPartido = new HashMap<>();

        for (Vereador vereador : vereadores) {
            desempenhoPorPartido
                    .computeIfAbsent(vereador.getPartido(), k -> new ArrayList<>())
                    .add(vereador.getDesempenho());
        }

        String melhorPartido = null;
        double melhorMedia = 0;

        for (String partido : desempenhoPorPartido.keySet()) {
            List<Double> desempenhos = desempenhoPorPartido.get(partido);
            double media = desempenhos.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            if (media > melhorMedia) {
                melhorMedia = media;
                melhorPartido = partido;
            }
        }

        return melhorPartido + " (Média: " + String.format("%.2f", melhorMedia) + ")";
    }

    public static void main(String[] args) {
        Camara camara = new Camara();

        camara.adicionarVereador(new Vereador("João", "ABC", 10, 6));
        camara.adicionarVereador(new Vereador("Maria", "DEF", 18, 15));
        camara.adicionarVereador(new Vereador("Carlos", "ABC", 4, 2));
        camara.adicionarVereador(new Vereador("Ana", "XYZ", 7, 3));
        camara.adicionarVereador(new Vereador("Beatriz", "XYZ", 0, 0));

        System.out.println("=== Vereadores ===");
        camara.vereadores.forEach(System.out::println);

        System.out.println("\nTotal de projetos apresentados: " + camara.totalProjetosApresentados());
        System.out.println("Total de projetos aprovados: " + camara.totalProjetosAprovados());

        System.out.println("\nVereador com mais projetos aprovados: " + camara.vereadorMaisProjetosAprovados().getNome());
        System.out.println("Vereador com maior desempenho: " + camara.vereadorMaiorDesempenho().getNome());

        System.out.println("\nDesempenho médio da câmara: " + String.format("%.2f", camara.desempenhoMedio()));
        System.out.println("\nVereadores com desempenho acima da média:");
        camara.vereadoresAcimaDaMedia().forEach(System.out::println);

        System.out.println("\nPartido com melhor desempenho médio: " + camara.partidoMelhorDesempenhoMedio());
    }
}

