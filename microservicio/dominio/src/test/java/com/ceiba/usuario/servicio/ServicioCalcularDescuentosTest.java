package com.ceiba.usuario.servicio;

import org.junit.Assert;
import org.junit.Test;

public class ServicioCalcularDescuentosTest {

    @Test
    public void entregarDescuentoServicioMasBaratoTest() {
        // arrange
        double precios[] = {8.500,10.000};
        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(2,50, precios);

        // act
        double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

        //assert
        Assert.assertEquals(10.000, precioFinal, 0.001);
    }

    @Test
    public void noEntregarDescuentoServicioMasBaratoTest() {
        // arrange
        double precios[] = {8.500,10.000};
        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(2,10, precios);

        // act
        double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

        //assert
        Assert.assertEquals(18.500, precioFinal, 0.001);
    }

    @Test
    public void entregarDescuentoQuincePorCientoTest() {
        // arrange
        double precios[] = {8.500,10.000, 15.000, 18.000};
        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(4,10, precios);

        // act
        double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

        //assert
        Assert.assertEquals(43.775, precioFinal, 0.001);
    }

    @Test
    public void noEntregarDescuentoQuincePorCientoTest() {
        // arrange
        double precios[] = {8.500,10.000, 15.000};
        ServicioCalcularDescuentos servicioCalcularDescuentos = new ServicioCalcularDescuentos(3,10, precios);

        // act
        double precioFinal = servicioCalcularDescuentos.CalcularDescuentos();

        //assert
        Assert.assertEquals(33.500, precioFinal, 0.001);
    }

}