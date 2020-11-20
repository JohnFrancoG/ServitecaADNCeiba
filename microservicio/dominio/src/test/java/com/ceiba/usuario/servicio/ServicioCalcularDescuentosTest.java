package com.ceiba.usuario.servicio;

import com.ceiba.usuario.modelo.entidad.ServiciosAutoMotor;
import com.ceiba.usuario.servicio.testdatabuilder.ServiciosAutoMotorTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ServicioCalcularDescuentosTest {

    @Test
    public void entregarDescuentoServicioMasBaratoTest() {
        try {
            // arrange
            ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
            ServiciosAutoMotor serviciosAutoMotor = serviciosAutoMotorTestDataBuilder.build();

            ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(
                    serviciosAutoMotor.getVecesAtendido(),
                    serviciosAutoMotor.getCantidadServicios(),
                    serviciosAutoMotor.getPrecios()
            );

            // act
            double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

            //assert
            Assert.assertEquals(12.000, precioFinal, 0.000);
        } catch (Exception e) {
            Assert.assertEquals(12.000, 0, 0.000);
        }
    }

    @Test
    public void noEntregarDescuentoServicioMasBaratoTest() {
        try {
            // arrange
            ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
            ServiciosAutoMotor serviciosAutoMotor = serviciosAutoMotorTestDataBuilder.conVecesAtendido(10).build();

            ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(
                    serviciosAutoMotor.getVecesAtendido(),
                    serviciosAutoMotor.getCantidadServicios(),
                    serviciosAutoMotor.getPrecios()
            );

            // act
            double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

            //assert
            Assert.assertEquals(20.500, precioFinal, 0.000);
        } catch (Exception e) {
            Assert.assertEquals(20.500, 0, 0.000);
        }
    }

    @Test
    public void entregarDescuentoQuincePorCientoTest() {
        try {
            // arrange
            ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
            ServiciosAutoMotor serviciosAutoMotor = serviciosAutoMotorTestDataBuilder.conVecesAtendido(10).conServicios(
                    "Lavado,Polichado,Cambio de Aceite,Balanceo"
            ).conPrecios(new double[] {8.500, 12.000, 20.000, 18.000}).build();

            ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(
                    serviciosAutoMotor.getVecesAtendido(),
                    serviciosAutoMotor.getCantidadServicios(),
                    serviciosAutoMotor.getPrecios()
            );

            // act
            double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

            //assert
            Assert.assertEquals(49.725, precioFinal, 0.000);
        } catch (Exception e) {
            Assert.assertEquals(49.725, 0, 0.000);
        }
    }

    @Test
    public void noEntregarDescuentoQuincePorCientoTest() {
        try {
            // arrange
            ServiciosAutoMotorTestDataBuilder serviciosAutoMotorTestDataBuilder = new ServiciosAutoMotorTestDataBuilder();
            ServiciosAutoMotor serviciosAutoMotor = serviciosAutoMotorTestDataBuilder.conVecesAtendido(10).conServicios(
                    "Lavado,Polichado"
            ).conPrecios(new double[] {8.500, 12.000}).build();

            ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(
                    serviciosAutoMotor.getVecesAtendido(),
                    serviciosAutoMotor.getCantidadServicios(),
                    serviciosAutoMotor.getPrecios()
            );

            // act
            double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

            //assert
            Assert.assertEquals(20.500, precioFinal, 0.000);
        } catch (Exception e) {
            Assert.assertEquals(20.500, 0, 0.000);
        }
    }
}