package tests;

import entidades.Odontologo;
import org.junit.jupiter.api.Test;
import servicios.OdontologoService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class OndontologoDAOH2Test {

    @Test
    public void testListarTodos() {

        OdontologoService odontologoService = new OdontologoService();
        List<Odontologo> odontologos = odontologoService.listarTodos();

        assertFalse(odontologos.isEmpty());

        assertEquals(3, odontologos.size());
    }
}
