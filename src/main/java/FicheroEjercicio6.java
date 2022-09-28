/**
 * TAREA FICHEROS
 * 
 * Ejercicio 6: Programa que liste solo aquellos ficheros con extension ".doc" usando las interfaces
 * FileFilter o FilenameFilter
 */
package main.java;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FicheroEjercicio6 {
    public static void main(String[] args) throws IOException{
        FileFilter filtrarArchivos = new FileFilter() 
        {
            @Override
            public boolean accept(File file) {
                if(file.getName().endsWith(".doc"))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };

        File directorio = new File("dir1");

        if(!directorio.exists()) 
        {
            System.out.println("El directorio no existe");
        }
        if(!directorio.isDirectory())
        {
            System.out.println("No es un directorio");
        }

        File[] ficheros = directorio.listFiles(filtrarArchivos);
        for(File f : ficheros) 
        {
            System.out.println(f.getName());
        }
    }
}
