# Evidências de Testes do Núcleo de Cálculos

Registro das cinco verificações formais exigidas para validação matemática e comportamental do sistema.

## Verificação 1: Caso Normal (Caso Base de Referência)
* Tipo: Normal
* Entradas: Custo Fixo = R$ 3.000,00 | Custo Variável = R$ 10,00 | Preço = R$ 50,00 | Clientes = 100 | Tributos = 0,10 (10%)
* Resultado Esperado: Receita = R$ 5.000,00 | Tributos = R$ 500,00 | Resultado = R$ 500,00 | Margem = 10,0% | Ponto de Equilíbrio = 86 clientes
* Resultado Obtido: Receita = R$ 5.000,00 | Tributos = R$ 500,00 | Resultado = R$ 500,00 | Margem = 10,0% | Ponto de Equilíbrio = 86 clientes
* Situação: APROVADO

## Verificação 2: Caso Limite (Margem de Contribuição Unitária Nula / Inviabilidade)
* Tipo: Limite
* Entradas: Custo Fixo = R$ 2.000,00 | Custo Variável = R$ 18,00 | Preço = R$ 20,00 | Clientes = 50 | Tributos = 0,10 (10%)
* Detalhe Matemático: MCu = 20 * (1 - 0,10) - 18 = 18 - 18 = 0
* Resultado Esperado: Bloqueio do cálculo de equilíbrio e emissão de mensagem alertando que não há equilíbrio por aumento de volume
* Resultado Obtido: Mensagem exibida informando inviabilidade por expansão de volume | Clientes Equilíbrio = 0
* Situação: APROVADO

## Verificação 3: Entrada Inválida (Receita Nula / Clientes = 0)
* Tipo: Entrada Inválida
* Entradas: Custo Fixo = R$ 3.000,00 | Custo Variável = R$ 10,00 | Preço = R$ 50,00 | Clientes = 0 | Tributos = 0,10 (10%)
* Resultado Esperado: Receita = R$ 0,00 | Tributos = R$ 0,00 | Resultado = - R$ 3.000,00 | Margem = 0,0% (tratamento para evitar divisão por zero) | Equilíbrio = 86 clientes
* Resultado Obtido: Receita = R$ 0,00 | Tributos = R$ 0,00 | Resultado = - R$ 3.000,00 | Margem = 0,0% | Equilíbrio = 86 clientes
* Situação: APROVADO

## Verificação 4: Cenário Desfavorável (Prejuízo Operacional)
* Tipo: Cenário Desfavorável
* Entradas: Custo Fixo = R$ 4.000,00 | Custo Variável = R$ 15,00 | Preço = R$ 30,00 | Clientes = 60 | Tributos = 0,10 (10%)
* Detalhe Matemático: MCu = 30 * 0,9 - 15 = 12. Receita = 1.800. Tributos = 180. Custos = 4.000 + 900 = 4.900.
* Resultado Esperado: Receita = R$ 1.800,00 | Tributos = R$ 180,00 | Resultado = - R$ 3.280,00 | Margem = - 182,22% | Ponto de Equilíbrio = 334 clientes
* Resultado Obtido: Receita = R$ 1.800,00 | Tributos = R$ 180,00 | Resultado = - R$ 3.280,00 | Margem = - 182,22% | Ponto de Equilíbrio = 334 clientes
* Situação: APROVADO

## Verificação 5: Alteração de Premissa (Aumento de Escala e Eficiência de Custos)
* Tipo: Alteração de Premissa
* Entradas: Custo Fixo = R$ 3.000,00 | Custo Variável = R$ 8,00 | Preço = R$ 60,00 | Clientes = 160 | Tributos = 0,10 (10%)
* Detalhe Matemático: MCu = 60 * 0,9 - 8 = 46. Equilíbrio = teto(3000 / 46) = 66 clientes.
* Resultado Esperado: Receita = R$ 9.600,00 | Tributos = R$ 960,00 | Resultado = R$ 4.360,00 | Margem = 45,42% | Ponto de Equilíbrio = 66 clientes
* Resultado Obtido: Receita = R$ 9.600,00 | Tributos = R$ 960,00 | Resultado = R$ 4.360,00 | Margem = 45,42% | Ponto de Equilíbrio = 66 clientes
* Situação: APROVADO