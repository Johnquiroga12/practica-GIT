/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_factura.Proyecto_factura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jhonl
 */
@Entity
@Getter
@Setter
public class Producto {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id_producto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private Double precio;
     @Column(name = "stock")
    private Integer stock;    
 @OneToMany (mappedBy = 
            "producto")
private List    <Detalle_fanctura> det_factura;
            









}
