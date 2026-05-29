package com.distribuida.libreria.dao;


import com.distribuida.dao.ClienteDAO;
import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class ClientesTestIntegration {

    @Autowired
    private ClienteDAO clienteDAO;

    @Test
    public void findAll() {
        List<Cliente> clientes = clienteDAO.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size() > 0);
        for (Cliente item : clientes) {
            System.out.println(item.toString());
        }

    }

    @Test
    public void findOne() {
        Optional<Cliente> cliente = clienteDAO.findById(1);
        assertTrue(cliente.isPresent(), "El cliente con id = 1, deberia existir");
        System.out.println(cliente.toString());

    }

    @Test
    public void save() {
        Cliente cliente = new Cliente(
                0, "1750042853",
                "Alejandro",
                "Paz",
                "Av.porahi",
                "0985524302",
                "dpaz@gmail.com");
        Cliente clienteGuardado = clienteDAO.save(cliente);
        assertNotNull(clienteGuardado.getIdCliente(), "El cliente guardado debe tener un id");
        assertEquals("1750042853", clienteGuardado.getIdCedula());
        assertEquals("Alejandro", clienteGuardado.getNombre());
    }

    @Test
    public void update() {
        Optional<Cliente> cliente = clienteDAO.findById(46);
        assertTrue(cliente.isPresent(), "El cliente con id=44 debe existir para ser actualizado");

        cliente.orElse(null).setIdCedula("175004852");
        cliente.orElse(null).setNombre("Alejandro");
        cliente.orElse(null).setApellido("Paz2");
        cliente.orElse(null).setDireccion("Av.por");
        cliente.orElse(null).setTelefono("0985534303");
        cliente.orElse(null).setCorreo("damianpaz@gmail.com");

        Cliente clienteActualizado = clienteDAO.save(cliente.orElse(null));

        assertEquals("Alejandro", clienteActualizado.getNombre());
        assertEquals("Paz2", clienteActualizado.getApellido());


    }

    @Test
    public void delete() {
        if (clienteDAO.existsById(46)) {
            clienteDAO.deleteById(46);
        }
        assertFalse(clienteDAO.existsById(46), "El id=44 deberia haberse eliminado");

    }




}

