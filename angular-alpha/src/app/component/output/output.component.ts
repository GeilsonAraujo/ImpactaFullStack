import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-output',
  templateUrl: './output.component.html',
  styleUrls: ['./output.component.css']
})
export class OutputComponent {
  //Criando "anunciador" do evento que enviara o conjunto de dados do componente filho para o componente pai
  @Output() anunciador = new EventEmitter<any>();

  //criar a propriedade que receberá o conjunto de dados
  public objDados: any = {};

  //criar a função que enviará esses dados.
  public enviarDados(): void{
    this.anunciador.emit(this.objDados);
  }
}
