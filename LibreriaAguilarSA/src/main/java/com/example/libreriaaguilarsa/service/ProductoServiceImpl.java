package com.example.libreriaaguilarsa.service;

import com.example.libreriaaguilarsa.modelo.*;
import com.example.libreriaaguilarsa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Productos agregarProducto(Productos producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Productos actualizarProducto(Productos producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Set<Productos> obtenerProductos() {
        return new LinkedHashSet<>(productoRepository.findAll());
    }

    @Override
    public Productos obtenerProducto(Long productoId) {
        return productoRepository.findById(productoId).get();
    }

    @Override
    public void eliminarProducto(Long productoId) {
        Productos producto = new Productos();
        producto.setProductoId(productoId);
        productoRepository.delete(producto);
    }

    @Override
    public List<Productos> listarProductoesDeUnaCategoria(Categoria categoria) {
        return this.productoRepository.findByCategoria(categoria);
    }

    @Override
    public List<Productos> getProducts(String param1, String param2) {

        if (param1 == null && param2 == null) {
            return productoRepository.findAll();
        }
        return productoRepository.findAll();
    }
}
