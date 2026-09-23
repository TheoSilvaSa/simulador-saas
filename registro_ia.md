# Registro de Interações com Agente de Inteligência Artificial

## Interação 1: Resolução de Conflito de Repositório Git Aninhado
* Integrante responsável: Théo da Silva Sá
* Objetivo: Desfazer a criação de submódulo involuntário na pasta do front-end que impedia o versionamento dos arquivos no GitHub.
* Sugestão da IA: Remover a pasta oculta .git de frontend, desindexar a pasta em cache (git rm --cached frontend) e recriar o rastreamento da raiz.
* Verificação humana: Foi verificado no Windows Explorer que o comando ng new gerou seu próprio .git. No IntelliJ, foi removido o Directory Mapping correspondente.
* Decisão: Aceita. O código do front-end passou a ser versionado na árvore principal do repositório.

## Interação 2: Isolamento da Regra de Negócio no Back-end
* Integrante responsável: João Vitor Bier Barros
* Objetivo: Garantir que o cálculo de ponto de equilíbrio utilize a função teto (Math.ceil) e lance aviso se a margem de contribuição for <= 0.
* Sugestão da IA: Criar o método calcular() no PricingService encapsulando BigDecimal/Double puro, independente dos controladores REST.
* Verificação humana: Revisado o teste unitário PricingServiceTest executando .\mvnw test e confirmando o resultado de 86 clientes para o caso base.
* Decisão: Aceita integralmente.

## Interação 3: Correção de Overflow Visual por Dízima Periódica
* Integrante responsável: Théo da Silva Sá
* Objetivo: Evitar que valores com muitas casas decimais quebrassem o layout dos cards (ex: 19.77777777778%).
* Sugestão da IA: Aplicar o pipe nativo do Angular no template HTML (resultado.margem | number:'1.0-2').
* Verificação humana: Inseridos os dados de teste (CF: 5000, CV: 11, P: 75, Q: 120, Taxa: 0.1). O valor foi exibido formatado como 19.78% sem extrapolar a largura do card.
* Decisão: Aceita.

## Interação 4: Redesenho para Layout em Dashboard (Eliminação de Rolagem)
* Integrante responsável: João Vitor Bier Barros
* Objetivo: Agrupar formulário e gráfico em uma visualização única sem exigir rolagem de página durante a apresentação de 10 minutos.
* Sugestão da IA: Estruturar em CSS Grid com duas colunas (painel lateral de 300px e área gráfica responsiva com altura fixa de 400px).
* Verificação humana: Testada a aplicação no navegador em 1080p. Todos os inputs, cards de resultado e gráfico permaneceram 100% visíveis sem barra de rolagem.
* Decisão: Aceita com ajustes de espaçamento.

## Interação 5: Remoção dos Controles de Incremento (Spinners)
* Integrante responsável: Théo da Silva Sá
* Objetivo: Remover as setas verticais automáticas dos inputs de número que poluíam a usabilidade.
* Sugestão da IA: Inserir regras globais de CSS anulando o seletor ::-webkit-inner-spin-button e definindo -moz-appearance: textfield.
* Verificação humana: Confirmada a digitação limpa dos números em navegadores baseados em Chromium e Firefox.
* Decisão: Aceita.