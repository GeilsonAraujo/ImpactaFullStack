import { Component, } from '@angular/core';
//criar propriedades para vincular ao arquivo de View, HTML


@Component({
  selector: 'app-interpolation',
  templateUrl: './interpolation.component.html',
  styleUrls: ['./interpolation.component.css']
})
export class InterpolationComponent {
// aqui vamos implementar o conjunto de variaveis/propriedades para vincular com a view.
//criar variavel dentro de classe, dispensa o uso de Var ou Let.
  public x: number = 10;
  public umArray: Array<number> = [10, 26, 89];
  public dataHoje: Date = new Date();
  public statusBooleano: boolean = true;

  public exibirTexto(): string{
    return 'Texto retornado a partir de uma função!'
  }

}
