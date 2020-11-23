package com.ceiba.usuario.controlador;

import com.ceiba.usuario.comando.manejador.ManejadorRegistrarAutoMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComandoControladorServiteca {

    private final ManejadorRegistrarAutoMotor manejadorRegistrarAutoMotor;

    @Autowired
    public ComandoControladorServiteca(ManejadorRegistrarAutoMotor ManejadorRegistrarAutoMotor) {
        this.manejadorRegistrarAutoMotor = ManejadorRegistrarAutoMotor;
    }

    /*@PostMapping
    @ApiOperation("Registrar Automotor")
    public ComandoRespuesta<Long> registrar(@RequestBody ComandoUsuario comandoUsuario) {
        return manejadorRegistrarAutoMotor.ejecutar(comandoUsuario);
    }*/
}
