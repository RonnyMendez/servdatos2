package com.unt.servdatos.services;

import com.unt.servdatos.models.Compra;
import com.unt.servdatos.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> obtenerTodas() {
        return compraRepository.findAll();
    }

    public Optional<Compra> obtenerPorId(Long id) {
        return compraRepository.findById(id);
    }

    public List<Compra> obtenerPorCliente(Long idCliente) {
        return compraRepository.findByClienteIdCliente(idCliente);
    }

    public Compra guardar(Compra compra) {
        return compraRepository.save(compra);
    }

    public void eliminar(Long id) {
        compraRepository.deleteById(id);
    }
}

