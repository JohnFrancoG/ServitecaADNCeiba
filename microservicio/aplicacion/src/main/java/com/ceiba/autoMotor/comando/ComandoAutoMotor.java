package com.ceiba.autoMotor.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoAutoMotor {

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
