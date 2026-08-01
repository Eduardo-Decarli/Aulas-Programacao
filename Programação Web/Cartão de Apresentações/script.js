function mostrarCartao(){

    // Criação de Variáveis para armazenar os valores dos campos de entrada
    let nome;
    let idade;
    let cidade;

    // Atribuição dos valores dos campos de entrada às variáveis
    nome = document.getElementById("nome").value;
    idade = document.getElementById("idade").value;
    cidade = document.getElementById("cidade").value;

    console.log("Nome: " + nome);
    console.log("Idade: " + idade);
    console.log("Cidade: " + cidade);

    // Atribuição dos valores das variáveis aos elementos do cartão de apresentação
    document.getElementById("nomeCartao").innerHTML = nome;

    document.getElementById("idadeCartao").innerHTML =
        "Idade: " + idade + " anos";

    document.getElementById("cidadeCartao").innerHTML =
        "Cidade: " + cidade;

}