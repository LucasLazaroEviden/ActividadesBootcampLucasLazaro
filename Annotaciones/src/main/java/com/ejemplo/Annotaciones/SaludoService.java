package com.ejemplo.Annotaciones;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String obtenerSaludo() {
        return "Hola que tal";
    }
}
