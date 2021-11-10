import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InterpolationComponent } from './component/interpolation/interpolation.component';
import { PropertyBindingComponent } from './component/property-binding/property-binding.component';
import { EventBindingComponent } from './component/event-binding/event-binding.component';
import { TwoWayComponent } from './component/two-way/two-way.component';
import { SecundarioComponent } from './component/secundario/secundario.component';
import { MegaSaltoComponent } from './component/mega-salto/mega-salto.component';

@NgModule({
  declarations: [
    AppComponent,
    InterpolationComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayComponent,
    SecundarioComponent,
    MegaSaltoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
