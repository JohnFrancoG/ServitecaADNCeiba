package com.ceiba.tiendatecnologica.dominio.servicio.serviciosXAutoMotor;

import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import com.ceiba.tiendatecnologica.dominio.ServiciosXAutoMotor;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioServiciosXAutoMotor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;


@Service
public class ServicioObtenerHoraSalida {

    public static final String SEPARADOR_ENTRE_CADA_SERVICIO = ",";
    private final RepositorioServiciosXAutoMotor repositorioServiciosXAutoMotor;

    public ServicioObtenerHoraSalida(RepositorioServiciosXAutoMotor repositorioServiciosXAutoMotor) {
        this.repositorioServiciosXAutoMotor = repositorioServiciosXAutoMotor;
    }

    public AutoMotor ejecutar(String tipoAutoMotor, String servicios, String horaEntrada) {
        List<ServiciosXAutoMotor> serviciosXAutoMotor = consultarServiciosXAutoMotor(tipoAutoMotor, servicios);

        Long[] tiempoPromedioPorLosServicios = obtenerTiempoPromedioPorLosServicios(serviciosXAutoMotor);

        LocalTime horaSalida = LocalTime.parse(horaEntrada);

        horaSalida = horaSalida.plusHours(tiempoPromedioPorLosServicios[0].intValue());
        horaSalida = horaSalida.plusMinutes(tiempoPromedioPorLosServicios[1].intValue());
        horaSalida = horaSalida.plusSeconds(tiempoPromedioPorLosServicios[2].intValue());

        return new AutoMotor(
                0,
                0,
                null,
                null,
                null,
                null,
                horaSalida,
                0
        );
    }

    public List<ServiciosXAutoMotor> consultarServiciosXAutoMotor(String tipoAutoMotor, String servicios){
        List<String> listServicios = Arrays.asList(servicios.split(SEPARADOR_ENTRE_CADA_SERVICIO));
        return this.repositorioServiciosXAutoMotor.obtenerHoraSalida(tipoAutoMotor, listServicios);
    }

    public Long[] obtenerTiempoPromedioPorLosServicios(List<ServiciosXAutoMotor> serviciosXAutoMotor) {
        return new Long[] {
                serviciosXAutoMotor.stream().mapToLong( horas -> horas.getTiempo_promedio_servicio().getHour()).sum(),
                serviciosXAutoMotor.stream().mapToLong( minutos -> minutos.getTiempo_promedio_servicio().getMinute()).sum(),
                serviciosXAutoMotor.stream().mapToLong( segundos -> segundos.getTiempo_promedio_servicio().getSecond()).sum()
        };
    }

}
