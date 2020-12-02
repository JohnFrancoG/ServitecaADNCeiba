package com.ceiba.tiendatecnologica.infraestructura.persistencia.builder;

import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad.AutoMotorEntity;

public class AutoMotorBuilder {

    public static AutoMotor convertirADominio(AutoMotorEntity autoMotorEntity) {
        AutoMotor autoMotor = null;
        if (autoMotorEntity != null) {
            autoMotor = new AutoMotor(
                    autoMotorEntity.getId(),
                    autoMotorEntity.getCedula(),
                    autoMotorEntity.getPlaca(),
                    autoMotorEntity.getTipo_automotor(),
                    autoMotorEntity.getServicios(),
                    autoMotorEntity.getHora_entrada(),
                    autoMotorEntity.getHora_salida(),
                    autoMotorEntity.getValor_a_pagar()
            );
        }
        return autoMotor;
    }

    public static AutoMotorEntity convertirAEntity(AutoMotor autoMotor) {
        AutoMotorEntity autoMotorEntity = new AutoMotorEntity();
        autoMotorEntity.setId(autoMotor.getId());
        autoMotorEntity.setCedula(autoMotor.getCedula());
        autoMotorEntity.setPlaca(autoMotor.getPlaca());
        autoMotorEntity.setTipo_automotor(autoMotor.getTipoAutoMotor());
        autoMotorEntity.setServicios(autoMotor.getServicios());
        autoMotorEntity.setHora_entrada(autoMotor.getHora_entrada());
        autoMotorEntity.setHora_salida(autoMotor.getHora_salida());
        autoMotorEntity.setValor_a_pagar(autoMotor.getValor_a_pagar());
        return autoMotorEntity;
    }

}
