package com.senai.backend.service;

import com.senai.backend.model.SaaSInput;
import com.senai.backend.model.SaaSOutput;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PricingServiceTest {

    private final PricingService service = new PricingService();

    @Test
    void deveCalcularCenarioDeReferenciaCorretamente() {
        // Entradas: Fixo 3000, Variável 10, Preço 50, 100 clientes, 10% tributos
        SaaSInput input = new SaaSInput(3000.0, 10.0, 50.0, 100, 0.10);

        SaaSOutput output = service.calcular(input);

        assertEquals(5000.0, output.getReceita(), 0.01, "Receita incorreta");
        assertEquals(500.0, output.getTributos(), 0.01, "Tributos incorretos");
        assertEquals(500.0, output.getResultado(), 0.01, "Resultado incorreto");
        assertEquals(10.0, output.getMargem(), 0.01, "Margem incorreta");
        assertEquals(86, output.getClientesEquilibrio(), "Ponto de equilíbrio incorreto");
        assertNull(output.getMensagemAviso(), "Não deve haver mensagem de aviso neste cenário");
    }

    @Test
    void deveRetornarAvisoQuandoNaoHaEquilibrio() {
        // Preço de 10 é insuficiente para cobrir o custo variável de 10 + 10% de tributo
        SaaSInput input = new SaaSInput(3000.0, 10.0, 10.0, 100, 0.10);

        SaaSOutput output = service.calcular(input);

        assertNull(output.getClientesEquilibrio(), "Equilíbrio deve ser nulo");
        assertEquals("Não há equilíbrio por aumento do volume nesse modelo.", output.getMensagemAviso());
    }
}