package com.example.libreriaaguilarsa.controller;

import com.example.libreriaaguilarsa.modelo.*;
import com.example.libreriaaguilarsa.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/addProducto")
    public ResponseEntity<Productos> guardarProducto(@RequestBody Productos producto){
        return ResponseEntity.ok(productoService.agregarProducto(producto));
    }

    @PutMapping("/actualizarProducto")
    public ResponseEntity<Productos> actualizarProducto(@RequestBody Productos producto){
        return ResponseEntity.ok(productoService.actualizarProducto(producto));
    }

    @GetMapping("/listarProducto")
    public ResponseEntity<?> listarProductos(){
        return ResponseEntity.ok(productoService.obtenerProductos());
    }

    @GetMapping("/{productoId}")
    public Productos listarProducto(@PathVariable("productoId") Long productoId){
        return productoService.obtenerProducto(productoId);
    }

    @DeleteMapping("/{productoId}")
    public void eliminarProducto(@PathVariable("productoId") Long productoId){
        productoService.eliminarProducto(productoId);
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Productos> listarProductosDeUnaCategoria(@PathVariable("categoriaId") Long categoriaId){
        Categoria categoria = new Categoria();
        categoria.setCategoriaId(categoriaId);
        return productoService.listarProductoesDeUnaCategoria(categoria);
    }

    @GetMapping("/reporte")
    public List<Productos> getReport(@RequestParam(required = false) String param1,
                                   @RequestParam(required = false) String param2) {
        return productoService.getProducts(param1, param2);
    }
}
