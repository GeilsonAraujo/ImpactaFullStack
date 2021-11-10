import { Component} from '@angular/core';

@Component({
  selector: 'app-mega-salto',
  templateUrl: './mega-salto.component.html',
  styleUrls: ['./mega-salto.component.css']
})
export class MegaSaltoComponent {
  public texto: string = 'Esse é o texto que sera exibido na janela alert';
  public outroTexto: string = 'Texto enviado do componente principal (pai) para o componente secundario (filho)';
  
}
