import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent {

//Criar a função para ser vinculada via Event Binding
  public exibirAlerta(): void{
    console.log('Event disparado');
    alert('Evento disparado...');
  }

}
