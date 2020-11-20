package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Servicios;

public class ServiciosTestDataBuilder {

    private String nombreAutoMotor;
    private String nombreServicio;
    private double precio;

    public ServiciosTestDataBuilder() {
        nombreAutoMotor = "Automovil";
        nombreServicio = "Lavado";
        precio = 8.500;
    }

    public ServiciosTestDataBuilder conAutomotor(String nombreAutoMotor) {
        this.nombreAutoMotor = nombreAutoMotor;
        return this;
    }

    public ServiciosTestDataBuilder conServicio(String servicio) {
        this.nombreServicio = servicio;
        return this;
    }
    public ServiciosTestDataBuilder conPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public Servicios build() {
        return new Servicios(nombreAutoMotor, nombreServicio, precio);
    }
}