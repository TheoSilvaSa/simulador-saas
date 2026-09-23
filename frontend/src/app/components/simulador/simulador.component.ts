import { Component, ElementRef, ViewChild } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ApiService } from '../../services/api.service';
import Chart from 'chart.js/auto';

@Component({
  selector: 'app-simulador',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './simulador.component.html',
  styleUrls: ['./simulador.component.css']
})
export class SimuladorComponent {
  input = { custoFixo: 0, custoVariavel: 0, preco: 0, clientes: 0, taxaTributos: 0 };
  resultado: any = null;
  grafico: any;

  @ViewChild('graficoCanvas') graficoCanvas!: ElementRef;

  constructor(private api: ApiService) {}

  carregarExemplo() {
    this.input = { custoFixo: 3000, custoVariavel: 10, preco: 50, clientes: 100, taxaTributos: 0.10 };
  }

  calcular() {
    this.api.calcular(this.input).subscribe({
      next: (res) => {
        this.resultado = res;
        setTimeout(() => this.atualizarGrafico(), 100); // Aguarda renderizar o HTML
      },
      error: () => alert("Erro ao conectar com a API. O Spring Boot está rodando?")
    });
  }

  atualizarGrafico() {
    if (this.grafico) this.grafico.destroy();
    if (!this.resultado || this.resultado.mensagemAviso) return;

    const pontosX = [];
    const pontosY = [];
    const limite = Math.max(this.input.clientes * 1.5, this.resultado.clientesEquilibrio + 20);

    for (let q = 0; q <= limite; q += Math.max(1, Math.floor(limite / 10))) {
      pontosX.push(q);
      const receita = this.input.preco * q;
      const tributos = receita * this.input.taxaTributos;
      const res = receita - this.input.custoFixo - (this.input.custoVariavel * q) - tributos;
      pontosY.push(res);
    }

    const ctx = this.graficoCanvas.nativeElement.getContext('2d');
    this.grafico = new Chart(ctx, {
      type: 'line',
      data: {
        labels: pontosX,
        datasets: [{
          label: 'Resultado Financeiro (R$)',
          data: pontosY,
          borderColor: 'green',
          borderWidth: 2,
          fill: false
        }]
      }
    });
  }

  exportarCSV() {
    if (!this.resultado) return;
    const csv = `Premissas;Valores\nCusto Fixo;${this.input.custoFixo}\nCusto Variavel;${this.input.custoVariavel}\nPreco;${this.input.preco}\nClientes;${this.input.clientes}\nTaxa Tributos;${this.input.taxaTributos}\n\nResultados;Valores\nReceita;${this.resultado.receita}\nTributos;${this.resultado.tributos}\nResultado;${this.resultado.resultado}\nMargem (%);${this.resultado.margem}\nEquilibrio;${this.resultado.clientesEquilibrio}`;
    const blob = new Blob([csv], { type: 'text/csv' });
    const a = document.createElement('a');
    a.href = window.URL.createObjectURL(blob);
    a.download = 'simulacao_saas.csv';
    a.click();
  }
}
