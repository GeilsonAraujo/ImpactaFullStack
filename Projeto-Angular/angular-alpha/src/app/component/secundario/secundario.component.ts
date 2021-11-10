import { Component, Input} from '@angular/core';

@Component({
  selector: 'app-secundario',
  templateUrl: './secundario.component.html',
  styleUrls: ['./secundario.component.css']
})
export class SecundarioComponent  {
  //vamos criar os elementos para fazer uso da propriedade @input

  @Input() public mensagem: string = '';

  @Input('alerta') public outraMensagem: string = '';

  public exibirMensagemAlerta(): void{
    alert(this.outraMensagem);
  }
}
