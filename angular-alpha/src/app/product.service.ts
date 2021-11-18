import { Injectable } from '@angular/core';
import { LoggerService } from './logger.service';

//importando o model
import { Produto } from "./product";

@Injectable()
export class ProductService {

  constructor(private loggerService:LoggerService) { 
    this.loggerService.verificacao('ProductService foi construido!');
  }

  //criando o conteudo que será oferecido pelo service
  public getProdutos(){
    this.loggerService.verificacao('metodo/funcao get produtos foi chamada');
    let produtos: Produto[];
    //criar uma lista de produtos

    produtos = [
      new Produto(1, 'Quadro baby Yoda', 199),
      new Produto(2, 'Mascara Darth vader', 159),
      new Produto(3, 'LightSaber', 890)
    ]
    this.loggerService.verificacao(produtos);
    return produtos;
  }
}
