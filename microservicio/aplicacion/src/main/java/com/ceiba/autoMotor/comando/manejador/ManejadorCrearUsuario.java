package com.ceiba.autoMotor.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearUsuario implements ManejadorComandoRespuesta<ComandoUsuario, ComandoRespuesta<Long>> {

    private final FabricaUsuario fabricaUsuario;
    private final ServicioCrearUsuario servicioCrearUsuario;

    public ManejadorCrearUsuario(FabricaUsuario fabricaUsuario, ServicioCrearUsuario servicioCrearUsuario) {
        this.fabricaUsuario = fabricaUsuario;
        this.servicioCrearUsuario = servicioCrearUsuario;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoUsuario comandoUsuario) {
        Usuario usuario = this.fabricaUsuario.crear(comandoUsuario);
        return new ComandoRespuesta<>(this.servicioCrearUsuario.ejecutar(usuario));
    }
}