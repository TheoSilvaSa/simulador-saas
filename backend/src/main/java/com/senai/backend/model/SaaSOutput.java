package com.senai.backend.model;

public class SaaSOutput {
    private double receita;
    private double tributos;
    private double resultado;
    private double margem;
    private Integer clientesEquilibrio;
    private String mensagemAviso;

    public SaaSOutput(double receita, double tributos, double resultado, double margem, Integer clientesEquilibrio, String mensagemAviso) {
        this.receita = receita;
        this.tributos = tributos;
        this.resultado = resultado;
        this.margem = margem;
        this.clientesEquilibrio = clientesEquilibrio;
        this.mensagemAviso = mensagemAviso;
    }

    public double getReceita() { return receita; }
    public double getTributos() { return tributos; }
    public double getResultado() { return resultado; }
    public double getMargem() { return margem; }
    public Integer getClientesEquilibrio() { return clientesEquilibrio; }
    public String getMensagemAviso() { return mensagemAviso; }
}