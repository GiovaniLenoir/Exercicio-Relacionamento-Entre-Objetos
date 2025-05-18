import java.util.ArrayList;

public class GerenciadorRetangulos {
    private ArrayList<Retangulo> retangulos;

    public GerenciadorRetangulos() {
        retangulos = new ArrayList<>();
    }

    public void adicionarRetangulo(Retangulo retangulo) {
        retangulos.add(retangulo);
    }

    public Retangulo retanguloMaiorArea() {
        Retangulo maior = retangulos.get(0);
        for (Retangulo retangulo : retangulos) {
            if (retangulo.calcularArea() > maior.calcularArea()) {
                maior = retangulo;
            }
        }
        return maior;
    }

    public Retangulo retanguloMaiorPerimetro() {
        Retangulo maior = retangulos.get(0);
        for (Retangulo retangulo : retangulos) {
            if (retangulo.calcularPerimetro() > maior.calcularPerimetro()) {
                maior = retangulo;
            }
        }
        return maior;
    }

    public void imprimirTodos() {
        for (Retangulo retangulo : retangulos) {
            System.out.println(retangulo);
        }
    }

    public static void main(String[] args) {
        GerenciadorRetangulos gerenciador = new GerenciadorRetangulos();

        try {
            gerenciador.adicionarRetangulo(new Retangulo(4, 5));
            gerenciador.adicionarRetangulo(new Retangulo(3, 6));
            gerenciador.adicionarRetangulo(new Retangulo(7, 2));
            gerenciador.adicionarRetangulo(new Retangulo(5, 5));
            gerenciador.adicionarRetangulo(new Retangulo(6, 3));

            System.out.println("Todos os retângulos:");
            gerenciador.imprimirTodos();

            System.out.println("\nRetângulo com maior área:");
            System.out.println(gerenciador.retanguloMaiorArea());

            System.out.println("\nRetângulo com maior perímetro:");
            System.out.println(gerenciador.retanguloMaiorPerimetro());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar retângulo: " + e.getMessage());
        }
    }
}
