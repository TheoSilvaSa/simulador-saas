package com.senai.backend.service;

import com.senai.backend.model.SaaSInput;
import com.senai.backend.model.SaaSOutput;
import org.springframework.stereotype.Service;

@Service
public class PricingService {

    public SaaSOutput calcular(SaaSInput input) {
        double receita = input.getPreco() * input.getClientes();
        double tributos = receita * input.getTaxaTributos();

        double contribuicaoUnitaria = (input.getPreco() * (1.0 - input.getTaxaTributos())) - input.getCustoVariavel();
        double resultado = receita - input.getCustoFixo() - (input.getCustoVariavel() * input.getClientes()) - tributos;

        double margem = 0.0;
        if (receita > 0) {
            margem = (resultado / receita) * 100.0;
        }

        Integer clientesEquilibrio = null;
        String mensagemAviso = null;

        if (contribuicaoUnitaria > 0) {
            clientesEquilibrio = (int) Math.ceil(input.getCustoFixo() / contribuicaoUnitaria);
        } else if (input.getCustoFixo() > 0) {
            mensagemAviso = "Não há equilíbrio por aumento do volume nesse modelo.";
        }

        return new SaaSOutput(receita, tributos, resultado, margem, clientesEquilibrio, mensagemAviso);
    }
}