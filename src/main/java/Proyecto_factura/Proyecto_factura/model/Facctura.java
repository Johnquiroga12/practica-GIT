package Proyecto_factura.Proyecto_factura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
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
public class Facctura {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_factura")
    private Integer id_cliente;
    @Column(name="fecha")
    private Date fecha;

    
    @ManyToOne
    @JoinColumn(name="id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;         
           
   
     @OneToMany (mappedBy = 
            "factura")
private List    <Detalle_fanctura>det_acctura;
 
   
}
