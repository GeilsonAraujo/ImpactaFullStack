import { Component } from '@angular/core';

//Importando os recursos necessairos
import { ProductService } from 'src/app/product.service';
import { Produto } from 'src/app/product';

@Component({
  selector: 'app-comp-service',
  templateUrl: './comp-service.component.html',
  styleUrls: ['./comp-service.component.css']
})
export class CompServiceComponent  {

  // casting das propriedades utilizadas dentro do codigo

  produto!: Produto[];


  constructor(private productService:ProductService) { 
    
  }
  
  //Fazer uso do objeto productService para acessar o conteudo do service criado anteriormente.
  obterConteudo(){
    this.produto = this.productService.getProdutos();
  }
}
