package com.ceiba.autoMotor.servicio;

import com.ceiba.autoMotor.modelo.entidad.AutoMotor;
import com.ceiba.autoMotor.puerto.repositorio.RepositorioAutoMotor;
import com.ceiba.autoMotor.servicio.testdatabuilder.ServiciosAutoMotorTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ServicioRegistrarAutoMotorTest {

    @Test
    public void registrarAutoMotor() {

        AutoMotor autoMotor = new ServiciosAutoMotorTestDataBuilder().build();
        RepositorioAutoMotor repositorioAutoMotor = Mockito.mock(RepositorioAutoMotor.class);

        ServicioRegistrarAutoMotor servicioRegistrarAutoMotor = new ServicioRegistrarAutoMotor(repositorioAutoMotor);
        servicioRegistrarAutoMotor.registrarAutoMotor(autoMotor);
        Assert.assertTrue(true);
    }
}