// Classe que representa um aluno individual
class Aluno {
    private String nome;
    private double[] notas; // Uso de Array: quantidade fixa de notas por aluno (ex: 3 provas)

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // Método para calcular a média aritmética usando o Array de notas
    public double calcularMedia() {
        if (notas.length == 0) return 0.0;
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }
}
