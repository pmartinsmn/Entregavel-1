function fibonacci(n) {
    if (n <= 0) return;
    let a = 0, b = 1;
    let resultado = `${a}`;
    if (n > 1) {
        resultado += `, ${b}`;
        for (let i = 2; i < n; i++) {
            let proximo = a + b;
            resultado += `, ${proximo}`;
            a = b;
            b = proximo;
        }
    }
    console.log(resultado);
}
fibonacci(8);
