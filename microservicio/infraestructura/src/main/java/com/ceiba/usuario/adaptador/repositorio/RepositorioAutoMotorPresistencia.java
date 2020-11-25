package com.ceiba.usuario.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.adaptador.dao.MapeoAutoMotor;
import com.ceiba.usuario.modelo.dto.DtoAutoMotor;
import com.ceiba.usuario.modelo.entidad.AutoMotor;
import com.ceiba.usuario.puerto.repositorio.RepositorioAutoMotor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.util.List;

public class RepositorioAutoMotorPresistencia implements RepositorioAutoMotor {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="autoMotor", value="crear")
    private static String sqlCrear;

    @SqlStatement(namespace="autoMotor", value="consultarAutoMotor")
    private static String consultarAutoMotor;

    public RepositorioAutoMotorPresistencia(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(AutoMotor autoMotor) {
        return this.customNamedParameterJdbcTemplate.crear(autoMotor, sqlCrear);
    }

    @Override
    public List<DtoAutoMotor> consultarAutoMotor(Long cedulaConductor) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("cedulaConductor", cedulaConductor);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(consultarAutoMotor, new MapeoAutoMotor());
    }
}