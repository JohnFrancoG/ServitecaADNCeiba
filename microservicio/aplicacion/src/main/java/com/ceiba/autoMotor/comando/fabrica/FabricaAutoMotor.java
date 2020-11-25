package com.ceiba.autoMotor.comando.fabrica;

import com.ceiba.autoMotor.comando.ComandoAutoMotor;
import com.ceiba.autoMotor.modelo.entidad.AutoMotor;
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
