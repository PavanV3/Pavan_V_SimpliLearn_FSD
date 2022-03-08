import { Component,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'App-4';
  public cdata: string;
  chevent= new EventEmitter<string>();

  onChange(value:string){
    this.chevent.emit(value);
  }
  
}
