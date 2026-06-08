package com.g10.locadora.ms_reservas.repository;

import com.g10.locadora.ms_reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}