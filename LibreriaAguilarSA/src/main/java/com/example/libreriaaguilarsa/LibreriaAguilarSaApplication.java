package com.example.libreriaaguilarsa;

import com.example.libreriaaguilarsa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LibreriaAguilarSaApplication implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public static void main(String[] args) {
        SpringApplication.run(LibreriaAguilarSaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
