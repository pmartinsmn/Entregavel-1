function somatorio(numeros) {
    return numeros.reduce((soma, num) => soma + num, 0); // No JS podemos usar o reduce para somar arrays facilmente
}
const numeros = [5, 10, 15, 20];
console.log("Soma de " + numeros + ": " + somatorio(numeros));
