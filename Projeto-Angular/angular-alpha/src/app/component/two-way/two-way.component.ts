import { Component} from '@angular/core';

@Component({
  selector: 'app-two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']
})
export class TwoWayComponent{
  //Propriedade que será vinculada via Two-Way binding

  public nome: string = ''

}
