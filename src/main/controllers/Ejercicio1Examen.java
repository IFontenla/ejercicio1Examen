package com.example.ejercicio1Examen.controllers;

@RestController
public class Principal {
    
    //http://localhost:8080/letradni/XXXX
    @GetMapping("/letradni/{dni}")
    public String cambioPalabra(@PathVariable String dni) {
        return (String)calculaLetra(dni);
    }

    //http://localhost:8080/coincidencias?nombre1=XXXX&nombre2=YYYY
    @GetMapping("/coincidencias")
    public String guarda(@RequestParam String nombre1, @RequestParam String nombre2) {
        
        for (int i=0; i<datosUsuario.length; i++) {

        }
        return"Los datos se han guardado correctamente";
    }
}
