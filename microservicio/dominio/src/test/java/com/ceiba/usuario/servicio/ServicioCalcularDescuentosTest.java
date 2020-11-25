package com.ceiba.usuario.servicio;

import com.ceiba.usuario.modelo.entidad.AutoMotor;
import com.ceiba.usuario.servicio.testdatabuilder.ServiciosAutoMotorTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ServicioCalcularDescuentosTest {

    public static final double PRECIO_ESPERADO_CON_DESCUENTO_SERVICIO_MAS_BARATO = 12.000;
    public static final double DIFERENCIA_DE_DECIMALES = 0.000;
    public static final double PRECIO_ESPERADO_SIN_DESCUENTO_SERVICIO_MAS_BARATO = 20.500;
    public static final int VECES_ATENDIDO = 10;
    public static final double PRECIO_LAVADO = 8.500;
    public static final double PRECIO_POLICHADO = 12.000;
    public static final double PRECIO_CAMBIO_DE_ACEITE = 20.000;
    public static final double PRECIO_BALANCEO = 18.000;
    public static final double PRECIO_ESPERADO_CON_DESCUENTO_QUINCE_PORCIENTO = 49.725;
    public static final double PRECIO_ESPERADO_SIN_DESCUENTO_QUINCE_PORCIENTO = 20.500;

    @Test
    public void entregarDescuentoServicioMasBaratoTest() {
        // arrange
        ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
        AutoMotor autoMotor = serviciosAutoMotorTestDataBuilder.build();

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                autoMotor.getVecesAtendido(),
                autoMotor.getServiciosTomados().toArray().length,
                autoMotor.getPrecios()
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_CON_DESCUENTO_SERVICIO_MAS_BARATO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }

    @Test
    public void noEntregarDescuentoServicioMasBaratoTest() {
        // arrange
        ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
        AutoMotor autoMotor = serviciosAutoMotorTestDataBuilder.conVecesAtendido(VECES_ATENDIDO).build();

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                autoMotor.getVecesAtendido(),
                autoMotor.getServiciosTomados().toArray().length,
                autoMotor.getPrecios()
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_SIN_DESCUENTO_SERVICIO_MAS_BARATO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }

    @Test
    public void entregarDescuentoQuincePorCientoTest() {
        // arrange
        ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
        AutoMotor autoMotor = serviciosAutoMotorTestDataBuilder.conVecesAtendido(VECES_ATENDIDO).conServicios(
                new ArrayList<>(Arrays.asList("Lavado", "Polichado", "Cambio de Aceite", "Balanceo"))
        ).conPrecios(new double[] {PRECIO_LAVADO, PRECIO_POLICHADO, PRECIO_CAMBIO_DE_ACEITE, PRECIO_BALANCEO}).build();

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                autoMotor.getVecesAtendido(),
                autoMotor.getServiciosTomados().toArray().length,
                autoMotor.getPrecios()
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_CON_DESCUENTO_QUINCE_PORCIENTO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }

    @Test
    public void noEntregarDescuentoQuincePorCientoTest() {
        // arrange
        ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
        AutoMotor autoMotor = serviciosAutoMotorTestDataBuilder.conVecesAtendido(10).conServicios(
                new ArrayList<>(Arrays.asList("Lavado", "Polichado"))
        ).conPrecios(new double[] {PRECIO_LAVADO, PRECIO_POLICHADO}).build();

        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos();

        // act
        double precioFinal = servicioCalcularDescuentos.calcularDescuentos(
                autoMotor.getVecesAtendido(),
                autoMotor.getServiciosTomados().toArray().length,
                autoMotor.getPrecios()
        );

        //assert
        Assert.assertEquals(PRECIO_ESPERADO_SIN_DESCUENTO_QUINCE_PORCIENTO, precioFinal, DIFERENCIA_DE_DECIMALES);
    }
}