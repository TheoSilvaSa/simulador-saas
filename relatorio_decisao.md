# Relatório de Decisão Econômica: Viabilidade e Precificação de Serviço SaaS

Faculdade SENAI Fatesg - Engenharia Econômica
Equipe: Théo da Silva Sá e João Vitor Bier Barros

---

## 1. Contextualização do Problema
O lançamento de um serviço por assinatura (SaaS) impõe um dilema crítico de precificação: preços reduzidos aumentam a atratividade comercial, mas exigem volumes elevados de clientes para cobrir custos de infraestrutura e equipe; preços elevados elevam a margem unitária, mas restringem a taxa de conversão.

O objetivo desta análise é determinar as condições mínimas de preço e volume de assinantes que tornam a operação sustentável, utilizando o modelo de resultado operacional didático desenvolvido pelo grupo.

---

## 2. Comparativo dos Cenários Analisados

| Indicador Econômico | Cenário Pessimista (Compressão de Margem) | Cenário Base (Referência do Projeto) | Cenário Otimista (Escala Comercial) |
| :--- | :--- | :--- | :--- |
| **Custo Fixo Mensal (CF)** | R$ 3.500,00 | R$ 3.000,00 | R$ 3.000,00 |
| **Custo Variável Unitário (CV_u)** | R$ 12,00 | R$ 10,00 | R$ 8,00 |
| **Preço da Assinatura (P)** | R$ 42,00 | R$ 50,00 | R$ 60,00 |
| **Alíquota de Tributos (t)** | 10% (0.10) | 10% (0.10) | 10% (0.10) |
| **Volume de Assinantes (Q)** | 85 clientes | 100 clientes | 160 clientes |
| **Receita Bruta Total** | R$ 3.570,00 | R$ 5.000,00 | R$ 9.600,00 |
| **Tributos Apurados** | R$ 357,00 | R$ 500,00 | R$ 960,00 |
| **Margem Contribuição Unitária (MC_u)** | R$ 25,80 | R$ 35,00 | R$ 46,00 |
| **Ponto de Equilíbrio (Break-even)** | **136 clientes** | **86 clientes** | **66 clientes** |
| **Resultado Operacional** | **- R$ 1.307,00** | **+ R$ 500,00** | **+ R$ 4.360,00** |
| **Margem Operacional (%)** | **- 36,61%** | **+ 10,00%** | **+ 45,42%** |

---

## 3. Análise de Sensibilidade
A análise isolada dos parâmetros demonstra que a **Margem de Contribuição Unitária ($MC_u$)** é a premissa de maior sensibilidade no negócio.

* **Impacto do Preço:** Reduzir o preço de R$ 50,00 para R$ 42,00 derruba a $MC_u$ de R$ 35,00 para R$ 25,80 (-26,3%), elevando a necessidade de clientes em quase 60% apenas para não operar no prejuízo.
* **Fronteira de Inviabilidade Operacional:** Se o preço cair para R$ 11,11 (com taxa de 10% e custo variável de R$ 10,00), a $MC_u$ se torna zero. A partir desse limite, nenhum volume de vendas cobrirá o custo fixo.

---

## 4. Decisão Defendida e Regra de Viabilidade

Com base nos dados apurados pelo simulador, a equipe recomenda a adoção da estratégia do **Cenário Base (P = R$ 50,00)** para o lançamento do produto, amparada pelas seguintes regras explícitas:

1. **Condição de Continuidade Comercial:** A operação só é viável se a equipe comercial garantir a captação e manutenção ativa de pelo menos **86 clientes**.
2. **Margem de Segurança:** Com a meta inicial de 100 clientes, a operação opera com uma margem de segurança de **14 assinantes** (14% acima do break-even), gerando R$ 500,00 de saldo positivo (10% de margem líquida didática).
3. **Gatilho de Interrupção ou Pivotagem:** Caso o volume de cancelamentos reduza a carteira abaixo de 86 assinantes por dois meses consecutivos sem perspectiva de repactuação de custos fixos, ou se os custos variáveis por usuário subirem acima de R$ 35,00 (anulando o ponto de equilíbrio), o produto deve ter seus investimentos suspensos ou seu modelo tarifário reestruturado.