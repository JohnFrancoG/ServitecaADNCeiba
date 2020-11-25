package com.ceiba.autoMotor.consulta;

import com.ceiba.autoMotor.comando.fabrica.FabricaAutoMotor;
import com.ceiba.autoMotor.servicio.ServicioCalcularDescuentos;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCalcularDescuentos {

    private final FabricaAutoMotor fabricaAutoMotor;
    private final ServicioCalcularDescuentos servicioCalcularDescuentos;

    public ManejadorCalcularDescuentos(FabricaAutoMotor fabricaAutoMotor, @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection") ServicioCalcularDescuentos servicioCalcularDescuentos) {
        this.fabricaAutoMotor = fabricaAutoMotor;
        this.servicioCalcularDescuentos = servicioCalcularDescuentos;
    }

    public double ejecutar(int vecesAtentido, int serviciosTomados, double[] preciosPorServicios) {
        return servicioCalcularDescuentos.calcularDescuentos(vecesAtentido, serviciosTomados, preciosPorServicios);
    }
}
