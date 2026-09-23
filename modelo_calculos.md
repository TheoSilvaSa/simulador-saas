# Modelo Matemático e Demonstração de Cálculos

## 1. Variáveis e Unidades
* Custo Fixo Mensal (CF): R$ (Reais)
* Custo Variável Unitário (CV_u): R$ / cliente / mês
* Preço de Assinatura Mensal (P): R$ / cliente / mês
* Volume de Clientes (Q): Unidades inteiras
* Taxa de Tributos (t): Fração decimal (Ex: 10% = 0.10)

## 2. Fórmulas Aplicadas
1. Receita Bruta (R):
   R = P * Q

2. Tributos sobre a Receita (T):
   T = R * t

3. Custo Variável Total (CV_total):
   CV_total = CV_u * Q

4. Margem de Contribuição Unitária (MC_u):
   MC_u = P * (1 - t) - CV_u

5. Resultado Operacional (Lucro/Prejuízo Líquido Didático):
   Resultado = R - CF - CV_total - T
   (Equivalente a: Resultado = (MC_u * Q) - CF)

6. Margem de Lucro (%):
   Margem = (Resultado / R) * 100  (válido para R > 0)

7. Ponto de Equilíbrio Operacional (Q_e):
   Q_e = teto(CF / MC_u)
   Condição de validade: MC_u > 0. Se MC_u <= 0, Q_e é indefinido (inviável).

## 3. Resolução Passo a Passo do Caso de Referência
Premissas: CF = R$ 3.000,00; CV_u = R$ 10,00; P = R$ 50,00; Q = 100 clientes; t = 0.10 (10%).

* Passo 1: Receita Bruta
  R = 50 * 100 = R$ 5.000,00

* Passo 2: Tributos
  T = 5.000 * 0.10 = R$ 500,00

* Passo 3: Custos Variáveis Totais
  CV_total = 10 * 100 = R$ 1.000,00

* Passo 4: Resultado Operacional
  Resultado = 5.000 - 3.000 - 1.000 - 500 = R$ 500,00

* Passo 5: Margem de Lucro Operacional
  Margem = (500 / 5.000) * 100 = 10,0%

* Passo 6: Margem de Contribuição Unitária
  MC_u = 50 * (1 - 0.10) - 10 = (50 * 0.90) - 10 = 45 - 10 = R$ 35,00 por cliente

* Passo 7: Ponto de Equilíbrio (Break-even)
  Q_e = teto(3.000 / 35) = teto(85,714...) = 86 clientes.