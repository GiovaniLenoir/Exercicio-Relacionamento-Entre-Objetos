import java.util.ArrayList;
import java.util.List;

public class InteiroPositivo {
    private int x;

    public InteiroPositivo(int valor) {
        setValor(valor);
    }

    /**
     * a) Setter com validação
     */
    public void setValor(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O número deve ser um inteiro positivo.");
        }
        this.x = valor;
    }

    public int getValor() {
        return x;
    }

    /**
     * b) Multiplicar por outro objeto InteiroPositivo
     * @param outro
     * @return
     */
    public int multiplicarPor(InteiroPositivo outro) {
        return this.x * outro.getValor();
    }

    /**
     * c) Fatorial de x
     * @return
     */
    public long fatorial() {
        long resultado = 1;
        for (int i = 2; i <= x; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * d) Divisores de x e a quantidade
     * @return
     */
    public List<Integer> getDivisores() {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    public int quantidadeDeDivisores() {
        return getDivisores().size();
    }

    /**
     * e) Série de Fibonacci com x elementos
     * @return
     */
    public List<Integer> fibonacci() {
        List<Integer> serie = new ArrayList<>();
        if (x <= 0) return serie;

        serie.add(1);
        if (x == 1) return serie;

        serie.add(1);
        for (int i = 2; i < x; i++) {
            int novo = serie.get(i - 1) + serie.get(i - 2);
            serie.add(novo);
        }
        return serie;
    }

    @Override
    public String toString() {
        return "InteiroPositivo [x=" + x + "]";
    }

    public static void main(String[] args) {
        try {
            InteiroPositivo num1 = new InteiroPositivo(12);
            InteiroPositivo num2 = new InteiroPositivo(5);

            System.out.println(num1);
            System.out.println("Multiplicação com " + num2.getValor() + ": " + num1.multiplicarPor(num2));
            System.out.println("Fatorial de " + num1.getValor() + ": " + num1.fatorial());
            System.out.println("Divisores de " + num1.getValor() + ": " + num1.getDivisores());
            System.out.println("Quantidade de divisores: " + num1.quantidadeDeDivisores());
            System.out.println("Fibonacci de " + num2.getValor() + " elementos: " + num2.fibonacci());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

