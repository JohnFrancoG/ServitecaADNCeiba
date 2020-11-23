package com.ceiba.usuario.servicio;

import java.util.Arrays;
import java.util.Calendar;

public class ServicioCalcularDescuentos {

    public static final double DESCUENTO_PORCENTUAL_MAYOR = 0.15;
    public static final int DIVISOR_MULTIPLO = 50;
    public static final int SERVICIOS_MINIMOS_PARA_DESCUENTO_PORCENTUAL = 3;
    public static final int RESIDUO = 0;
    public static final double DESCUENTO_PORCENTUAL_MENOR = 0.05;
    static int vecesAtentido;
    static int serviciosTomados;
    static double[] preciosPorServicios;

    public  ServicioCalcularDescuentos(int vecesAtentido, int serviciosTomados, double[] preciosPorServicios) {
        this.vecesAtentido = vecesAtentido;
        this.serviciosTomados = serviciosTomados;
        this.preciosPorServicios = preciosPorServicios;
    }

    public Double calcularDescuentos() {
        try {
            double precioFinal = Arrays.stream(this.preciosPorServicios).sum();
            double servicioMasBarato = Arrays.stream(this.preciosPorServicios).min().getAsDouble();

            precioFinal = this.vecesAtentido % DIVISOR_MULTIPLO == RESIDUO ? precioFinal - servicioMasBarato: precioFinal;

            precioFinal = this.serviciosTomados > SERVICIOS_MINIMOS_PARA_DESCUENTO_PORCENTUAL ? precioFinal - (precioFinal * DESCUENTO_PORCENTUAL_MAYOR) : precioFinal;

            precioFinal = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY ? precioFinal - (precioFinal * DESCUENTO_PORCENTUAL_MENOR) : precioFinal;

            return precioFinal;
        } catch (Exception e) {
            return 0.0;
        }
    }
}
