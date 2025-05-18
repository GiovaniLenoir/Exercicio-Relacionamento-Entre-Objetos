import java.util.ArrayList;

public class Laboratorio {
    private ArrayList<Computador> computadores;

    public Laboratorio() {
        computadores = new ArrayList<>();
    }

    public void adicionarComputador(Computador computador) {
        computadores.add(computador);
    }

    public int getArmazenamentoTotal() {
        int total = 0;
        for (Computador computador : computadores) {
            total += computador.getArmazenamentoGB();
        }
        return total;
    }

    public int getConsumoTotalSala() {
        int total = 0;
        for (Computador computador : computadores) {
            total += computador.getConsumoW();
        }
        return total;
    }

    public double getPotenciaMinima3Salas() {
        return getConsumoTotalSala() * 3 * 1.10; // 10% extra
    }

    public double getGastoDiarioEnergia3Salas() {
        int consumoTotalW = getConsumoTotalSala() * 3;
        double consumoKW = consumoTotalW / 1000.0;
        double horasPorDia = 12;
        double precoKWh = 0.71;
        return consumoKW * horasPorDia * precoKWh;
    }

    public static void main(String[] args) {
        Laboratorio lab = new Laboratorio();

        Computador c1 = new Computador("SN001", "Intel Core i7-13700KF", 5.4, 512, 16, 500, 850);
        Computador c2 = new Computador("SN002", "AMD Ryzen 9 5950X", 4.9, 1024, 32, 500, 1000);
        Computador c3 = new Computador("SN003", "Intel Core i5-9400F", 4.1, 256, 8, 400, 600);
        Computador c4 = new Computador("SN004", "AMD Ryzen 7 3700X", 4.4, 512, 16, 450, 750);

        lab.adicionarComputador(c1);
        lab.adicionarComputador(c2);
        lab.adicionarComputador(c3);
        lab.adicionarComputador(c4);

        System.out.println("Armazenamento total do laboratório: " + lab.getArmazenamentoTotal() + " GB");
        System.out.println("Potência mínima para 3 salas: " + lab.getPotenciaMinima3Salas() + " W");
        System.out.printf("Gasto diário com energia (3 salas, 12h/dia): R$ %.2f\n", lab.getGastoDiarioEnergia3Salas());

        System.out.println(c1.fazerOverclock(300));
        System.out.println(c2.fazerOverclock(500));
        System.out.println(c3.fazerOverclock(200));
        System.out.println(c4.fazerOverclock(600));
    }
}

