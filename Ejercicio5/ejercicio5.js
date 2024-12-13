// En caso de querer generar el número secreto de forma aleatoria, se puede emplear:
// const numeroSecreto = Math.floor(Math.random() * 100) + 1;

// En este caso, yo lo asignaré manualmente, mi número secreto es 36
const numeroSecreto = 36;

const botonAdivinar = document.getElementById("adivinarBoton");
const inputNumero = document.getElementById("numero");
const mensajeDiv = document.getElementById("mensaje");
const intentosDiv = document.getElementById("intentos");

let intentos = [];

function mostrarMensaje(texto) {
  mensajeDiv.textContent = texto;
}

function verificarNumero() {
  const numeroUsuario = inputNumero.value.trim();

  if (isNaN(numeroUsuario) || numeroUsuario === "") {
    mostrarMensaje("Error. Por favor, ingresa un número válido.");
    inputNumero.value = '';
    return;
  }

  const numero = parseInt(numeroUsuario, 10);

  if (numero < numeroSecreto) {
    mostrarMensaje("Ups, el número es incorrecto. El número es mayor.");
  } else if (numero > numeroSecreto) {
    mostrarMensaje("Ups, el número es incorrecto. El número es menor.");
  } else {
    mostrarMensaje("¡Felicidades, adivinaste el número secreto!");
    intentosDiv.textContent = `Tu número de intentos: ${intentos.length + 1}`;
  }

  intentos.push(numero);
  inputNumero.value = '';
}

botonAdivinar.addEventListener("click", verificarNumero);
