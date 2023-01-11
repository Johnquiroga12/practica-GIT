/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_factura.Proyecto_factura.services;

import Proyecto_factura.Proyecto_factura.model.Cliente;
import Proyecto_factura.Proyecto_factura.reposytory.clienteReposi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jhonl
 */

@Service
public class ClienteServecelmpl extends GenericServiceImpl<Cliente, Integer> implements clienteService {

    @Autowired
    clienteReposi  clienteRepository;
    @Override
    public CrudRepository<Cliente, Integer> getDao() {
        return clienteRepository;
    }

}
