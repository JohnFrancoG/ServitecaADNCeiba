package com.ceiba.usuario.consulta;

import com.ceiba.usuario.modelo.dto.DtoAutoMotor;
import com.ceiba.usuario.puerto.dao.DaoAutoMotor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorConsultarAutoMotor {

    private final DaoAutoMotor daoAutoMotor;

    public ManejadorConsultarAutoMotor(DaoAutoMotor daoAutoMotor) {
        this.daoAutoMotor = daoAutoMotor;
    }

    public List<DtoAutoMotor> consultarAutoMor() {
        return this.daoAutoMotor.listarAutoMotor();
    }
}
