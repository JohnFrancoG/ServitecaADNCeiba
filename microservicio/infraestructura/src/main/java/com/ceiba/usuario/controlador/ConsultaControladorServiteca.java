package com.ceiba.usuario.controlador;

import com.ceiba.usuario.consulta.ManejadorConsultarAutoMotor;
import com.ceiba.usuario.modelo.dto.DtoAutoMotor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/serviteca")
public class ConsultaControladorServiteca {

    private final ManejadorConsultarAutoMotor manejadorConsultarAutoMotor;

    public ConsultaControladorServiteca(ManejadorConsultarAutoMotor manejadorConsultarAutoMotor) {
        this.manejadorConsultarAutoMotor = manejadorConsultarAutoMotor;
    }

    @GetMapping
    public List<DtoAutoMotor> consultarAutoMotor() {
        return this.manejadorConsultarAutoMotor.consultarAutoMor();
    }
}
