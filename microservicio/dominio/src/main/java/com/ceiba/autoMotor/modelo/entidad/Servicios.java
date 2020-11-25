package com.ceiba.autoMotor.modelo.entidad;

public class Servicios {

    private String nombreAutoMotor;
    private String nombreServicio;
    private double precio;

    public String getNombreAutoMotor() {
        return nombreAutoMotor;
    }

    public void setNombreAutoMotor(String nombreAutoMotor) {
        this.nombreAutoMotor = nombreAutoMotor;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Servicios(String nombreAutoMotor, String nombreServicio, double precio) {
        this.nombreAutoMotor = nombreAutoMotor;
        this.nombreServicio = nombreServicio;
        this.precio = precio;
    }
}
