package com.ceiba.tiendatecnologica.dominio.servicio.autoMotor;

import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioAutoMotor;
import com.ceiba.tiendatecnologica.dominio.repositorio.RepositorioServiciosXAutoMotor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ServicioRegistrarAutoMotor {

    public static final String SEPARADOR_ENTRE_CADA_SERVICIO = ",";
    private final RepositorioAutoMotor repositorioAutoMotor;
    private final RepositorioServiciosXAutoMotor repositorioServiciosXAutoMotor;
    private final ServicioConsultarAutoMotor servicioConsultarAutoMotor;
    private final  ServicioCalcularDescuentos servicioCalcularDescuentos;

    public ServicioRegistrarAutoMotor(RepositorioAutoMotor repositorioAutoMotor, RepositorioServiciosXAutoMotor repositorioServiciosXAutoMotor, ServicioConsultarAutoMotor servicioConsultarAutoMotor, ServicioCalcularDescuentos servicioCalcularDescuentos) {
        this.repositorioAutoMotor = repositorioAutoMotor;
        this.repositorioServiciosXAutoMotor = repositorioServiciosXAutoMotor;
        this.servicioConsultarAutoMotor = servicioConsultarAutoMotor;
        this.servicioCalcularDescuentos = servicioCalcularDescuentos;
    }


    public AutoMotor ejecutar(AutoMotor autoMotor) {
        Long vecesAtendido = this.servicioConsultarAutoMotor.ejecutar(autoMotor.getCedula());

        List<Double> precios = obtenerPrecios(autoMotor.getTipoAutoMotor(), autoMotor.getServicios());

        guardarValorAPagar(autoMotor, vecesAtendido, precios);

        return this.repositorioAutoMotor.registrarAutoMotor(autoMotor);
    }

    public List<Double> obtenerPrecios (String tipoAutoMotor, String servicios) {
        List<String> listServicios = Arrays.asList(servicios.split(SEPARADOR_ENTRE_CADA_SERVICIO));

        return this.repositorioServiciosXAutoMotor.obtenerPrecios(
                tipoAutoMotor,
                listServicios
        );
    }

    public void guardarValorAPagar(AutoMotor autoMotor, Long vecesAtendido, List<Double> precios) {
        autoMotor.setValor_a_pagar(
                this.servicioCalcularDescuentos.calcularDescuentos(
                        vecesAtendido,
                        autoMotor.getServicios().split(",").length,
                        precios
                )
        );
    }
}
