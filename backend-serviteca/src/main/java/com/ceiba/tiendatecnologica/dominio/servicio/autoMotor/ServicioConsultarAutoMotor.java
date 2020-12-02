package com.ceiba.tiendatecnologica.dominio.servicio.autoMotor;

import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioAutoMotor;
import org.springframework.stereotype.Service;

@Service
public class ServicioConsultarAutoMotor {

    private final RepositorioAutoMotor repositorioAutoMotor;

    public ServicioConsultarAutoMotor(RepositorioAutoMotor repositorioAutoMotor) {
        this.repositorioAutoMotor = repositorioAutoMotor;
    }

    public Long ejecutar(int cedula) {
        return this.repositorioAutoMotor.consultarVecesAtendido(cedula);
    }
}
