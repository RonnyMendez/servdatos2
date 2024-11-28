package com.unt.servdatos.repositories;

import com.unt.servdatos.models.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findByClienteIdCliente(Long idCliente); // Encuentra compras por cliente
}

