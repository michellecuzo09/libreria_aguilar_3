package com.example.libreriaaguilarsa.service;

import com.example.libreriaaguilarsa.modelo.Usuario;
import com.example.libreriaaguilarsa.modelo.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
