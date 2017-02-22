import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header.component';
import { FooterComponent } from './footer.component';
import { AboutComponent } from './about.component';
import { ContactComponent } from './contact.component';
import { HomeComponent } from '../home/home.component';
import { LockedCompositeComponent } from '../home/lockedComposite.component';
import { OtherQueriesComponent } from '../home/otherQueries.component'

const appRoutes: Routes = [
  { path: 'home', component: HomeComponent, children: [
    { path: 'lockedComposites', component: LockedCompositeComponent },
    { path: 'otherQueries', component: OtherQueriesComponent }
    ]
  },
  { path: 'about', component: AboutComponent },
  { path: 'contact', component: ContactComponent }  
];

@NgModule({
  declarations: [
    AppComponent, HeaderComponent, FooterComponent, AboutComponent, ContactComponent,HomeComponent, LockedCompositeComponent, OtherQueriesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
