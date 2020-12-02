package com.ceiba.tiendatecnologica.infraestructura.controllador;

import com.ceiba.tiendatecnologica.aplicacion.comando.ComandoAutoMotor;
import com.ceiba.tiendatecnologica.infraestructura.persistencia.builder.AutoMotorBuilder;
import com.ceiba.tiendatecnologica.testdatabuilder.AutoMotorTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class ControladorAutoMotorTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void crearAutoMotor() throws Exception
    {
        ComandoAutoMotor comandoAutoMotor = new AutoMotorTestDataBuilder().buildComando();
        mvc.perform( MockMvcRequestBuilders
                .post("/AutoMotor")
                .content(objectMapper.writeValueAsString(comandoAutoMotor))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.cedula").value("1152709223"));
    }

}