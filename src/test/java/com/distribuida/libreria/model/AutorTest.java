package com.distribuida.libreria.model;

import com.distribuida.model.Autor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setup() {
        autor = new Autor(1,
                "Gabriel",
                "García Márquez",
                "Colombia",
                "Aracataca",
                "0999999999",
                "gabito@email.com");
    }

    @Test
    public void testAutorConstructorAndGetter() {
        assertAll("Pruebas unitarias constructor autor",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Gabriel", autor.getNombre()),
                () -> assertEquals("García Márquez", autor.getApellido()),
                () -> assertEquals("Colombia", autor.getPais()),
                () -> assertEquals("Aracataca", autor.getDireccion()),
                () -> assertEquals("0999999999", autor.getTelefono()),
                () -> assertEquals("gabito@email.com", autor.getCorreo())
        );
        System.out.println(autor.toString());
    }

    @Test
    public void testAutorSetters() {
        autor.setIdAutor(2);
        autor.setNombre("H.P.");
        autor.setApellido("Lovecraft");
        autor.setPais("Estados Unidos");
        autor.setDireccion("Providence");
        autor.setTelefono("18005555");
        autor.setCorreo("lovecraft@horror.com");

        assertAll("Pruebas unitarias setters autor",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("H.P.", autor.getNombre()),
                () -> assertEquals("Lovecraft", autor.getApellido()),
                () -> assertEquals("Estados Unidos", autor.getPais()),
                () -> assertEquals("Providence", autor.getDireccion()),
                () -> assertEquals("18005555", autor.getTelefono()),
                () -> assertEquals("lovecraft@horror.com", autor.getCorreo())
        );
        System.out.println(autor.toString());
    }

    @Test
    public void testAutorToString() {
        String str = autor.toString();
        assertAll("Validar datos de autor con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Gabriel")),
                () -> assertTrue(str.contains("García Márquez")),
                () -> assertTrue(str.contains("Colombia")),
                () -> assertTrue(str.contains("Aracataca")),
                () -> assertTrue(str.contains("0999999999")),
                () -> assertTrue(str.contains("gabito@email.com"))
        );
        System.out.println(autor);
    }
}
