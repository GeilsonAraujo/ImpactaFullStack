var nome = prompt('Por gentileza informe seu nome');
var altura = prompt('Informe sua altura em centimentros');
var peso = prompt('Informe seu peso em KG');

altura = parseFloat(altura);
peso = parseFloat(peso);

alturaM = altura/100;

var classificacao = "";

imc = peso/alturaM**2;

console.log(imc);

if (imc < 16 ) {
	classificacao = "baixo peso muito grave";

}else if (imc >= 16 && imc < 16.99 ) {
	classificacao = "Baixo peso grave"

}else if (imc >= 17 && imc < 18.50 ) {
	classificacao = "Baixo peso";

}else if (imc >= 18.50 && imc < 25 ) {
	classificacao = "Peso Normal";

}else if (imc >= 25 && imc < 30 ) {
	classificacao = "Sobrepeso";

}else if (imc >= 30 && imc < 35 ) {
	classificacao = "Obesidade grau 1";

}else if (imc >= 35 && imc < 40 ) {
	classificacao = "Obesidade grau 2";

}else if (imc > 40) {
	classificacao = "Obesidade grau 3";

}

document.write('<h3>'+ nome + ' possui índice de massa corporal igual a '+ imc +', sendo classificado como: '+
classificacao +' </h3>');

