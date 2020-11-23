package com.ceiba.usuario.consulta;

import com.ceiba.usuario.servicio.ServicioCalcularDescuentos;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCalcularDescuentos {

    public double ejecutar(int vecesAtentido, int serviciosTomados, double[] preciosPorServicios) {
        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(vecesAtentido, serviciosTomados, preciosPorServicios);
        return servicioCalcularDescuentos.calcularDescuentos();
    }
}
