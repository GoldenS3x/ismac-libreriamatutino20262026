package com.distribuida.libreria.model;

import com.distribuida.model.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

@BeforeEach
    public void setUp(){
        cliente = new Cliente(
                1,
                "1750042853",
                "bob",
                "esponja",
                "en el nar",
                "03895956",
                "esponjbob@gmsi.com"
        );
    }
    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Pruebas unitarias constructor Cliente",
        () -> assertEquals(1,cliente.getIdCliente()),
        () -> assertEquals("1750042853",cliente.getIdCedula()),
                () -> assertEquals("bob", cliente.getNombre()),
                () -> assertEquals("esponja",cliente.getApellido()),
                () -> assertEquals("en el nar", cliente.getDireccion()),
                () -> assertEquals("03895956",cliente.getTelefono()),
                () -> assertEquals("esponjbob@gmsi.com",cliente.getCorreo())
        );
        System.out.println(cliente.toString());



    }

    @Test

    public void testClienteSetters(){
    cliente.setIdCliente(2);
    cliente.setIdCedula("1750042853");
    cliente.setNombre("bob2");
    cliente.setApellido("esponja2");
    cliente.setDireccion("en el mar");
    cliente.setTelefono("0985524302");
    cliente.setCorreo("esponj@gmsil.com");

        assertAll("Pruebas unitarias constructor Cliente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("1750042853",cliente.getIdCedula()),
                () -> assertEquals("bob2", cliente.getNombre()),
                () -> assertEquals("esponja2",cliente.getApellido()),
                () -> assertEquals("en el mar", cliente.getDireccion()),
                () -> assertEquals("0985524302",cliente.getTelefono()),
                () -> assertEquals("esponj@gmsil.com",cliente.getCorreo())
        );
        System.out.println(cliente.toString());

    }

    @Test

    public void testClienteToString() {
        String str = cliente.toString();
        assertAll("Validar datos de cliente con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1750042853")),
                () -> assertTrue(str.contains("bob")),
                () -> assertTrue(str.contains("esponja")),
                () -> assertTrue(str.contains("en el nar")),
                () -> assertTrue(str.contains("03895956")),
                () -> assertTrue(str.contains("esponjbob@gmsi.com"))
        );

        System.out.println(cliente);
    }
    }






