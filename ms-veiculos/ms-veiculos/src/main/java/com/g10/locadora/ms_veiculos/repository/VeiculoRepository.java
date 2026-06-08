package com.g10.locadora.ms_veiculos.repository;

import com.g10.locadora.ms_veiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}