# Simulador de Precificação SaaS

Aplicação web desenvolvida como ferramenta de apoio à tomada de decisão econômica para precificação de software como serviço (SaaS), no âmbito da disciplina de Engenharia Econômica da Faculdade SENAI Fatesg.

## Integrantes do Grupo
* Théo da Silva Sá
* João Vitor Bier Barros

## Objetivo do Projeto
Apoiar engenheiros de software e gestores de produto na definição do preço mensal e volume mínimo de assinantes necessários para cobrir custos e garantir a sustentabilidade financeira do negócio. O sistema calcula o ponto de equilíbrio (break-even point), a margem operacional e gera projeções gráficas dinâmicas, permitindo a análise de sensibilidade em diferentes cenários.

## Tecnologias Utilizadas
* Back-end: Java 21, Spring Boot 3, Maven
* Front-end: Angular 17+, TypeScript, Chart.js
* Arquitetura: API REST com comunicação assíncrona via HttpClient e suporte a CORS configurado

## Como Executar o Projeto

### Pré-requisitos
* Java Development Kit (JDK) 21
* Node.js (v18+) e npm
* Angular CLI instalado globalmente (npm install -g @angular/cli)

### 1. Iniciar o Back-end (Spring Boot)
1. Acesse a pasta do servidor no terminal: cd backend
2. Execute a aplicação com o Maven Wrapper:
   * Windows: .\mvnw spring-boot:run
   * Linux/Mac: ./mvnw spring-boot:run
3. O serviço ficará ativo em: http://localhost:8080

### 2. Iniciar o Front-end (Angular)
1. Em um novo terminal, acesse a pasta da interface: cd frontend
2. Instale as dependências: npm install
3. Inicie o servidor local de desenvolvimento: ng serve --open
4. A aplicação abrirá automaticamente no navegador em: http://localhost:4200

## Execução dos Testes Automatizados
Para rodar os testes unitários do núcleo de cálculo no back-end, acesse a pasta backend e execute:
.\mvnw test

## Caso de Referência para Validação
Utilize o botão "Carregar Exemplo Base" na interface para carregar os valores padrão do enunciado:
* Custo Fixo Mensal: R$ 3.000,00
* Custo Variável Unitário: R$ 10,00
* Preço Mensal: R$ 50,00
* Quantidade de Clientes: 100
* Taxa de Tributos: 0.10 (10%)

Valores Esperados na Validação:
* Receita: R$ 5.000,00
* Tributos: R$ 500,00
* Resultado Operacional: R$ 500,00
* Margem: 10,0%
* Ponto de Equilíbrio: 86 clientes

## Indicadores Econômicos Calculados
* Receita Total (R): Faturamento bruto mensal baseado no volume de assinaturas (Receita = Preço * Clientes).
* Tributos (T): Dedução fiscal calculada sobre o faturamento bruto (Tributos = Receita * Taxa).
* Margem de Contribuição Unitária (MCu): Valor líquido por cliente disponível para amortizar os custos de estrutura fixa (MCu = Preço * (1 - Taxa) - CustoVariável).
* Resultado Operacional: Saldo líquido deduzindo custos fixos, variáveis e impostos da receita do período.
* Margem Operacional (%): Percentual de retorno sobre a receita bruta total.
* Ponto de Equilíbrio (Qe): Número mínimo de clientes necessários para cobrir todos os custos e impostos sem operar em prejuízo (teto(CustoFixo / MCu)).

## Limitações do Modelo
1. Trata-se de um modelo didático focado no saldo operacional a curto prazo, sem amortizações ou depreciações contábeis completas.
2. Não considera taxas dinâmicas de cancelamento (churn rate) ou variações no custo de aquisição de clientes (CAC) ao longo do tempo.
3. Caso a contribuição unitária seja nula ou negativa (MCu <= 0), a aplicação emite um alerta explícito indicando a impossibilidade de atingir o equilíbrio financeiro por expansão de volume.
