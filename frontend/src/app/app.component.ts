import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SimuladorComponent } from './components/simulador/simulador.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SimuladorComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
