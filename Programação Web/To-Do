// Simulador de Lista de Tarefas (To-Do List)

// Array de objetos representando as tarefas iniciais
let tarefas = [
    { id: 1, descricao: "Estudar JavaScript", concluida: true },
    { id: 2, descricao: "Praticar lógica de programação", concluida: false },
    { id: 3, descricao: "Criar um projeto prático", concluida: false }
];

// Função para exibir o status atual de todas as tarefas (Usa um loop FOR)
function exibirTarefas() {
    console.log("=== LISTA DE TAREFAS ===");
    for (let i = 0; i < tarefas.length; i++) {
        let tarefa = tarefas[i];
        
        // Operador de decisão para definir o texto do status
        let status;
        if (tarefa.concluida) {
            status = "[CONCLUÍDA]";
        } else {
            status = "[PENDENTE]";
        }

        console.log(`${tarefa.id}. ${tarefa.descricao} ${status}`);
    }
    console.log("========================\n");
}

// Função para adicionar uma nova tarefa
function adicionarTarefa(descricao) {
    let novaTarefa = {
        id: tarefas.length + 1,
        descricao: descricao,
        concluida: false
    };
    tarefas.push(novaTarefa);
    console.log(`> Tarefa adicionada: "${descricao}"\n`);
}

// Função para alternar o status de uma tarefa (Usa operadores de decisão)
function alternarStatus(id) {
    let encontrada = false;

    for (let i = 0; i < tarefas.length; i++) {
        if (tarefas[i].id === id) {
            encontrada = true;
            // Inverte o valor booleano (true vira false, e vice-versa)
            tarefas[i].concluida = !tarefas[i].concluida;
            console.log(`> Status da tarefa ${id} alterado com sucesso!\n`);
            break;
        }
    }

    // Operador de decisão caso o ID não exista
    if (!encontrada) {
        console.log(`> Erro: Tarefa com ID ${id} não encontrada.\n`);
    }
}

// --- Executando o "Projeto" ---

// 1. Mostra a lista inicial
exibirTarefas();

// 2. Adiciona uma nova tarefa
adicionarTarefa("Ler um artigo sobre algoritmos");

// 3. Mostra a lista atualizada
exibirTarefas();

// 4. Marca a tarefa de ID 2 como concluída
alternarStatus(2);

// 5. Mostra a lista final
exibirTarefas();
