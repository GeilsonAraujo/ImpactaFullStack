import { Injectable } from '@angular/core';

@Injectable()
export class LoggerService {

  verificacao(texto:any){
    console.log(texto);
  }
}
