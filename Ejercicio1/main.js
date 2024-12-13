// Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
// Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.
let numero1=parseInt(prompt("Ingrese un numero entero"));
let numero2=parseInt(prompt("Ingrese un numero entero"));
let numero3=parseInt(prompt("Ingrese un numero entero"));
let array=[numero1,numero2,numero3];
//ordenar
 let resultado=array.sort();
let mayor=resultado[2];
let centro=resultado[1];
let menor=resultado[0];
console.log("El numero mayor es" `${mayor}`);
console.log("El numero centro es" `${centro}`);
console.log("El numero menor es" `${menor}`);
 //revisar si se repiten
 if(resultado[0] == resultado[1]){
    console.log("Son iguales" `${resultado[0]} "y" ${resultado[1]}`)
 }else if(resultado[0] == resultado[2]){
    console.log("Son iguales" `${resultado[0]} "y" ${resultado[2]}`);
 }else if(resultado[1] == resultado[2]){
    console.log("Son iguales" `${resultado[1]} y ${resultado[2]}`);
 }
 //imprimir de menor a mayor y de mayor a menor
 console.log("De menor a mayor" `${resultado.toString()}`);
 let resultadoreverse=resultado.reverse();
 console.log("De mayor a menor" `${resultadoreverse.toString()}`);