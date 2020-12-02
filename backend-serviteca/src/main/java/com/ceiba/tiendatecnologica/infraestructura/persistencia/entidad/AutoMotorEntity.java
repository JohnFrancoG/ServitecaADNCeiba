package com.ceiba.tiendatecnologica.infraestructura.persistencia.entidad;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

@Entity(name = "Automotor")
@NamedQuery(
        name = "Automotor.vecesAtentido",
        query = "SELECT count(sxa) FROM Automotor sxa " +
                "WHERE sxa.cedula = :cedula"
)
public class AutoMotorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int cedula;

    @Column(nullable = false)
    private String placa;

    @Column(nullable = false)
    private String tipo_automotor;

    @Column(nullable = false)
    private String servicios;

    @Column(nullable = false)
    private LocalTime hora_entrada;

    @Column(nullable = false)
    private LocalTime hora_salida;

    @Column(nullable = false)
    private double valor_a_pagar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_automotor() {
        return tipo_automotor;
    }

    public void setTipo_automotor(String tipo_automotor) {
        this.tipo_automotor = tipo_automotor;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(LocalTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public LocalTime getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(LocalTime hora_salida) {
        this.hora_salida = hora_salida;
    }

    public double getValor_a_pagar() {
        return valor_a_pagar;
    }

    public void setValor_a_pagar(double valor_a_pagar) {
        this.valor_a_pagar = valor_a_pagar;
    }
}
