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
public class Cliente {
    
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Integer id_cliente;
    @Column(name="nombre")
    private String nombre;
        @Column(name="apellido")
    private String apellido;
        @Column(name="cedula")
        private String cedula;
        @Column(name="correo")
        private String correo;
    
    @OneToMany (mappedBy = 
            "cliente")
private List    <Facctura> facctura;
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
