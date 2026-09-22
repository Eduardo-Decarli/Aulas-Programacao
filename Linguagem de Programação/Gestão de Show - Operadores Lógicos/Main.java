public class Main {
    public static void main(String[] args) {
        
        int idade = 20;
        boolean temIngresso = true;
        boolean estaAcompanhado = false;
        boolean estaBanido = false;

        // AMBAS as condições precisam ser verdadeiras
        if (idade >= 18 && temIngresso) {
            System.out.println("VIP: Acesso liberado para a área VIP!");
        } else {
            System.out.println("VIP: Requisitos não preenchidos.");
        }

        // PELO MENOS UMA condição precisa ser verdadeira
        if (idade >= 18 || estaAcompanhado) {
            System.out.println("Entrada: Entrada permitida no recinto!");
        } else {
            System.out.println("Entrada: Negada por idade/acompanhante.");
        }

        // Inverte o valor da variável (se for False, vira True)
        if (!estaBanido) {
            System.out.println("Status: Usuário com cadastro regular.");
        } else {
            System.out.println("Status: Usuário banido.");
        }

        // Exige: (Maior de idade OU Acompanhado) E Ter Ingresso E NÃO estar banido
        if ((idade >= 18 || estaAcompanhado) && temIngresso && !estaBanido) {
            System.out.println("Resultado Final: Acesso total concedido!");
        } else {
            System.out.println("Resultado Final: Entrada totalmente bloqueada.");
        }
    }
}