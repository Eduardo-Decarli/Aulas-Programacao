import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       // Instancia um Scanner

        exibirCabecalho();      // Chama o método que exibe o cabeçalho do programa

        System.out.print("Produto: ");
        String produto = scanner.nextLine();    // nextLine() é uma função que captura todo o texto escrito pelo usuário

        System.out.print("Preço: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        double subtotal = calcularSubtotal(preco, quantidade);      // Chamamos o método que calcula o subtotal, damos 2 variáveis e recebemos seu valor de saída

        double desconto = 10.0;
        double total = aplicarDesconto(subtotal, desconto);         // Chamamos o método que aplica desconto no produto, damos 2 variáveis e recebemos seu valor de saída

        System.out.println();

        System.out.println("\n\n");
        System.out.println("────────────────────────────────────────");
        System.out.println("              RESUMO DA COMPRA");
        System.out.println("────────────────────────────────────────");

        System.out.println();
        System.out.println("Produto:        " + produto);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.println("Quantidade:      " + quantidade);

        System.out.println();
        System.out.printf("Subtotal:       R$ %.2f%n", subtotal);
        System.out.printf("Desconto:       R$ %.2f%n", desconto);

        System.out.println("────────────────────────────────────────");
        System.out.printf("TOTAL:          R$ %.2f%n", total);
        System.out.println("────────────────────────────────────────");

        System.out.println();
        System.out.println("Obrigado pela compra!");

        scanner.close();        // Fecha o Scanner para liberar memória

    }

    public static void exibirCabecalho() {

        System.out.println("================================");
        System.out.println("          CAIXA DA LOJA");
        System.out.println("================================");

    }

    public static double calcularSubtotal(double preco, int quantidade) {

        return preco * quantidade;

    }

    public static double aplicarDesconto(double valor, double percentual) {
        double desconto = valor * percentual / 100;

        return valor - desconto;

    }
}