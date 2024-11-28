package com.unt.servdatos.repositories;

import com.unt.servdatos.models.DetalleCarrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleCarritoRepository extends JpaRepository<DetalleCarrito, Long> {
    List<DetalleCarrito> findByCarritoIdCarrito(Long idCarrito); // Encuentra los detalles de un carrito
}

