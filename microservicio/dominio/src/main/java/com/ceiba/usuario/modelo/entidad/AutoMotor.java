package com.ceiba.usuario.modelo.entidad;

import java.util.ArrayList;
import java.util.List;

public class AutoMotor {

    private String nombreAutoMotor;
    private List<String> serviciosTomados;
    private int cantidadServicios;
    private int vecesAtendido;
    double[] precios;

    public AutoMotor(String nombreAutoMotor, List<String> serviciosTomados, int cantidadServicios, int vecesAtendido, double[] precios) {
        this.nombreAutoMotor = nombreAutoMotor;
        this.serviciosTomados = new ArrayList<>(serviciosTomados);
        this.cantidadServicios = cantidadServicios;
        this.vecesAtendido = vecesAtendido;
        this.precios = precios;
    }

    public String getNombreAutoMotor() {
        return nombreAutoMotor;
    }

    public void setNombreAutoMotor(String nombreAutoMotor) {
        this.nombreAutoMotor = nombreAutoMotor;
    }

    public List<String> getServiciosTomados() {
        return serviciosTomados;
    }

    public void setServiciosTomados(List<String> serviciosTomados) {
        this.serviciosTomados = new ArrayList<>(serviciosTomados);
    }

    public int getCantidadServicios() {
        return cantidadServicios;
    }

    public void setCantidadServicios(int cantidadServicios) {
        this.cantidadServicios = cantidadServicios;
    }

    public int getVecesAtendido() {
        return vecesAtendido;
    }

    public void setVecesAtendido(int vecesAtendido) {
        this.vecesAtendido = vecesAtendido;
    }

    public double[] getPrecios() {
        return precios;
    }

    public void setPrecios(double[] precios) {
        this.precios = precios;
    }
}
