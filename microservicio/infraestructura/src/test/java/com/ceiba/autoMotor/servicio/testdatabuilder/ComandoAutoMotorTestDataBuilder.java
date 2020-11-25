package com.ceiba.autoMotor.servicio.testdatabuilder;

import com.ceiba.autoMotor.comando.ComandoAutoMotor;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComandoAutoMotorTestDataBuilder {
    private Long cedulaConductor;
    private String placaAutoMotor;
    private String tipoAutoMotor;
    private List<String> serviciosTomados;
    private Time horaDeIngreso;
    private Time horaDeSalida;
    private double valorPorPagar;
    private int vecesAtendido;
    double[] precios;


    public ComandoAutoMotorTestDataBuilder() {
        cedulaConductor = 1152709223l;
        placaAutoMotor = "RMJ-123";
        tipoAutoMotor = "Automovil";
        serviciosTomados = new ArrayList<>();
        serviciosTomados.add("Lavado");
        serviciosTomados.add("Polichado");
        horaDeIngreso = new Time(new Date().getTime());
        horaDeSalida = new Time(new Date().getTime());
        vecesAtendido = 50;
        precios = new double[] {8.500,12.000};
    }

    public ComandoAutoMotor build() {
        return new ComandoAutoMotor(
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
