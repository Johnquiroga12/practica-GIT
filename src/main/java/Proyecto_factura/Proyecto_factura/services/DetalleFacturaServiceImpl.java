package Proyecto_factura.Proyecto_factura.services;

import Proyecto_factura.Proyecto_factura.model.Detalle_fanctura;
import Proyecto_factura.Proyecto_factura.reposytory.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleFacturaServiceImpl extends GenericServiceImpl<Detalle_fanctura, Integer> implements DetalleFacturaService{

    @Autowired
    DetalleFacturaRepository detalleFacturaRepository;

    @Override
    public CrudRepository<Detalle_fanctura, Integer> getDao() {
        return detalleFacturaRepository;
    }

}
