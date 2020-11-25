package com.ceiba.autoMotor.comando.manejador;

import com.ceiba.autoMotor.comando.ComandoAutoMotor;
import com.ceiba.autoMotor.comando.fabrica.FabricaAutoMotor;
import com.ceiba.autoMotor.modelo.entidad.AutoMotor;
import com.ceiba.autoMotor.servicio.ServicioRegistrarAutoMotor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ManejadorRegistrarAutoMotor {

    private final FabricaAutoMotor fabricaAutoMotor;
    private final ServicioRegistrarAutoMotor servicioRegistrarAutoMotor;

    public ManejadorRegistrarAutoMotor(FabricaAutoMotor fabricaAutoMotor, ServicioRegistrarAutoMotor servicioRegistrarAutoMotor) {
        this.fabricaAutoMotor = fabricaAutoMotor;
        this.servicioRegistrarAutoMotor = servicioRegistrarAutoMotor;
    }

    @Transactional
    public List<String> ejecutar(ComandoAutoMotor comandoAutoMotor) {
        AutoMotor autoMotor = this.fabricaAutoMotor.crear(comandoAutoMotor);
        return this.servicioRegistrarAutoMotor.registrarAutoMotor(autoMotor);
    }

}