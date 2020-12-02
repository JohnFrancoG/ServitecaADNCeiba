package com.ceiba.tiendatecnologica.aplicacion.manejadores.autoMotor;

import com.ceiba.tiendatecnologica.aplicacion.comando.ComandoAutoMotor;
import com.ceiba.tiendatecnologica.aplicacion.fabrica.FabricaAutoMotor;
import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import com.ceiba.tiendatecnologica.dominio.servicio.autoMotor.ServicioRegistrarAutoMotor;
import org.springframework.stereotype.Component;

@Component
public class ManejadorRegistrarAutoMotor {

    private final ServicioRegistrarAutoMotor servicioRegistrarAutoMotor;
    private final FabricaAutoMotor fabricaAutoMotor;

    public ManejadorRegistrarAutoMotor(ServicioRegistrarAutoMotor servicioRegistrarAutoMotor, FabricaAutoMotor fabricaAutoMotor) {
        this.servicioRegistrarAutoMotor = servicioRegistrarAutoMotor;
        this.fabricaAutoMotor = fabricaAutoMotor;
    }

    public AutoMotor  ejecutar(ComandoAutoMotor comandoAutoMotor) {
        AutoMotor autoMotor = this.fabricaAutoMotor.crearAutoMotor(comandoAutoMotor);
        return this.servicioRegistrarAutoMotor.ejecutar(autoMotor);
    }
}
