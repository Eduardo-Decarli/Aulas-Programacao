package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO E ANALISADOR DE PERFIL ===");
        
        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento (ex: 1998): ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite sua pontuação atual no sistema (ex: 85.75): ");
        double pontuacaoDouble = scanner.nextDouble();

        System.out.println("\n------------------------------------");
        System.out.println("       RESULTADO DA ANÁLISE         ");
        System.out.println("------------------------------------");

        // 1. Uso de Utilitários de String
        String nomeFormatado = formatarNome(nomeCompleto);
        String primeiroNome = obterPrimeiroNome(nomeCompleto);
        int totalCaracteres = contarCaracteresSemEspaco(nomeCompleto);

        // 2. Uso de Funções + Casting
        int idade = calcularIdade(anoNascimento, 2026);
        int pontuacaoInteira = aplicarCastPontuacao(pontuacaoDouble);
        char classeUsuario = gerarClassePorIniciais(nomeCompleto);

        // Exibição dos resultados
        System.out.println("Nome Formatado: " + nomeFormatado);
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Total de Letras no Nome: " + totalCaracteres);
        System.out.println("Idade Estimada: " + idade + " anos");
        System.out.println("Pontuação Convertida (Casting double -> int): " + pontuacaoInteira);
        System.out.println("Código do Perfil (Casting int -> char): " + classeUsuario);

        scanner.close();
    }

    // =========================================================================
    // FUNÇÕES DE MANIPULAÇÃO DE STRING
    // =========================================================================

    // Remove espaços extras nas pontas e coloca tudo em maiúsculas
    public static String formatarNome(String nome) {
        return nome.trim().toUpperCase();
    }

    // Extrai a primeira palavra até o primeiro espaço
    public static String obterPrimeiroNome(String nome) {
        String nomeLimpo = nome.trim();
        int indiceEspaco = nomeLimpo.indexOf(" ");
        
        if (indiceEspaco == -1) {   // Se o indexOf não localiza o caracter, ele retorna -1
            return nomeLimpo; // Caso o usuário tenha digitado apenas um nome
        }
        return nomeLimpo.substring(0, indiceEspaco);
    }

    // Remove todos os espaços para contar apenas as letras
    public static int contarCaracteresSemEspaco(String nome) {
        String semEspacos = nome.replace(" ", "");
        return semEspacos.length();
    }

    // =========================================================================
    // FUNÇÕES COM CASTING E LÓGICA
    // =========================================================================

    public static int calcularIdade(int anoNascimento, int anoAtual) {
        return anoAtual - anoNascimento;
    }

    // Cast explícito (narrowing): perde a parte decimal do double ao converter para int
    public static int aplicarCastPontuacao(double pontuacao) {
        return (int) pontuacao; 
    }

    // Pega o código ASCII do primeiro caractere e aplica casting para criar um identificador 'char'
    public static char gerarClassePorIniciais(String nome) {
        String nomeLimpo = nome.trim().toUpperCase();
        if (nomeLimpo.isEmpty()) {
            return 'X';
        }
        
        char primeiraLetra = nomeLimpo.charAt(0);
        // Exemplo de casting: converte o char para código numérico ASCII, 
        // soma 1 (próxima letra do alfabeto) e faz o cast de volta para char
        int codigoAscii = (int) primeiraLetra;
        char proximaLetra = (char) (codigoAscii + 1);
        
        return proximaLetra;
    }
}
