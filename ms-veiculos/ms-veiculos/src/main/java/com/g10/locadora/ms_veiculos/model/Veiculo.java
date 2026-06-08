package com.g10.locadora.ms_veiculos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String placa;

    // Construtores, Getters e Setters (ou use o @Data do Lombok se adicionou)
    public Veiculo() {}
    public Veiculo(String modelo, String placa) { this.modelo = modelo; this.placa = placa; }
    public Long getId() { return id; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
}