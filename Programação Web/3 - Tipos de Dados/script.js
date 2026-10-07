// 1. Declaração das variáveis
let nome = "123";
let idade = 28;
let ativo = true;
let saldo = null;
let indefinido = undefined;
let itens = ["maçã", "banana"];

console.log("--- TIPOS ORIGINAIS ---");
// 2. Verificação dos tipos originais
console.log("nome:", typeof nome);           // string
console.log("idade:", typeof idade);         // number
console.log("ativo:", typeof ativo);         // boolean
console.log("saldo:", typeof saldo);         // object (comportamento histórico do JS)
console.log("indefinido:", typeof indefinido); // undefined
console.log("itens:", typeof itens);         // object

console.log("\n--- CONVERSÕES DE TIPO ---");
// 3. Realizando as conversões
let nomeConvertido = Number(nome);
let idadeString = String(idade);
let saldoBoolean = Boolean(saldo);

// 4. Exibindo novos valores e tipos
console.log("nomeConvertido:", nomeConvertido, "| Novo tipo:", typeof nomeConvertido); // 123 | number
console.log("idadeString:", idadeString, "| Novo tipo:", typeof idadeString);         // "28" | string
console.log("saldoBoolean:", saldoBoolean, "| Novo tipo:", typeof saldoBoolean);       // false | boolean
