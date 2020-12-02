package com.ceiba.tiendatecnologica.dominio.servicio.autoMotor;

import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import com.ceiba.tiendatecnologica.testdatabuilder.AutoMotorTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ServicioCalcularDescuentosTest {

    public static final double PRECIO_ESPERADO_CON_DESCUENTO_SERVICIO_MAS_BARATO = 12000;
    public static final double DIFERENCIA_DE_DECIMALES = 0.000;
    public static final double PRECIO_ESPERADO_SIN_DESCUENTO_SERVICIO_MAS_BARATO = 20500;
    public static Long VECES_ATENDIDO = 10L;
    public static final double PRECIO_LAVADO = 8500;
    public static final double PRECIO_POLICHADO = 12000;
    public static final double PRECIO_CAMBIO_DE_ACEITE = 20000;
    public static final double PRECIO_BALANCEO = 18000;
    public static final double PRECIO_ESPERADO_CON_DESCUENTO_QUINCE_PORCIENTO = 49725;
    public static final double PRECIO_ESPERADO_SIN_DESCUENTO_QUINCE_PORCIENTO = 20500;
    public static List<Double> PRECIOS;

    @Test
    public void entregarDescuentoServicioMasBaratoTest() throws ParseException {
        // arrange
        AutoMotorTestDataBuilder autoMotorTestDataBuilder = new AutoMotorTestDataBuilder();
        AutoMotor autoMotor = autoMotorTestDataBuilder.build();

        VECES_ATENDIDO = 50L;

        PRECIOS = new ArrayList<>();
        PRECIOS.add(PRECIO_LAVADO);
        PRECIOS.add(PRECIO_POLICHADO);

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                VECES_ATENDIDO,
                autoMotor.getServicios().split(",").length,
                PRECIOS
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_CON_DESCUENTO_SERVICIO_MAS_BARATO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }

    @Test
    public void noEntregarDescuentoServicioMasBaratoTest() throws ParseException {
        // arrange
        AutoMotorTestDataBuilder autoMotorTestDataBuilder = new AutoMotorTestDataBuilder();
        AutoMotor autoMotor = autoMotorTestDataBuilder.build();

        VECES_ATENDIDO = 10L;

        PRECIOS = new ArrayList<>();
        PRECIOS.add(PRECIO_LAVADO);
        PRECIOS.add(PRECIO_POLICHADO);

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                VECES_ATENDIDO,
                autoMotor.getServicios().split(",").length,
                PRECIOS
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_SIN_DESCUENTO_SERVICIO_MAS_BARATO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }

    @Test
    public void entregarDescuentoQuincePorCientoTest() throws ParseException {
        // arrange
        AutoMotorTestDataBuilder autoMotorTestDataBuilder = new AutoMotorTestDataBuilder();
        AutoMotor autoMotor = autoMotorTestDataBuilder.conServicios("lavado,polichado,cambioAceite,balanceo").build();

        VECES_ATENDIDO = 10L;

        PRECIOS = new ArrayList<>();
        PRECIOS.add(PRECIO_LAVADO);
        PRECIOS.add(PRECIO_POLICHADO);
        PRECIOS.add(PRECIO_CAMBIO_DE_ACEITE);
        PRECIOS.add(PRECIO_BALANCEO);

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                VECES_ATENDIDO,
                autoMotor.getServicios().split(",").length,
                PRECIOS
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_CON_DESCUENTO_QUINCE_PORCIENTO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }

    @Test
    public void noEntregarDescuentoQuincePorCientoTest() throws ParseException {
        // arrange
        AutoMotorTestDataBuilder autoMotorTestDataBuilder = new AutoMotorTestDataBuilder();
        AutoMotor autoMotor = autoMotorTestDataBuilder.build();

        PRECIOS = new ArrayList<>();
        PRECIOS.add(PRECIO_LAVADO);
        PRECIOS.add(PRECIO_POLICHADO);

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                VECES_ATENDIDO,
                autoMotor.getServicios().split(",").length,
                PRECIOS
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_SIN_DESCUENTO_QUINCE_PORCIENTO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }
}