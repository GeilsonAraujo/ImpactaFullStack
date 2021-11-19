var http = require('http');

var requisicao = function (request, response){
    response.writeHead(200, {"Content-Type": "text/html"});
    response.write("<h1>Olá mundo</h1>");
    response.write("<h2>Bem vindo ao meu incrivel servidor do criador Geilson, o magnifico </h2>");
    response.end;
}

var serve = http.createServer(requisicao);

var resultado = function(){
    console.log('servidor em funcionamento')
}

serve.listen(4000, resultado);