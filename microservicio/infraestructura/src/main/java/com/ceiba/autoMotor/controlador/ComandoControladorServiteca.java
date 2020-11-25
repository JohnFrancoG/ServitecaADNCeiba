package com.ceiba.autoMotor.controlador;

import com.ceiba.autoMotor.comando.manejador.ManejadorRegistrarAutoMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviteca")
public class ComandoControladorServiteca {

    private final ManejadorRegistrarAutoMotor manejadorRegistrarAutoMotor;

    @Autowired
    public ComandoControladorServiteca(ManejadorRegistrarAutoMotor ManejadorRegistrarAutoMotor) {
        this.manejadorRegistrarAutoMotor = ManejadorRegistrarAutoMotor;
    }

    /*@PostMapping
    public List<String> registrar(@RequestBody ComandoAutoMotor comandoAutoMotor) {
        return this.manejadorRegistrarAutoMotor.ejecutar(comandoAutoMotor);
    }*/
}
