package com.unt.servdatos.services;

import com.unt.servdatos.models.DetalleCompra;
import com.unt.servdatos.repositories.DetalleCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleCompraService {

    @Autowired
    private DetalleCompraRepository detalleCompraRepository;

    public List<DetalleCompra> obtenerPorCompra(Long idCompra) {
        return detalleCompraRepository.findByCompraIdCompra(idCompra);
    }

    public DetalleCompra guardar(DetalleCompra detalleCompra) {
        return detalleCompraRepository.save(detalleCompra);
    }
}

