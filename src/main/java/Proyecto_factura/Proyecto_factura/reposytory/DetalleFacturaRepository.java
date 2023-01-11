package Proyecto_factura.Proyecto_factura.reposytory;

import Proyecto_factura.Proyecto_factura.model.Detalle_fanctura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository<Detalle_fanctura, Integer> {
}
