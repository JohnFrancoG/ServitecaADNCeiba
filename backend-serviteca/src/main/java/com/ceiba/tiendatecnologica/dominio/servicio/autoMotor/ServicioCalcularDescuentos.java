package com.ceiba.tiendatecnologica.dominio.servicio.autoMotor;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class ServicioCalcularDescuentos {

    public static final double DESCUENTO_PORCENTUAL_POR_CANTIDAD_DE_SERVICIOS = 0.15;
    public static final double DESCUENTO_PORCENTUAL_POR_SER_MIERCOLES = 0.05;

    public static final int SERVICIOS_MINIMOS_PARA_OBTENER_DESCUENTO = 3;
    public static final int DIVISOR_MULTIPLO = 50;
    public static final int RESIDUO = 0;

    public Double calcularDescuentos(Long vecesAtentido, int serviciosTomados, List<Double> preciosPorServicios) {
        double precioFinal = preciosPorServicios.stream().mapToDouble(precio -> precio).sum();

        double servicioMasBarato = preciosPorServicios.stream().min(Double::compare).get();

        precioFinal = vecesAtentido % DIVISOR_MULTIPLO == RESIDUO ? precioFinal - servicioMasBarato: precioFinal;

        precioFinal = serviciosTomados > SERVICIOS_MINIMOS_PARA_OBTENER_DESCUENTO ? precioFinal - (precioFinal * DESCUENTO_PORCENTUAL_POR_CANTIDAD_DE_SERVICIOS) : precioFinal;

        //precioFinal = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY ? precioFinal - (precioFinal * DESCUENTO_PORCENTUAL_POR_SER_MIERCOLES) : precioFinal;

        return precioFinal;
    }
}
