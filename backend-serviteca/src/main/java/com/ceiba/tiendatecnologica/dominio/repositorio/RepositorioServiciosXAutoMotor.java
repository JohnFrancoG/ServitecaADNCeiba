package com.ceiba.tiendatecnologica.dominio.repositorio;

import com.ceiba.tiendatecnologica.dominio.ServiciosXAutoMotor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioServiciosXAutoMotor {

    List<ServiciosXAutoMotor> obtenerHoraSalida(String tipoAutoMotor, List<String> servicios);

    List<Double> obtenerPrecios(String tipoAutoMotor, List<String> servicios);
}
