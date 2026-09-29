// 1. CLASSE BASE: ContaBancaria (Abstração e Encapsulamento)
class ContaBancaria {
    // Atributos privados: só podem ser alterados por métodos da própria classe
    private String titular;
    private double saldo;

    // Construtor: inicializa os atributos do objeto
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getters para leitura segura dos atributos privados
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Regra de negócio encapsulada
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado no saldo de %s.\n", valor, titular);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado. Saldo atual: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Operação cancelada: saldo insuficiente ou valor inválido.");
        }
    }

    // Método que será sobrescrito na classe filha (Polimorfismo)
    public void exibirResumo() {
        System.out.printf("[Conta Corrente] Titular: %s | Saldo: R$ %.2f\n", titular, saldo);
    }
}