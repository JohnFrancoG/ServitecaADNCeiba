package com.ceiba.usuario.controlador;

import com.ceiba.usuario.comando.ComandoAutoMotor;
import com.ceiba.usuario.comando.manejador.ManejadorRegistrarAutoMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/serviteca")
public class ComandoControladorServiteca {

    private final ManejadorRegistrarAutoMotor manejadorRegistrarAutoMotor;

    @Autowired
    public ComandoControladorServiteca(ManejadorRegistrarAutoMotor ManejadorRegistrarAutoMotor) {
        this.manejadorRegistrarAutoMotor = ManejadorRegistrarAutoMotor;
    }

    @PostMapping
    public List<String> registrar(@RequestBody ComandoAutoMotor comandoAutoMotor) {
        return this.manejadorRegistrarAutoMotor.ejecutar(comandoAutoMotor);
    }
}
