public class Computador {
    private String numeroSerie;
    private String modeloProcessador;
    private double clockGHz;
    private int armazenamentoGB;
    private int memoriaRAMGB;
    private int consumoW;
    private int potenciaFonteW;
    private boolean permiteOverclock;
    private double clockOriginal;

    public Computador(String numeroSerie, String modeloProcessador, double clockGHz,
                      int armazenamentoGB, int memoriaRAMGB, int consumoW, int potenciaFonteW) {
        this.numeroSerie = numeroSerie;
        this.modeloProcessador = modeloProcessador;
        this.clockGHz = clockGHz;
        this.clockOriginal = clockGHz;
        this.armazenamentoGB = armazenamentoGB;
        this.memoriaRAMGB = memoriaRAMGB;
        this.consumoW = consumoW;
        this.potenciaFonteW = potenciaFonteW;
        this.permiteOverclock = modeloProcessador.endsWith("K") ||
                modeloProcessador.endsWith("KF") ||
                modeloProcessador.endsWith("X");
    }

    public String fazerOverclock(int incrementoMHz) {
        if (!permiteOverclock) {
            return numeroSerie + ": Overclock não permitido para este processador.";
        }

        double incrementoGHz = incrementoMHz / 1000.0;
        double maxIncremento = clockOriginal * 0.10;

        if (incrementoGHz > maxIncremento) {
            return numeroSerie + ": Incremento excede 10% do clock original.";
        }

        int adicionalConsumo = (incrementoMHz / 100) * 75;
        int novoConsumo = consumoW + adicionalConsumo;

        if (novoConsumo > potenciaFonteW * 0.95) {
            return numeroSerie + ": Consumo excede 95% da potência da fonte.";
        }

        this.clockGHz += incrementoGHz;
        this.consumoW = novoConsumo;

        return numeroSerie + ": Overclock aplicado. Novo clock: " + String.format("%.2f", clockGHz)
                + " GHz, Consumo: " + consumoW + "W";
    }

    public int getArmazenamentoGB() {
        return armazenamentoGB;
    }

    public int getConsumoW() {
        return consumoW;
    }
}

