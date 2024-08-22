package com.example.libreriaaguilarsa.repository;

import com.example.libreriaaguilarsa.modelo.Categoria;
import com.example.libreriaaguilarsa.modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Productos,Long> {

    List<Productos> findByCategoria(Categoria categoria);

}
