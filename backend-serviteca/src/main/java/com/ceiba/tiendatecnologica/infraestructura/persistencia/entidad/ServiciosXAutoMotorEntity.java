package com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

@Entity(name = "Servicios_x_automotor")
@NamedQuery(
        name = "Servicios_x_automotor.obtenerServicios",
        query = "SELECT sxa FROM Servicios_x_automotor sxa " +
                "WHERE sxa.tipo_automotor = :tipo_automotor " +
                "AND sxa.nombre_servicio in (:nombre_servicio)"
)
public class ServiciosXAutoMotorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nombre_servicio;

    @Column(nullable = false)
    private String tipo_automotor;

    @Column(nullable = false)
    private double precio;

    @Column(nullable = false)
    private LocalTime tiempo_promedio_servicio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getTipo_automotor() {
        return tipo_automotor;
    }

    public void setTipo_automotor(String tipo_automotor) {
        this.tipo_automotor = tipo_automotor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalTime getTiempo_promedio_servicio() {
        return tiempo_promedio_servicio;
    }

    public void setTiempo_promedio_servicio(LocalTime tiempo_promedio_servicio) {
        this.tiempo_promedio_servicio = tiempo_promedio_servicio;
    }
}
