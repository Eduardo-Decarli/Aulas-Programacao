// 3. EXECUÇÃO
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Criando Objetos (Instanciação) ===");
        ContaBancaria contaComum = new ContaBancaria("Carlos", 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Ana", 2000.0, 0.02); // 2% de rendimento

        System.out.println("\n=== 2. Testando Encapsulamento e Regras ===");
        contaComum.depositar(500.0);
        contaComum.sacar(200.0);
        contaComum.sacar(2000.0); // Deve falhar pela regra do método

        System.out.println("\n=== 3. Testando Herança e Método Específico ===");
        contaPoupanca.aplicarRendimento();

        System.out.println("\n=== 4. Testando Polimorfismo ===");
        // O mesmo método exibirResumo() responde de forma diferente em cada objeto
        contaComum.exibirResumo();
        contaPoupanca.exibirResumo();
    }
}