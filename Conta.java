public class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor a ser sacado deve ser positivo.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso! Novo saldo: R$" + saldo);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor a ser depositado deve ser positivo.");
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Novo saldo: R$" + saldo);
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor a ser transferido deve ser positivo.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar a transferência.");
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + contaDestino.getNomeTitular());
    }

    @Override
    public String toString() {
        return "Conta [Titular: " + nomeTitular + ", Saldo: R$" + saldo + "]";
    }

    public static void main(String[] args) {
        try {
            Conta conta1 = new Conta("João", 1000.0);
            Conta conta2 = new Conta("Maria", 500.0);

            System.out.println(conta1);
            System.out.println(conta2);

            conta1.depositar(500.0);

            conta1.sacar(300.0);

            conta1.transferir(conta2, 200.0);

            System.out.println(conta1);
            System.out.println(conta2);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

