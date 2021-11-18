import { Component} from '@angular/core';

@Component({
  selector: 'app-mega-salto',
  templateUrl: './mega-salto.component.html',
  styleUrls: ['./mega-salto.component.css']
})
export class MegaSaltoComponent {

  // vamos implementar nossa função enviarDados
  
  public exibirDados(dados:any): void{
  
    let receptora: string = 'Obrigado por se cadastrar ' + dados.nome + '!!';
  
  receptora += ' O email ' + dados.email + ' foi cadastrado com sucesso.' ;
  
  alert(receptora);
 

  }
}
// public texto: string = 'Esse é o texto que sera exibido na janela alert';
// public outroTexto: string = 'Texto enviado do componente principal (pai) para o componente secundario (filho)';
