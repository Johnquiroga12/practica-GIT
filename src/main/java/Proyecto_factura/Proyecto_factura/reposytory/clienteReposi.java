/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Proyecto_factura.Proyecto_factura.reposytory;

import Proyecto_factura.Proyecto_factura.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jhonl
 */
public interface clienteReposi extends JpaRepository<Cliente, Integer>{
       @Query(value = "Select * from cliente c where c.cedula = :cedula", nativeQuery = true)
    public Cliente buscarCliente(String cedula);

    
}
