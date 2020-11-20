package com.ceiba.usuario.modelo.entidad;

public class ServiciosAutoMotor {

    private String nombreAutoMotor;
    private String serviciosTomados;
    private int cantidadServicios;
    private int vecesAtendido;
    double precios[];

    public ServiciosAutoMotor(String nombreAutoMotor, String serviciosTomados, int cantidadServicios, int vecesAtendido, double[] precios) {
        this.nombreAutoMotor = nombreAutoMotor;
        this.serviciosTomados = serviciosTomados;
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

    public String getServiciosTomados() {
        return serviciosTomados;
    }

    public void setServiciosTomados(String serviciosTomados) {
        this.serviciosTomados = serviciosTomados;
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
