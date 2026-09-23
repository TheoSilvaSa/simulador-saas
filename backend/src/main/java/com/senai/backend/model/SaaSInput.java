package com.senai.backend.model;

public class SaaSInput {
    private double custoFixo;
    private double custoVariavel;
    private double preco;
    private int clientes;
    private double taxaTributos;

    public SaaSInput(double custoFixo, double custoVariavel, double preco, int clientes, double taxaTributos) {
        this.custoFixo = custoFixo;
        this.custoVariavel = custoVariavel;
        this.preco = preco;
        this.clientes = clientes;
        this.taxaTributos = taxaTributos;
    }

    public double getCustoFixo() { return custoFixo; }
    public double getCustoVariavel() { return custoVariavel; }
    public double getPreco() { return preco; }
    public int getClientes() { return clientes; }
    public double getTaxaTributos() { return taxaTributos; }
}