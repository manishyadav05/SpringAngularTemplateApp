import { Component } from '@angular/core';

@Component({
  selector: 'app-home-lockedComposite',
  templateUrl: './lockedComposite.component.html',
  styles: [`.top-buffer { margin-top:5px;
           }`]
})
export class LockedCompositeComponent {
  title = 'This is the some data coming from LockedComposite';  
}
