package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.ServiciosAutoMotor;

public class ServiciosAutoMotorTestDataBuilder {

    private String nombreAutoMotor;
    private String serviciosTomados;
    private int cantidadServicios;
    private int vecesAtendido;
    double precios[];

    public ServiciosAutoMotorTestDataBuilder() {
        nombreAutoMotor = "Automovil";
        serviciosTomados = "Lavado,Polichado";
        cantidadServicios = serviciosTomados.split(",").length;
        vecesAtendido = 50;
        precios = new double[] {8.500,12.000};
    }

    public ServiciosAutoMotorTestDataBuilder conServicios(String serviciosTomados) {
        this.serviciosTomados = serviciosTomados;
        this.cantidadServicios = serviciosTomados.split(",").length;
        return this;
    }

    public ServiciosAutoMotorTestDataBuilder conVecesAtendido(int vecesAtendido) {
        this.vecesAtendido = vecesAtendido;
        return this;
    }

    public ServiciosAutoMotorTestDataBuilder conPrecios(double precios[]) {
        this.precios = precios;
        return this;
    }

    public ServiciosAutoMotor build() {
        return new ServiciosAutoMotor(nombreAutoMotor, serviciosTomados, cantidadServicios, vecesAtendido, precios);
    }
}
