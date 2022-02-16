package com.example.MaterialesConstruccion.services;

import com.example.MaterialesConstruccion.models.Compra;
import com.example.MaterialesConstruccion.repositories.CompraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class CompraService {
    @Autowired
    CompraRepository CompraRepo;

    public ArrayList<Compra> todasLasCompras() {
        return null;
    }

    public String guardar(Compra compra) {
        return null;
    }
    

}