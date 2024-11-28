package com.unt.servdatos.repositories;

import com.unt.servdatos.models.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {
    List<Carrito> findByClienteIdCliente(Long idCliente); // Encuentra carritos por cliente
}
