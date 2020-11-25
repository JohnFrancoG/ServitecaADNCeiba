package com.ceiba.autoMotor.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.autoMotor.modelo.dto.DtoAutoMotor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class MapeoAutoMotor implements RowMapper<DtoAutoMotor>, MapperResult {

    @Override
    public DtoAutoMotor mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Long cedulaConductor = resultSet.getLong("cedulaConductor");
        String placaAutoMotor = resultSet.getString("placaAutoMotor");
        String tipoAutoMotor = resultSet.getString("tipoAutoMotor");
        Time horaDeIngreso = resultSet.getTime("horaDeIngreso");
        Time horaDeSalida = resultSet.getTime("horaDeSalida");
        double valorPorPagar = resultSet.getDouble("valorPorPagar");
        int vecesAtendido = resultSet.getInt("vecesAtendido");

        return new DtoAutoMotor(
                cedulaConductor,
                placaAutoMotor,
                tipoAutoMotor,
                null,
                horaDeIngreso,
                horaDeSalida,
                valorPorPagar,
                vecesAtendido ,
                null
        );
    }
}
