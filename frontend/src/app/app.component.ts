import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movie } from './model/movie';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  protected readonly movies$: Observable<Movie[]>;

  constructor(private readonly httpClient: HttpClient) {
    this.movies$ = httpClient.get<Movie[]>('/api/movies');
  }
}
