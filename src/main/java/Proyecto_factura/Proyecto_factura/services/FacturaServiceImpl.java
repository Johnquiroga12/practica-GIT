package Proyecto_factura.Proyecto_factura.services;

import Proyecto_factura.Proyecto_factura.model.Facctura;
import Proyecto_factura.Proyecto_factura.reposytory.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class FacturaServiceImpl extends GenericServiceImpl<Facctura, Integer> implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    @Override
    public CrudRepository<Facctura, Integer> getDao() {
        return facturaRepository;
    }

}
