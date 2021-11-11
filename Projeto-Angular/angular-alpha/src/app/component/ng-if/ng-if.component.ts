import { Component } from '@angular/core';

@Component({
  selector: 'app-ng-if',
  templateUrl: './ng-if.component.html',
  styleUrls: ['./ng-if.component.css']
})
export class NgIfComponent{
  //Criar a propriedade/variavel cujo o valor será a variavel na view
  exiba!: boolean;
}
