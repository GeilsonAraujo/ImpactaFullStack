import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//Importando  os componentes
import { InterpolationComponent } from './component/interpolation/interpolation.component';
import { PropertyBindingComponent } from './component/property-binding/property-binding.component';
import { EventBindingComponent } from './component/event-binding/event-binding.component';
import { TwoWayComponent } from './component/two-way/two-way.component';
import { MegaSaltoComponent } from './component/mega-salto/mega-salto.component';
import { NgIfComponent } from './component/ng-if/ng-if.component';
import { NgForComponent } from './component/ng-for/ng-for.component';
import { HomeComponent } from './component/home/home.component';
import { CompServiceComponent } from './component/comp-service/comp-service.component';

const routes: Routes = [
  {path:'', redirectTo: 'home', pathMatch:'full'},//redireciona para rota home quando nao expecificado rota
  {path: 'home', component: HomeComponent},
  {path: 'interpolation', component: InterpolationComponent},
  {path: 'propbinding', component: PropertyBindingComponent},
  {path: 'evento', component: EventBindingComponent},
  {path:'twoway', component: TwoWayComponent},
  {path: 'mega-salto', component: MegaSaltoComponent },
  {path: 'ng-if', component: NgIfComponent },
  {path: 'ng-for', component: NgForComponent},
  {path: 'service', component: CompServiceComponent}
]; //centralizador de recursos

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
