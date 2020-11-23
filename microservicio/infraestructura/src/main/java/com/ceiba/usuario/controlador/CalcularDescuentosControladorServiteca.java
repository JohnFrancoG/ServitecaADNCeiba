package com.ceiba.usuario.controlador;

import com.ceiba.usuario.consulta.ManejadorCalcularDescuentos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/descuentos")
@Api(tags={"Controlador calcular descuentos"})
public class CalcularDescuentosControladorServiteca {

    private final ManejadorCalcularDescuentos manejadorCalcularDescuentos;

    public CalcularDescuentosControladorServiteca(ManejadorCalcularDescuentos manejadorCalcularDescuentos) {
        this.manejadorCalcularDescuentos = manejadorCalcularDescuentos;
    }

    @GetMapping
    @ResponseBody
    public double calcularDescuentos(
            @RequestParam(name = "vecesAtentido") int vecesAtentido,
            @RequestParam(name = "serviciosTomados") int serviciosTomados,
            @RequestParam(name = "preciosPorServicios") double[] preciosPorServicios
    ) {
        return this.manejadorCalcularDescuentos.ejecutar(vecesAtentido, serviciosTomados, preciosPorServicios);
    }
}
