# Requisitos e Critérios de Aceitação - Simulador SaaS

## Requisitos Funcionais (RF)

* RF01 - Entrada de Parâmetros: O sistema deve permitir a entrada dos campos: Custo Fixo Mensal (R$), Custo Variável Unitário (R$), Preço Mensal (R$), Quantidade de Clientes e Taxa de Tributos (decimal).
    * Critério de Aceitação: Todos os campos numéricos devem aceitar valores decimais/inteiros positivos.

* RF02 - Cálculo dos Indicadores Financeiros: O sistema deve calcular Receita Total, Tributos Totais, Margem de Contribuição Unitária, Resultado Operacional, Margem Operacional (%) e Ponto de Equilíbrio (clientes).
    * Critério de Aceitação: Dado Custo Fixo = 3000, Variável = 10, Preço = 50, Clientes = 100 e Taxa = 0.10, o sistema retorna exatamente Receita = 5000, Tributos = 500, Resultado = 500, Margem = 10% e Equilíbrio = 86 clientes.

* RF03 - Tratamento de Inviabilidade (Margem de Contribuição Não Positiva): Quando Preço * (1 - Taxa) <= Custo Variável, o sistema não deve calcular o ponto de equilíbrio e deve emitir mensagem explicativa.
    * Critério de Aceitação: Com Preço = 10, Taxa = 0.10 e Variável = 10 (MCu = -1), o sistema exibe alerta informando que não há equilíbrio financeiro por aumento de volume.

* RF04 - Carga Automática do Exemplo Base: A interface deve disponibilizar um botão para preenchimento automático das variáveis de teste da disciplina.
    * Critério de Aceitação: Ao clicar em "Carregar Exemplo Base", os campos são preenchidos com 3000, 10, 50, 100 e 0.10.

* RF05 - Projeção Gráfica: A interface deve exibir gráfico linear correlacionando o número de clientes ao resultado operacional (R$).
    * Critério de Aceitação: O eixo X deve apresentar a escala de clientes (0 até o volume projetado) e o eixo Y o resultado financeiro, destacando o ponto em que o saldo cruza o valor zero.

* RF06 - Exportação de Relatório: A aplicação deve permitir exportar os dados inseridos e calculados em formato CSV.
    * Critério de Aceitação: Ao acionar o botão de exportação, o navegador inicia o download de arquivo `.csv` contendo todas as variáveis e métricas calculadas.

## Requisitos Não Funcionais (RNF)

* RNF01: O cálculo deve ser processado exclusivamente pelo back-end em Java 21 / Spring Boot 3 de forma desacoplada da interface.
* RNF02: O front-end em Angular deve comunicar via requisições assíncronas HTTP REST (POST).
* RNF03: Arredondamento do ponto de equilíbrio sempre para cima (menor número inteiro maior ou igual à razão calculada).