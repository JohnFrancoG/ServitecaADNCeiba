package com.ceiba.tiendatecnologica.dominio;

import java.sql.Time;
import java.time.LocalTime;

public class AutoMotor {
    private int id;
    private int cedula;
    private String placa;
    private String tipo_automotor;
    private String servicios;
    private LocalTime hora_entrada;
    private LocalTime hora_salida;
    private double valor_a_pagar;

    public AutoMotor(int id, int cedula, String placa, String tipo_automotor, String servicios, LocalTime hora_entrada, LocalTime hora_salida, double valor_a_pagar) {
        this.id = id;
        this.cedula = cedula;
        this.placa = placa;
        this.tipo_automotor = tipo_automotor;
        this.servicios = servicios;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.valor_a_pagar = valor_a_pagar;
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
        return tipo_automotor;
    }

    public String getServicios() {
        return servicios;
    }

    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    public LocalTime getHora_salida() {
        return hora_salida;
    }

    public double getValor_a_pagar() {
        return valor_a_pagar;
    }

    public void setValor_a_pagar(double valor_a_pagar) {
        this.valor_a_pagar = valor_a_pagar;
    }
}
