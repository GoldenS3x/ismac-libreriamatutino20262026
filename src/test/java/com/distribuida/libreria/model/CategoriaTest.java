package com.distribuida.libreria.model;

import com.distribuida.model.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {
    private Categoria categoria;

    @BeforeEach
    public void setup() {
        categoria = new Categoria(1,
                "Ficción",
                "Libros de literatura y narrativas ficcionales");
    }

    @Test
    public void testCategoriaConstructorAndGetter() {
        assertAll("Pruebas unitarias constructor categoria",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Ficción", categoria.getCategoria()),
                () -> assertEquals("Libros de literatura y narrativas ficcionales", categoria.getDescripcion())
        );
        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaSetters() {
        categoria.setIdCategoria(2);
        categoria.setCategoria("Terror");
        categoria.setDescripcion("Novelas de horror y suspenso psicológico");

        assertAll("Pruebas unitarias setters categoria",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Terror", categoria.getCategoria()),
                () -> assertEquals("Novelas de horror y suspenso psicológico", categoria.getDescripcion())
        );
        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaToString() {
        String str = categoria.toString();
        assertAll("Validar datos de categoria con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Ficción")),
                () -> assertTrue(str.contains("Libros de literatura y narrativas ficcionales"))
        );
        System.out.println(categoria);
    }
}
