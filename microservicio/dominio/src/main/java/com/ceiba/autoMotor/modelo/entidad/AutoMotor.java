package com.ceiba.autoMotor.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Setter
public class AutoMotor {

    public static final String MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_CEDULA = "Se debe ingresar la cedula del conductor";
    public static final String MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_PLACA = "Se debe ingresar la placa de AutoMotor";
    public static final String MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_TIPO_DE_AUTOMOTOR = "Se debe ingresar el tipo de AutoMotor";
    public static final String MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_SERVICIOS_TOMADOS = "Se debe ingresar los servicios tomados para el AutoMotor";
    public static final String MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_HORA_DE_INGRESO = "Se debe ingresar la hora de Ingreso del AutoMotor";
    public static final String MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_PRECIOS = "Se debe ingresar los precios de cada servicio tomados";
    private Long cedulaConductor;
    private String placaAutoMotor;
    private String tipoAutoMotor;
    private List<String> serviciosTomados;
    private Time horaDeIngreso;
    private Time horaDeSalida;
    private double valorPorPagar;
    private int vecesAtendido;
    double[] precios;

    public AutoMotor(
            Long cedulaConductor,
            String placaAutoMotor,
            String tipoAutoMotor,
            List<String> serviciosTomados,
            Time horaDeIngreso,
            Time horaDeSalida,
            double valorPorPagar,
            int vecesAtendido,
            double[] precios
    ) {
        validarObligatorio(cedulaConductor, MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_CEDULA);
        validarObligatorio(placaAutoMotor, MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_PLACA);
        validarObligatorio(tipoAutoMotor, MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_TIPO_DE_AUTOMOTOR);
        validarObligatorio(serviciosTomados, MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_SERVICIOS_TOMADOS);
        validarObligatorio(horaDeIngreso, MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_HORA_DE_INGRESO);
        validarObligatorio(precios, MENSAJE_DE_ERROR_POR_OBLIGATORIEDAD_DE_PRECIOS);

        this.cedulaConductor = cedulaConductor;
        this.placaAutoMotor = placaAutoMotor;
        this.tipoAutoMotor = tipoAutoMotor;
        this.serviciosTomados = serviciosTomados;
        this.horaDeIngreso = horaDeIngreso;
        this.horaDeSalida = horaDeSalida;
        this.valorPorPagar = valorPorPagar;
        this.vecesAtendido = vecesAtendido;
        this.precios = precios;
    }
}