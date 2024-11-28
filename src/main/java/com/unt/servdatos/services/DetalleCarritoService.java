package com.unt.servdatos.services;

import com.unt.servdatos.models.DetalleCarrito;
import com.unt.servdatos.repositories.DetalleCarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleCarritoService {

    @Autowired
    private DetalleCarritoRepository detalleCarritoRepository;

    public List<DetalleCarrito> obtenerPorCarrito(Long idCarrito) {
        return detalleCarritoRepository.findByCarritoIdCarrito(idCarrito);
    }

    public DetalleCarrito guardar(DetalleCarrito detalleCarrito) {
        return detalleCarritoRepository.save(detalleCarrito);
    }

    public void eliminar(Long id) {
        detalleCarritoRepository.deleteById(id);
    }
}

