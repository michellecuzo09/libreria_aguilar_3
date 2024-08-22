package com.example.libreriaaguilarsa.service;


import com.example.libreriaaguilarsa.modelo.Categoria;
import com.example.libreriaaguilarsa.modelo.Productos;

import java.util.List;
import java.util.Set;

public interface ProductoService {

    Productos agregarProducto(Productos producto);

    Productos actualizarProducto(Productos producto);

    Set<Productos> obtenerProductos();

    Productos obtenerProducto(Long productoId);

    void eliminarProducto(Long productoId);

    List<Productos> listarProductoesDeUnaCategoria(Categoria categoria);

    List<Productos> getProducts(String param1, String param2);

}
