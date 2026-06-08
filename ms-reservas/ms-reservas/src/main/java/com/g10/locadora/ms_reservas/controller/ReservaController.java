package com.g10.locadora.ms_reservas.controller;

import com.g10.locadora.ms_reservas.model.Reserva;
import com.g10.locadora.ms_reservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    @GetMapping
    public List<Reserva> listarTodas() {
        return repository.findAll();
    }

    @PostMapping
    public Reserva criarReserva(@RequestBody Reserva reserva) {
        return repository.save(reserva);
    }
}