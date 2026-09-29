import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    // Método Padrão para executar o programa

        Scanner scanner = new Scanner(System.in);   // Cria um objeto Scanner para ler dados do teclado

        System.out.println("=== Calculadora de Média ===");     // Exibe uma mensagem no terminal

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();       // Lê todos os dados da primeira linha do teclado e armazena na variável nome

        System.out.print("Primeira nota: ");
        double nota1 = scanner.nextDouble();    // Lê todos os números (incluindo com vírgula)

        System.out.print("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;     // Realiza o cálculo de média aritmética

        System.out.println();
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        scanner.close();    // Exclui o objeto Scanner para liberar memória
    }
}