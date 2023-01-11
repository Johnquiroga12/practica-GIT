package Proyecto_factura.Proyecto_factura.controlador;
import Proyecto_factura.Proyecto_factura.model.Detalle_fanctura;
import Proyecto_factura.Proyecto_factura.services.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleFactura")
public class DetalleFacturaController {

    @Autowired
    DetalleFacturaService DetalleFacturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Detalle_fanctura>> obtenerLista() {
        return new ResponseEntity<>(DetalleFacturaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Detalle_fanctura> crear(@RequestBody Detalle_fanctura c){
        return new ResponseEntity<>(DetalleFacturaService.save(c), HttpStatus.CREATED);
    }


    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        DetalleFacturaService.delete(id);
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<Detalle_fanctura> updateUser(@PathVariable Integer id, @RequestBody Detalle_fanctura c) {
        if (DetalleFacturaService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        c.setCantidad(c.getCantidad());
        c.setFactura(c.getFactura());
        c.setProducto(c.getProducto());

        Detalle_fanctura newObjeto = DetalleFacturaService.save(c);
        return ResponseEntity.ok(newObjeto);
    }
}
