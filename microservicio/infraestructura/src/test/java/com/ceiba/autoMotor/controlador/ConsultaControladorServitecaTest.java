package com.ceiba.autoMotor.controlador;

import com.ceiba.ApplicationMock;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= ApplicationMock.class)
public class ConsultaControladorServitecaTest {

    @Autowired
    private MockMvc mocMvc;

    /*@Test
    public void calcularDescuentos() throws Exception {
        // arrange

        // act - assert
        mocMvc.perform(
                get("/descuentos?vecesAtentido=10&serviciosTomados=2&preciosPorServicios=8.500,12.000")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());
    }*/
}