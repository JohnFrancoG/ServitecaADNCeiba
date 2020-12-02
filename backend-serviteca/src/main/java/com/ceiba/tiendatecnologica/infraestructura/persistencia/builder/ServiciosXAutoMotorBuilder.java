package com.ceiba.tiendatecnologica.infraestructura.persistencia.builder;

import com.ceiba.tiendatecnologica.dominio.ServiciosXAutoMotor;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad.ServiciosXAutoMotorEntity;

public class ServiciosXAutoMotorBuilder {

    private ServiciosXAutoMotorBuilder() {}

    public static ServiciosXAutoMotor convertirADominio(ServiciosXAutoMotorEntity serviciosXAutoMotorEntity) {

        ServiciosXAutoMotor serviciosXAutoMotor = null;

        if(serviciosXAutoMotorEntity != null) {
            serviciosXAutoMotor = new ServiciosXAutoMotor(
                    serviciosXAutoMotorEntity.getId(),
                    serviciosXAutoMotorEntity.getNombre_servicio(),
                    serviciosXAutoMotorEntity.getTipo_automotor(),
                    serviciosXAutoMotorEntity.getPrecio(),
                    serviciosXAutoMotorEntity.getTiempo_promedio_servicio()
            );
        }

        return serviciosXAutoMotor;
    }

}
