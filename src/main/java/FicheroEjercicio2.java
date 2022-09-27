/**
 * TAREA FICHEROS
 * 
 * Ejercicio 2: Programa que nos diga cuál es el directorio actual
 */
package main.java;

import java.io.File;

public class FicheroEjercicio2 {
    public static void main(String[] args) {
        File dir = new File("");
        String directorioActual = dir.getAbsoluteFile().toString();

        System.out.println("El directorio actual es: "+directorioActual);
    }
}
