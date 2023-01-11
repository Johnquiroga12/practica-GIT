package Proyecto_factura.Proyecto_factura.reposytory;

import Proyecto_factura.Proyecto_factura.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRespository extends JpaRepository<Producto, Integer>   {
}
