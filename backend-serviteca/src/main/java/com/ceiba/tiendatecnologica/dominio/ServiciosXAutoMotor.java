package com.ceiba.tiendatecnologica.dominio;

import java.time.LocalTime;

public class ServiciosXAutoMotor {
    private int id;
    private String nombre_servicio;
    private String tipo_automotor;
    private double precio;
    private LocalTime tiempo_promedio_servicio;

    public ServiciosXAutoMotor(int id, String nombre_servicio, String tipo_automotor, double precio, LocalTime tiempo_promedio_servicio) {
        this.id = id;
        this.nombre_servicio = nombre_servicio;
        this.tipo_automotor = tipo_automotor;
        this.precio = precio;
        this.tiempo_promedio_servicio = tiempo_promedio_servicio;
    }

    public int getId() {
        return id;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public String getTipo_automotor() {
        return tipo_automotor;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalTime getTiempo_promedio_servicio() {
        return tiempo_promedio_servicio;
    }
}
