function mdc(a, b) {
    while (b !== 0) {
        let resto = a % b;
        a = b;
        b = resto;
    }
    return a;
}
console.log("MDC de 48 e 18 é: " + mdc(48, 18));
