package com.supermercado.sistema_ventas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/")
    public String inicio(){
        return "Bienvenido a la API de ventas";
    }
}
