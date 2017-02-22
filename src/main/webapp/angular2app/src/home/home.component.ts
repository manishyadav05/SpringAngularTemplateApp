import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styles: [`.top-buffer { margin-top:5px;
           }`]
})
export class HomeComponent {
  title = 'This is the area where the actual queries will go';  
}
