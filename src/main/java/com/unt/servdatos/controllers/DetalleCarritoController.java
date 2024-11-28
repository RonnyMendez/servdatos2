package com.unt.servdatos.controllers;

import com.unt.servdatos.models.DetalleCarrito;
import com.unt.servdatos.services.DetalleCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallesCarrito")
public class DetalleCarritoController {

    @Autowired
    private DetalleCarritoService detalleCarritoService;

    @GetMapping("/carrito/{idCarrito}")
    public List<DetalleCarrito> obtenerPorCarrito(@PathVariable Long idCarrito) {
        return detalleCarritoService.obtenerPorCarrito(idCarrito);
    }

    @PostMapping
    public DetalleCarrito guardar(@RequestBody DetalleCarrito detalleCarrito) {
        return detalleCarritoService.guardar(detalleCarrito);
    }
}

