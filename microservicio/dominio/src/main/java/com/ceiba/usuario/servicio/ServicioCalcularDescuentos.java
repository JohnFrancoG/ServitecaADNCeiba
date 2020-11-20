package com.ceiba.usuario.servicio;

import java.util.Calendar;

public class ServicioCalcularDescuentos {
    static int serviciosTomados;
    static int vecesAtentido;
    static double[] preciosPorServicios;

    public  ServicioCalcularDescuentos(int serviciosTomados, int vecesAtentido, double[] preciosPorServicios) {
        this.serviciosTomados = serviciosTomados;
        this.vecesAtentido = vecesAtentido;
        this.preciosPorServicios = preciosPorServicios;
    }

    public double CalcularDescuentos() {
        try {
            double precioFinal = 0.0;
            double ServicioMasBarato = 0.0;

            for(double precioServicio : this.preciosPorServicios) {
                precioFinal += precioServicio;
                if(ServicioMasBarato > 0.00) {
                    if(precioServicio < ServicioMasBarato) {
                        ServicioMasBarato = precioServicio;
                    }
                } else {
                    ServicioMasBarato = precioServicio;
                }
            }

            //Si el número de atención del cliente es múltiplo de 50, no se le cobra el valor del servicio de menor costo.
            if(this.vecesAtentido % 50 == 0) {
                precioFinal += (ServicioMasBarato * -1);
            }

            //Un automotor que solicita más de tres (3) servicios tendrá un descuento del 15% sobre el total de la liquidación.
            if(this.serviciosTomados > 3) {
                precioFinal = precioFinal - (precioFinal * 0.15);
            }

            //Si el día en que se presta el servicio fue un Miércoles el sistema deberá generar un descuento del 5% al total de la tarifa.
            if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
                precioFinal = precioFinal - (precioFinal * 0.05);
            }

            return precioFinal;
        } catch (Exception e) {
            return 0.0;
        }
    }
}
