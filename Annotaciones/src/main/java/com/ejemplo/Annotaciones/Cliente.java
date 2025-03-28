package com.ejemplo.Annotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

    private final SaludoService saludoService;

    @Autowired
    public Cliente(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    public void mostrarSaludo() {
        System.out.println(saludoService.obtenerSaludo());
    }
}
