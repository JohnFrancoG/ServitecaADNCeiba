package com.ceiba.tiendatecnologica.aplicacion.comando;

import java.sql.Time;
import java.time.LocalTime;

public class ComandoAutoMotor {

    private int id;
    private int cedula;
    private String placa;
    private String tipoAutoMotor;
    private String servicios;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private double valorAPagar;

    public ComandoAutoMotor(int id, int cedula, String placa, String tipoAutoMotor, String servicios, LocalTime horaEntrada, LocalTime horaSalida, double valorAPagar) {
        this.id = id;
        this.cedula = cedula;
        this.placa = placa;
        this.tipoAutoMotor = tipoAutoMotor;
        this.servicios = servicios;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valorAPagar = valorAPagar;
    }

    public int getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoAutoMotor() {
        return tipoAutoMotor;
    }

    public String getServicios() {
        return servicios;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }
}
