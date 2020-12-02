package com.ceiba.tiendatecnologica.dominio.repositorio;

import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutoMotor {

    AutoMotor registrarAutoMotor(AutoMotor autoMotor);

    Long consultarVecesAtendido(int cedula);

}
