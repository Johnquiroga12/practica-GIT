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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jhonl
 */
@Entity
@Getter
@Setter
public class Detalle_fanctura {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detalle")
    private Integer id_detalle;
    @Column(name="num_factura")
    private Integer num_factura;  
    @Column(name="cantidad")
       private Integer cantidad;    

   @ManyToOne
    @JoinColumn(name="id_producto", referencedColumnName = "id_producto")
    private Producto producto;         
   @ManyToOne
    @JoinColumn(name="id_factura", referencedColumnName = "id_factura")
    private Facctura factura;         
                
}
