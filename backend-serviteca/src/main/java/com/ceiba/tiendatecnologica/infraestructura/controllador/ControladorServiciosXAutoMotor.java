package com.ceiba.tiendatecnologica.infraestructura.controllador;

import com.ceiba.tiendatecnologica.aplicacion.manejadores.serviciosXAutoMotor.ManejadorObtenerServiciosXAutoMotor;
import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ServiciosAutoMotor")
public class ControladorServiciosXAutoMotor {

    private final ManejadorObtenerServiciosXAutoMotor manejadorObtenerServiciosXAutoMotor;

    public ControladorServiciosXAutoMotor(ManejadorObtenerServiciosXAutoMotor manejadorObtenerServiciosXAutoMotor) {
        this.manejadorObtenerServiciosXAutoMotor = manejadorObtenerServiciosXAutoMotor;
    }

    @GetMapping("/{tipoAutoMotor}/{servicios}/{horaEntrada}")
    public AutoMotor buscar(
            @PathVariable(name = "tipoAutoMotor") String tipoAutoMotor,
            @PathVariable(name = "servicios") String servicios,
            @PathVariable(name = "horaEntrada") String horaEntrada
    ) {
        return this.manejadorObtenerServiciosXAutoMotor.ejecutar(tipoAutoMotor, servicios, horaEntrada);
    }
}
