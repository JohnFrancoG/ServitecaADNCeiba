package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.AutoMotor;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class ServiciosAutoMotorTestDataBuilder {

    private Long cedulaConductor;
    private String placaAutoMotor;
    private String tipoAutoMotor;
    private List<String> serviciosTomados;
    private Time horaDeIngreso;
    private Time horaDeSalida;
    private double valorPorPagar;
    private int vecesAtendido;
    double[] precios;

    public ServiciosAutoMotorTestDataBuilder() {
        cedulaConductor = 1152709223l;
        placaAutoMotor = "RMJ-123";
        tipoAutoMotor = "Automovil";
        serviciosTomados = new ArrayList<>();
        serviciosTomados.add("Lavado");
        serviciosTomados.add("Polichado");
        vecesAtendido = 50;
        precios = new double[] {8.500,12.000};
    }

    public ServiciosAutoMotorTestDataBuilder conServicios(List<String> serviciosTomados) {
        this.serviciosTomados = new ArrayList<>(serviciosTomados);
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
        return new AutoMotor(
                cedulaConductor,
                placaAutoMotor,
                tipoAutoMotor,
                serviciosTomados,
                horaDeIngreso,
                horaDeSalida,
                valorPorPagar,
                vecesAtendido,
                precios
        );
    }
}
