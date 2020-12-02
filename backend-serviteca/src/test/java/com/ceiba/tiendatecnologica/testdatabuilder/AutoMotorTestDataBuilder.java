package com.ceiba.tiendatecnologica.testdatabuilder;

import com.ceiba.tiendatecnologica.aplicacion.comando.ComandoAutoMotor;
import com.ceiba.tiendatecnologica.dominio.AutoMotor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class AutoMotorTestDataBuilder {

    private int id;
    private int cedula;
    private String placa;
    private String tipo_automotor;
    private String servicios;
    private LocalTime hora_entrada;
    private LocalTime hora_salida;
    private double valor_a_pagar;
    Calendar calendar;

    public AutoMotorTestDataBuilder() throws ParseException {
        calendar = Calendar.getInstance();
        calendar.setTime(new SimpleDateFormat("kk:mm:ss").parse("01:39:12"));
        this.cedula = 1152709223;
        this.placa = "RMJ-725";
        this.tipo_automotor = "automovil";
        this.servicios = "lavado,polichado";
        this.hora_entrada = LocalTime.parse("01:39:12");
        this.hora_salida =  LocalTime.parse("02:39:12");
    }


    public AutoMotorTestDataBuilder conServicios(String servicios) {
        this.servicios = servicios;
        return this;
    }

    public AutoMotor build() {
        return new AutoMotor(
                id,
                cedula,
                placa,
                tipo_automotor,
                servicios,
                hora_entrada,
                hora_salida,
                valor_a_pagar
        );
    }

    public ComandoAutoMotor buildComando(){
        return new ComandoAutoMotor (
                id,
                cedula,
                placa,
                tipo_automotor,
                servicios,
                hora_entrada,
                hora_salida,
                valor_a_pagar
        );
    }
}
