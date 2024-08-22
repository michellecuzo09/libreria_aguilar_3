package com.example.libreriaaguilarsa.repository;

import com.example.libreriaaguilarsa.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}
