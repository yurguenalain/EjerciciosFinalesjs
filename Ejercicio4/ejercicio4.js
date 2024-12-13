function solicitarNumero() {
    let numero;
    while (true) {
        const entrada = prompt("Ingrese un número para generar la serie de Fibonacci:");
        numero = parseInt(entrada, 10);

        if (!isNaN(numero) && numero >= 0) {
            break;
        } else {
            alert("Por favor, ingrese un número válido.");
        }
    }
    return numero;
}

function generarFibonacci(cantidad) {
    const serie = [];
    for (let i = 0; i < cantidad; i++) {
        if (i === 0 || i === 1) {
            serie.push(1);
        } else {
            serie.push(serie[i - 1] + serie[i - 2]);
        }
    }
    return serie;
}

function main() {
    const cantidad = solicitarNumero();
    const serieFibonacci = generarFibonacci(cantidad);

    console.log(`Serie de Fibonacci (${cantidad} números):`, serieFibonacci);

    // También puedes mostrar el resultado en el DOM
    const resultadoDiv = document.createElement("div");
    resultadoDiv.textContent = `Serie de Fibonacci (${cantidad} números): ${serieFibonacci.join(", ")}`;
    document.body.appendChild(resultadoDiv);
}

// Ejecutar el programa
main();
