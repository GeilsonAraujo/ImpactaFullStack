import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//Importando  os componentes
import { InterpolationComponent } from './component/interpolation/interpolation.component';
import { PropertyBindingComponent } from './component/property-binding/property-binding.component';
import { EventBindingComponent } from './component/event-binding/event-binding.component';
import { TwoWayComponent } from './component/two-way/two-way.component';
import { MegaSaltoComponent } from './component/mega-salto/mega-salto.component';
const routes: Routes = [
  {path: 'interpolation', component: InterpolationComponent},
  {path: 'propbinding', component: PropertyBindingComponent},
  {path: 'evento', component: EventBindingComponent},
  {path:'twoway', component: TwoWayComponent},
  {path: 'mega-salto', component: MegaSaltoComponent }
]; //centralizador de recursos

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
