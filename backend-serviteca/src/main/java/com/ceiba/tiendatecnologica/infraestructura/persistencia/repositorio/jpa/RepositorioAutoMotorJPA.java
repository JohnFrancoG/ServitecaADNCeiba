package com.ceiba.tiendatecnologica.infraestructura.persistencia.repositorio.jpa;

import com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad.AutoMotorEntity;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioAutoMotorJPA extends CrudRepository<AutoMotorEntity, Long> {
}
