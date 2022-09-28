/**
 * TAREA FICHEROS
 * 
 * Ejercicio 5: Programa que cambie los ficheros del nombre, de f11.doc por f12.doc, mueva el fichero
 * f21.txt al directorio dir1 y elimine el directorio dir2
 */
package main.java;

import java.io.File;
import java.io.IOException;

public class FicheroEjercicio5 {
    public static void cambiarNombreFichero(File nombreActual, File nombreNuevo) throws IOException{
        nombreActual.renameTo(nombreNuevo);
    }

    public static void moverFichero(File fichero, File dirDestinoFile) {
        
    }

    public static void borrarDirectorio(File directorio) {
        if(directorio.exists()) {
            directorio.delete();
        }else {
            System.out.println("El directorio no existe");
        }
    }
}
