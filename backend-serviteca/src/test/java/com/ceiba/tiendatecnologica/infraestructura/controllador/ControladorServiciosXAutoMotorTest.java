package com.ceiba.tiendatecnologica.infraestructura.controllador;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class ControladorServiciosXAutoMotorTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void ObtenerHoraSalida() throws Exception
    {
        mvc.perform( MockMvcRequestBuilders
                .get("/ServiciosAutoMotor/{tipoAutoMotor}/{servicios}/{horaEntrada}", "automovil","lavado,polichado","04:33:00"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.hora_salida").value("06:03:00"));
    }
}