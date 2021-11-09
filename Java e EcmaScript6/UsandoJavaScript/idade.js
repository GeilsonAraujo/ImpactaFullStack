var idade = prompt('Digite sua idade ');

if (idade >= 0 && idade < 15) {
	document.write("Criança");
}
if (idade >= 15 && idade < 30) {
	document.write("Jovem");
}
if (idade >= 30 && idade < 60) {
	document.write("Adulto");
}
if (idade >= 60) {
	document.write("Idoso");
}