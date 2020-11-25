package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.AutoMotor;

import java.util.ArrayList;
import java.util.List;

public class ServiciosAutoMotorTestDataBuilder {

    private final String nombreAutoMotor;
    private List<String> serviciosTomados;
    private int cantidadServicios;
    private int vecesAtendido;
    double[] precios;

    public ServiciosAutoMotorTestDataBuilder() {
        nombreAutoMotor = "Automovil";
        serviciosTomados = new ArrayList<>();
        serviciosTomados.add("Lavado");
        serviciosTomados.add("Polichado");
        vecesAtendido = 50;
        precios = new double[] {8.500,12.000};
    }

    public ServiciosAutoMotorTestDataBuilder conServicios(List<String> serviciosTomados) {
        this.serviciosTomados = new ArrayList<>(serviciosTomados);
        this.cantidadServicios = serviciosTomados.toArray().length;
        return this;
    }

    public ServiciosAutoMotorTestDataBuilder conVecesAtendido(int vecesAtendido) {
        this.vecesAtendido = vecesAtendido;
        return this;
    }

    public ServiciosAutoMotorTestDataBuilder conPrecios(double[] precios) {
        this.precios = precios;
        return this;
    }

    public AutoMotor build() {
        return null;
        //return new AutoMotor(nombreAutoMotor, serviciosTomados, cantidadServicios, vecesAtendido, precios);
    }
}
