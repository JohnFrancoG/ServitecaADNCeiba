package com.ceiba.usuario.comando.manejador;

import com.ceiba.usuario.comando.ComandoAutoMotor;
import com.ceiba.usuario.comando.fabrica.FabricaAutoMotor;
import com.ceiba.usuario.modelo.entidad.AutoMotor;
import com.ceiba.usuario.servicio.ServicioRegistrarAutoMotor;
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