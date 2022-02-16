package com.example.MaterialesConstruccion.repositories;

import com.example.MaterialesConstruccion.models.Compra;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends CrudRepository<Compra,Long>{
    
}
