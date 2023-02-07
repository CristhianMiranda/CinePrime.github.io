package co.edu.uniquindio.cineprime.controllers;


import co.edu.uniquindio.cineprime.entidades.Pelicula;
import co.edu.uniquindio.cineprime.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UsuarioApi {

    @Autowired
    UsuarioServicio usuarioServicio;


    @GetMapping("/saludar")
    public String saludar(){
        return "Hola mundo desde spring";
    }

    @GetMapping("/browser/{nombre}")
    public ArrayList<Pelicula> buscador(@PathVariable ("nombre") String nombre) throws Exception {
        return usuarioServicio.encontrarPeliculas(nombre);
    }
}
