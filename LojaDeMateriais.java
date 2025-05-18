import java.util.ArrayList;

public class LojaDeMateriais {
    private ArrayList<Material> materiais;

    public LojaDeMateriais() {
        materiais = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) {
        materiais.add(material);
    }

    public Material materialMaisCaro() {
        Material maisCaro = materiais.get(0);
        for (Material material : materiais) {
            if (material.getPreco() > maisCaro.getPreco()) {
                maisCaro = material;
            }
        }
        return maisCaro;
    }

    public Material materialMaisCaroPorMetroCubico() {
        Material maisCaroPorMetroCubico = materiais.get(0);
        for (Material material : materiais) {
            if (material.calcularPrecoPorMetroCubico() > maisCaroPorMetroCubico.calcularPrecoPorMetroCubico()) {
                maisCaroPorMetroCubico = material;
            }
        }
        return maisCaroPorMetroCubico;
    }

    public Material materialMaisDenso() {
        Material maisDenso = materiais.get(0);
        for (Material material : materiais) {
            if (material.calcularDensidade() > maisDenso.calcularDensidade()) {
                maisDenso = material;
            }
        }
        return maisDenso;
    }

    public Material materialQueMaisOcupaEspaco() {
        Material maiorEspaco = materiais.get(0);
        for (Material material : materiais) {
            if (material.getVolume() > maiorEspaco.getVolume()) {
                maiorEspaco = material;
            }
        }
        return maiorEspaco;
    }

    public void imprimirTodos() {
        for (Material material : materiais) {
            System.out.println(material);
        }
    }

    public static void main(String[] args) {
        LojaDeMateriais loja = new LojaDeMateriais();

        try {
            loja.adicionarMaterial(new Material("Cimento", "Cimento Portland", 25.0, 0.01, 50.0, 100));
            loja.adicionarMaterial(new Material("Tijolo", "Tijolo cerâmico", 1.5, 0.002, 3.5, 500));
            loja.adicionarMaterial(new Material("Areia", "Areia fina", 15.0, 0.1, 120.0, 200));
            loja.adicionarMaterial(new Material("Gravilha", "Gravilha média", 20.0, 0.08, 150.0, 150));

            System.out.println("Todos os materiais disponíveis:");
            loja.imprimirTodos();

            System.out.println("\nMaterial mais caro:");
            System.out.println(loja.materialMaisCaro());

            System.out.println("\nMaterial mais caro por metro cúbico:");
            System.out.println(loja.materialMaisCaroPorMetroCubico());

            System.out.println("\nMaterial mais denso:");
            System.out.println(loja.materialMaisDenso());

            System.out.println("\nMaterial que mais ocupa espaço no estoque:");
            System.out.println(loja.materialQueMaisOcupaEspaco());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

