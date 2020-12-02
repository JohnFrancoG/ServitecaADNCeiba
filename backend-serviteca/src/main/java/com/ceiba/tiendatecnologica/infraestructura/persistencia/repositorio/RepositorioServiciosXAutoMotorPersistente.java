package com.ceiba.tiendatecnologica.infraestructura.persistencia.repositorio;

import com.ceiba.tiendatecnologica.dominio.ServiciosXAutoMotor;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioServiciosXAutoMotor;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.builder.ServiciosXAutoMotorBuilder;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad.ServiciosXAutoMotorEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioServiciosXAutoMotorPersistente implements RepositorioServiciosXAutoMotor {

    public static final String SERVICIOS_X_AUTOMOTOR = "Servicios_x_automotor.obtenerServicios";
    public static final String COLUMNA_TIPO_AUTOMOTOR = "tipo_automotor";
    public static final String COLUMNA_NOMBRE_SERVICIO = "nombre_servicio";
    private final EntityManager entityManager;


    public RepositorioServiciosXAutoMotorPersistente(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<ServiciosXAutoMotor> obtenerHoraSalida(String tipoAutoMotor, List<String> servicios) {
        List<ServiciosXAutoMotor> serviciosXAutoMotor = new ArrayList<>();
        Query query = entityManager.createNamedQuery(SERVICIOS_X_AUTOMOTOR);
        query.setParameter(COLUMNA_TIPO_AUTOMOTOR, tipoAutoMotor);
        query.setParameter(COLUMNA_NOMBRE_SERVICIO, servicios);
        query.getResultList().forEach(
                serviciosXAutoMotorEntity -> serviciosXAutoMotor.add(
                        ServiciosXAutoMotorBuilder.convertirADominio(
                                (ServiciosXAutoMotorEntity) serviciosXAutoMotorEntity
                        )
                )
        );
        return serviciosXAutoMotor;
    }

    @Override
    public List<Double> obtenerPrecios(String tipoAutoMotor, List<String> servicios) {
        List<Double> precios = new ArrayList<>();
        Query query = entityManager.createNamedQuery(SERVICIOS_X_AUTOMOTOR);
        query.setParameter(COLUMNA_TIPO_AUTOMOTOR, tipoAutoMotor);
        query.setParameter(COLUMNA_NOMBRE_SERVICIO, servicios);
        query.getResultList().forEach(
                serviciosXAutoMotorEntity -> precios.add(
                        ServiciosXAutoMotorBuilder.convertirADominio(
                                (ServiciosXAutoMotorEntity) serviciosXAutoMotorEntity
                        ).getPrecio()
                )
        );
        return precios;
    }
}
