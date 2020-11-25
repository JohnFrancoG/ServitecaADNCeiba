package com.ceiba.configuracion;

import com.ceiba.autoMotor.puerto.repositorio.RepositorioAutoMotor;
import com.ceiba.autoMotor.servicio.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioRegistrarAutoMotor servicioRegistrarAutoMotor(RepositorioAutoMotor repositorioAutoMotor) {
        return new ServicioRegistrarAutoMotor(repositorioAutoMotor);
    }

    @Bean
    public ServicioCalcularDescuentos servicioCalcularDescuentos() {
        return new ServicioCalcularDescuentos();
    }

}
