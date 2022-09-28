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
    public static void cambiarNombreFichero(File nombreActual, File nombreNuevo) throws IOException
    {
        if(nombreActual.exists()) 
        {
            nombreActual.renameTo(nombreNuevo);
        }
        else
        {
            System.out.println("El fichero no existe");
        }
    }

    public static void moverFichero(File fichero, String dirDestinoFile) throws IOException
    {
        if(fichero.exists()) 
        {
            fichero.renameTo(new File(dirDestinoFile + "//" + fichero.getName()));
        }
        else
        {
            System.out.println("El fichero no existe");
        }
    }

    public static void borrarDirectorio(File directorio) throws IOException
    {
        if(directorio.exists())
        {
            directorio.delete();
        }
        else
        {
            System.out.println("El directorio no existe");
        }
    }

    public static void main(String[] args) throws IOException 
    {
        File fich1 = new File("dir1//f11.doc"), fich1N = new File("dir1//f12.doc");
        File fich2 = new File("dir2//f21.txt");
        String dirDest = "dir1";
        File dirDel = new File("dir2");
        //Al momento de ejecutar el programa se realiza los cambios en los directorios y ficheros
        FicheroEjercicio5.cambiarNombreFichero(fich1, fich1N);
        FicheroEjercicio5.moverFichero(fich2, dirDest);
        FicheroEjercicio5.borrarDirectorio(dirDel);
    }
}
