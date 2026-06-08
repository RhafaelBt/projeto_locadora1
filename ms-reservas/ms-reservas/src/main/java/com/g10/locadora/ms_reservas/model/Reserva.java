package com.g10.locadora.ms_reservas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idVeiculo;
    private String nomeCliente;
    private LocalDate dataReserva;

    public Reserva() {}
    public Reserva(Long idVeiculo, String nomeCliente, LocalDate dataReserva) {
        this.idVeiculo = idVeiculo;
        this.nomeCliente = nomeCliente;
        this.dataReserva = dataReserva;
    }


    public Long getId() { return id; }
    public Long getIdVeiculo() { return idVeiculo; }
    public void setIdVeiculo(Long idVeiculo) { this.idVeiculo = idVeiculo; }
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public LocalDate getDataReserva() { return dataReserva; }
    public void setDataReserva(LocalDate dataReserva) { this.dataReserva = dataReserva; }
}