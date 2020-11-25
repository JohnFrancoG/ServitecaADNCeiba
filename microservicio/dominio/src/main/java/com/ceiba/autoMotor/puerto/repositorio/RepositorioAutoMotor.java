package com.ceiba.autoMotor.puerto.repositorio;

import com.ceiba.autoMotor.modelo.dto.DtoAutoMotor;
import com.ceiba.autoMotor.modelo.entidad.AutoMotor;

import java.util.List;

public interface RepositorioAutoMotor {

    Long crear(AutoMotor autoMotor);

    List<DtoAutoMotor> consultarAutoMotor(Long cedulaConductor);
}
