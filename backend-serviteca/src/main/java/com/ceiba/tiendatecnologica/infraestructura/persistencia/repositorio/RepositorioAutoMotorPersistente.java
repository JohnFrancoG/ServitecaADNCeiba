package com.ceiba.tiendatecnologica.infraestructura.persistencia.repositorio;

import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import com.ceiba.tiendatecnologica.dominio.ServiciosXAutoMotor;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioAutoMotor;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.builder.AutoMotorBuilder;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.builder.ServiciosXAutoMotorBuilder;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad.AutoMotorEntity;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad.ServiciosXAutoMotorEntity;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.repositorio.jpa.RepositorioAutoMotorJPA;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class RepositorioAutoMotorPersistente implements RepositorioAutoMotor {

    private final EntityManager entityManager;
    private final RepositorioAutoMotorJPA repositorioAutoMotorJPA;

    public RepositorioAutoMotorPersistente(EntityManager entityManager, RepositorioAutoMotorJPA repositorioAutoMotorJPA) {
        this.entityManager = entityManager;
        this.repositorioAutoMotorJPA = repositorioAutoMotorJPA;
    }

    @Override
    public AutoMotor registrarAutoMotor(AutoMotor autoMotor) {
        AutoMotorEntity autoMotorEntity = repositorioAutoMotorJPA.save(AutoMotorBuilder.convertirAEntity(autoMotor));
        return AutoMotorBuilder.convertirADominio(autoMotorEntity);
    }

    @Override
    public Long consultarVecesAtendido(int cedula) {
        Query query = entityManager.createNamedQuery("Automotor.vecesAtentido");
        query.setParameter("cedula", cedula);
        Long vecesAtendido = (Long) query.getSingleResult();
        return vecesAtendido;
    }
}
