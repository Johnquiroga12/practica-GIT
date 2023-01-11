package Proyecto_factura.Proyecto_factura.reposytory;
import Proyecto_factura.Proyecto_factura.model.Facctura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Facctura, Integer> {
}
