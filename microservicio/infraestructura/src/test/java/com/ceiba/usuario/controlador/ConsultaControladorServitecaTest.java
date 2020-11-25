package com.ceiba.usuario.controlador;

import com.ceiba.ApplicationMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= ApplicationMock.class)
@WebMvcTest(ConsultaControladorUsuario.class)
public class ConsultaControladorServitecaTest {

    @Autowired
    private MockMvc mocMvc;

    @Test
    public void calcularDescuentos() throws Exception {
        // arrange

        // act - assert
        mocMvc.perform(
                get("/descuentos?vecesAtentido=10&serviciosTomados=2&preciosPorServicios=8.500,12.000")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());
    }
}