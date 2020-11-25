package com.ceiba.autoMotor.servicio;

import com.ceiba.autoMotor.modelo.dto.DtoAutoMotor;
import com.ceiba.autoMotor.modelo.entidad.AutoMotor;
import com.ceiba.autoMotor.puerto.repositorio.RepositorioAutoMotor;

import java.util.ArrayList;
import java.util.List;

public class ServicioRegistrarAutoMotor {

    private final RepositorioAutoMotor repositorioAutoMotor;
    private final ServicioCalcularDescuentos servicioCalcularDescuentos;

    public ServicioRegistrarAutoMotor(RepositorioAutoMotor repositorioAutoMotor) {
        this.repositorioAutoMotor = repositorioAutoMotor;
        servicioCalcularDescuentos = new ServicioCalcularDescuentos();
    }

    public List<String> registrarAutoMotor(AutoMotor autoMotor) {
        autoMotor.setVecesAtendido(consultarVecesAtentido(autoMotor));
        autoMotor.setValorPorPagar(servicioCalcularDescuentos.calcularDescuentos(
                autoMotor.getVecesAtendido(),
                autoMotor.getServiciosTomados().toArray().length,
                autoMotor.getPrecios()
        ));
        List<String> respuestaServicio = new ArrayList<>();
        respuestaServicio.add(String.valueOf(this.repositorioAutoMotor.crear(autoMotor)));
        respuestaServicio.add("El registro fue exitoso");
        return respuestaServicio;
    }

    public int consultarVecesAtentido(AutoMotor autoMotor) {
        List<DtoAutoMotor> listAutoMotor = this.repositorioAutoMotor.consultarAutoMotor(autoMotor.getCedulaConductor());
        return listAutoMotor.size() > 0 ? listAutoMotor.get(0).getVecesAtendido() : 0;
    }

}
