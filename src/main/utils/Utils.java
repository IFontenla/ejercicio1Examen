package com.example.ejercicio1Examen.utils;

public class Utils {
    
    String calculaLetra(int dni){

        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";

        int modulo= dni % 23;

        char letra = juegoCaracteres.charAt(modulo);

        return letra;

    }

}
