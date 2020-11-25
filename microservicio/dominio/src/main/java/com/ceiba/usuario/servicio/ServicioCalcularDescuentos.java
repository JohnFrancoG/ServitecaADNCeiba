package com.ceiba.usuario.servicio;

import java.util.Arrays;

public class ServicioCalcularDescuentos {

    public static final double DESCUENTO_PORCENTUAL_MAYOR = 0.15;
    public static final int DIVISOR_MULTIPLO = 50;
    public static final int SERVICIOS_MINIMOS_PARA_DESCUENTO_PORCENTUAL = 3;
    public static final int RESIDUO = 0;
    public static final double DESCUENTO_PORCENTUAL_MENOR = 0.05;

    public Double calcularDescuentos(int vecesAtentido, int serviciosTomados, double[] preciosPorServicios) {
        double precioFinal = Arrays.stream(preciosPorServicios).sum();
        double servicioMasBarato = Arrays.stream(preciosPorServicios).min().getAsDouble();

        precioFinal = vecesAtentido % DIVISOR_MULTIPLO == RESIDUO ? precioFinal - servicioMasBarato: precioFinal;

        precioFinal = serviciosTomados > SERVICIOS_MINIMOS_PARA_DESCUENTO_PORCENTUAL ? precioFinal - (precioFinal * DESCUENTO_PORCENTUAL_MAYOR) : precioFinal;

        //precioFinal = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY ? precioFinal - (precioFinal * DESCUENTO_PORCENTUAL_MENOR) : precioFinal;

        return precioFinal;
    }
}