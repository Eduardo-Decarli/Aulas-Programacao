public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Uso de List: quantidade dinâmica de alunos na turma
        List<Aluno> turma = new ArrayList<>();
        
        int opcao;
        do {
            System.out.println("\n========================================");
            System.out.println("   SISTEMA DE GERENCIAMENTO DE NOTAS");
            System.out.println("========================================");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos e Médias");
            System.out.println("3. Exibir Estatísticas da Turma");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, digite um número válido: ");
                scanner.next();
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("\nNome do aluno: ");
                    String nome = scanner.nextLine();
                    
                    // Definimos um Array de 3 posições para as notas
                    double[] notas = new double[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.print("Valor inválido. Digite uma nota numérica: ");
                            scanner.next();
                        }
                        notas[i] = scanner.nextDouble();
                    }
                    scanner.nextLine(); // Limpar buffer

                    // Adicionando o objeto Aluno na List dinâmica
                    turma.add(new Aluno(nome, notas));
                    System.out.println("✔ Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- RELATÓRIO DE NOTAS DA TURMA ---");
                    if (turma.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado ainda.");
                    } else {
                        for (int i = 0; i < turma.size(); i++) {
                            Aluno a = turma.get(i);
                            double media = a.calcularMedia();
                            String status = media >= 6.0 ? "Aprovado" : "Reprovado";
                            
                            System.out.printf("[%d] Aluno: %s | Média: %.2f | Status: %s\n", 
                                    (i + 1), a.getNome(), media, status);
                        }
                    }
                    break;

                case 3:
                    if (turma.isEmpty()) {
                        System.out.println("\nNenhum dado disponível para estatísticas.");
                    } else {
                        double somaMediasTurma = 0;
                        Aluno melhorAluno = turma.get(0);
                        double maiorMedia = melhorAluno.calcularMedia();

                        for (Aluno a : turma) {
                            double mediaAtual = a.calcularMedia();
                            somaMediasTurma += mediaAtual;

                            if (mediaAtual > maiorMedia) {
                                maiorMedia = mediaAtual;
                                melhorAluno = a;
                            }
                        }

                        double mediaGeralTurma = somaMediasTurma / turma.size();
                        System.out.println("\n--- ESTATÍSTICAS DA TURMA ---");
                        System.out.printf("Total de Alunos: %d\n", turma.size());
                        System.out.printf("Média Geral da Turma: %.2f\n", mediaGeralTurma);
                        System.out.printf("Destaque da Turma: %s (Média: %.2f)\n", 
                                melhorAluno.getNome(), maiorMedia);
                    }
                    break;

                case 4:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Escolha entre 1 e 4.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
