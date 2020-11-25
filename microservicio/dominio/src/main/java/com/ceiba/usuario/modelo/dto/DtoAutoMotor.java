package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Time;
import java.util.List;

@Getter
@AllArgsConstructor
public class DtoAutoMotor {
    private Long cedulaConductor;
    private String placaAutoMotor;
    private String tipoAutoMotor;
    private List<String> serviciosTomados;
    private Time horaDeIngreso;
    private Time horaDeSalida;
    private double valorPorPagar;
    private int vecesAtendido;
    double[] precios;
}
