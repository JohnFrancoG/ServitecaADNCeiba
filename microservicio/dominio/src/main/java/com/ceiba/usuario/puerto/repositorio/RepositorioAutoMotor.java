package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.dto.DtoAutoMotor;
import com.ceiba.usuario.modelo.entidad.AutoMotor;

import java.util.List;

public interface RepositorioAutoMotor {

    Long crear(AutoMotor autoMotor);

    List<DtoAutoMotor> consultarAutoMotor(Long cedulaConductor);
}
