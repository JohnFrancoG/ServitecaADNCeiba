package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.comando.ComandoAutoMotor;
import com.ceiba.usuario.modelo.entidad.AutoMotor;
import org.springframework.stereotype.Component;

@Component
public class FabricaAutoMotor {

    public AutoMotor crear (ComandoAutoMotor comandoAutoMotor){
        return  new AutoMotor(
                comandoAutoMotor.getCedulaConductor(),
                comandoAutoMotor.getPlacaAutoMotor(),
                comandoAutoMotor.getTipoAutoMotor(),
                comandoAutoMotor.getServiciosTomados(),
                comandoAutoMotor.getHoraDeIngreso(),
                comandoAutoMotor.getHoraDeSalida(),
                comandoAutoMotor.getValorPorPagar(),
                comandoAutoMotor.getVecesAtendido(),
                comandoAutoMotor.getPrecios()
        );
    }
}
