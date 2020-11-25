package com.ceiba.autoMotor.adaptador.dao;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.autoMotor.modelo.dto.DtoAutoMotor;
import com.ceiba.autoMotor.puerto.dao.DaoAutoMotor;

import java.util.List;

public class DaoAutoMotorMysql implements DaoAutoMotor {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="autoMotor", value="listar")
    private static String sqlListar;

    public DaoAutoMotorMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoAutoMotor> listarAutoMotor() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoAutoMotor());
    }
}
