package com.g10.locadora.ms_veiculos.controller;

import com.g10.locadora.ms_veiculos.model.Veiculo;
import com.g10.locadora.ms_veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;

    @GetMapping
    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }
}