package Proyecto_factura.Proyecto_factura.services;

import Proyecto_factura.Proyecto_factura.model.Producto;
import Proyecto_factura.Proyecto_factura.reposytory.ProductoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Integer> implements ProductoService{

    @Autowired
    ProductoRespository productoRepository;
    
    @Override
    public CrudRepository<Producto, Integer> getDao() {
        return productoRepository;
    }
    
}
