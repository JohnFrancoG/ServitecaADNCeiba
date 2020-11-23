package com.ceiba.usuario.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoAutoMotor {

    private String nombreAutoMotor;
    private List<String> serviciosTomados;
    private int cantidadServicios;
    private int vecesAtendido;
    double[] precios;
}
