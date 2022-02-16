package com.example.MaterialesConstruccion.controllers;

import java.util.ArrayList;

import com.example.MaterialesConstruccion.models.Compra;
import com.example.MaterialesConstruccion.services.CompraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Compra")
public class CompraController {
    @Autowired
    CompraService compraService;


    @GetMapping()
    public ArrayList<Compra> obtenerCompras(){
        return compraService.todasLasCompras();
    }

    @PostMapping()
    public String guardar(@RequestBody Compra compra){
        return compraService.guardar(compra);
    }

}
