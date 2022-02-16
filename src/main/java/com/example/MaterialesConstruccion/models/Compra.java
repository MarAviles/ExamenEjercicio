package com.example.MaterialesConstruccion.models;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false )


    private Long id;
    private String nombre;
    private Date fecha;
    private Float totalcompra;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Float getTotalcompra() {
        return totalcompra;
    }

    public void setTotalcompra(Float totalcompra){
        this.totalcompra = totalcompra;
        ;
    }
}
