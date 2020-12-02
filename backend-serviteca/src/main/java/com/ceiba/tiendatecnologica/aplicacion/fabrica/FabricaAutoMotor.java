package com.ceiba.tiendatecnologica.aplicacion.fabrica;

import com.ceiba.tiendatecnologica.aplicacion.comando.ComandoAutoMotor;
import com.ceiba.tiendatecnologica.dominio.AutoMotor;
import org.springframework.stereotype.Component;

@Component
public class FabricaAutoMotor {

    public AutoMotor crearAutoMotor(ComandoAutoMotor comandoAutoMotor) {
        return new AutoMotor(
                comandoAutoMotor.getId(),
                comandoAutoMotor.getCedula(),
                comandoAutoMotor.getPlaca(),
                comandoAutoMotor.getTipoAutoMotor(),
                comandoAutoMotor.getServicios(),
                comandoAutoMotor.getHoraEntrada(),
                comandoAutoMotor.getHoraSalida(),
                comandoAutoMotor.getValorAPagar()
        );
    }

}
