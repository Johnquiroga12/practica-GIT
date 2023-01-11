package Proyecto_factura.Proyecto_factura.controlador;


import Proyecto_factura.Proyecto_factura.model.Facctura;
import Proyecto_factura.Proyecto_factura.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Facctura>> obtenerLista() {
        return new ResponseEntity<>(facturaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Facctura> crear(@RequestBody Facctura c){
        return new ResponseEntity<>(facturaService.save(c), HttpStatus.CREATED);
    }


    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        facturaService.delete(id);
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<Facctura> updateUser(@PathVariable Integer id, @RequestBody Facctura c) {
        if (facturaService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        c.setCliente(c.getCliente());
        c.setFecha(c.getFecha());
        c.setDet_acctura(c.getDet_acctura());

        Facctura newObjeto = facturaService.save(c);
        return ResponseEntity.ok(newObjeto);
    }
}
