function contagem(dados, n) {
    if (!dados || dados.length === 0) return 0;

    let primeiro = dados[0];
    let min = Math.min(primeiro, n);
    let max = Math.max(primeiro, n);
    let contador = 0;

    // No JS, usamos 'for...of' para percorrer os valores de um array
    for (let valor of dados) {
        if (valor >= min && valor <= max) contador++;
    }

    return contador;
}

let dados = [5, 12, 3, 8, 15, 10, 2];
let N = 10;
console.log("Quantidade de elementos entre " + dados[0] + " e " + N + ": " + contagem(dados, N));
