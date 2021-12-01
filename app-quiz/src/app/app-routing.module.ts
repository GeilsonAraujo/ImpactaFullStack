import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SimuladoComponent } from './simulado/simulado.component';
import { CrudPerguntaComponent } from './crud-pergunta/crud-pergunta.component';
import { CrudPessoaComponent } from './crud-pessoa/crud-pessoa.component';

const routes: Routes = [
  {path: 'simulado', component: SimuladoComponent},
  {path: 'crud-pessoa', component: CrudPessoaComponent},
  {path: 'crud-pergunta', component: CrudPerguntaComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
