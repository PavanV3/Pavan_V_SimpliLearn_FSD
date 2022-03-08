import { Component, Input,OnInit,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
 @Input()
  public pdata: string;
  cevent= new EventEmitter<string>();

  onChange(value:string){
    this.cevent.emit(value);
  }
}

