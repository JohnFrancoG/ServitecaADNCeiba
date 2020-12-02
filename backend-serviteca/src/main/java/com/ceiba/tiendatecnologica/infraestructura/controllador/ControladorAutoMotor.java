package com.ceiba.tiendatecnologica.infraestructura.controllador;

import com.ceiba.tiendatecnologica.aplicacion.comando.ComandoAutoMotor;
import com.ceiba.tiendatecnologica.aplicacion.manejadores.autoMotor.ManejadorRegistrarAutoMotor;
import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/AutoMotor")
public class ControladorAutoMotor {

    private final ManejadorRegistrarAutoMotor manejadorRegistrarAutoMotor;

    public ControladorAutoMotor(ManejadorRegistrarAutoMotor manejadorRegistrarAutoMotor) {
        this.manejadorRegistrarAutoMotor = manejadorRegistrarAutoMotor;
    }

    @PostMapping
    public AutoMotor crear(@RequestBody ComandoAutoMotor comandoAutoMotor) {
        return this.manejadorRegistrarAutoMotor.ejecutar(comandoAutoMotor);
    }
}
