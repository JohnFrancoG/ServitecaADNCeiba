package com.ceiba.tiendatecnologica.aplicacion.manejadores.serviciosXAutoMotor;

import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import com.ceiba.tiendatecnologica.dominio.servicio.serviciosXAutoMotor.ServicioObtenerHoraSalida;
import org.springframework.stereotype.Component;

import java.text.ParseException;

@Component
public class ManejadorObtenerServiciosXAutoMotor {

    private final ServicioObtenerHoraSalida servicioObtenerHoraSalida;

    public ManejadorObtenerServiciosXAutoMotor(ServicioObtenerHoraSalida servicioObtenerHoraSalida) {
        this.servicioObtenerHoraSalida = servicioObtenerHoraSalida;
    }

    public AutoMotor ejecutar(String tipoAutoMotor, String servicios, String horaEntrada) {
        return this.servicioObtenerHoraSalida.ejecutar(tipoAutoMotor, servicios, horaEntrada);
    }
}
