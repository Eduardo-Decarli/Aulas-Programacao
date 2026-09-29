// 2. CLASSE DERIVADA: ContaPoupanca (Herança e Polimorfismo)
class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldoInicial, double taxaRendimento) {
        super(titular, saldoInicial); // Chama o construtor da classe pai (ContaBancaria)
        this.taxaRendimento = taxaRendimento;
    }

    // Comportamento exclusivo da ContaPoupanca
    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.printf("Rendimento mensal de R$ %.2f aplicado a %s!\n", rendimento, getTitular());
    }

    // Polimorfismo: sobrescreve o método da classe pai para alterar seu comportamento
    @Override
    public void exibirResumo() {
        System.out.printf("[Conta Poupança] Titular: %s | Saldo: R$ %.2f | Taxa de Rendimento: %.1f%%\n",
                getTitular(), getSaldo(), taxaRendimento * 100);
    }
}