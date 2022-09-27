/**
 * TAREA FICHEROS
 * 
 * Ejercicio 3: Programa que liste el contenido del directorio actual y de los directorios que cuelgan
 * en el mostrando nombre y tipo de cada fichero o directorio
 */
package main.java;

import java.io.File;

public class FicheroEjercicio3 {
    public static void listarFicheros(File directorio) {
        String[] listado = directorio.list();
        File[] listadoFicheros = directorio.listFiles();

        if(directorio.exists()) {
            if(listadoFicheros == null || listadoFicheros.length == 0) {
                System.out.println("No hay elementos en la carpeta actual");
            }else{
                listar(directorio);
            }
        }
    }

    public static void listar(final File ruta) {
        for(final File f : ruta.listFiles()) {
            if(f.isFile()) {
                System.out.println("Archivo: "+f.getName());
            }
            if(f.isDirectory()) {
                System.out.println("Directorio: "+f.getName());
                listar(f);
            }
        }
    }

    public static void main(String[] args) {
        File dir = new File("C://Users//manue//Documents//Acceso a datos Java//Ficheros-ejercicios");
        FicheroEjercicio3.listarFicheros(dir);
    }
}
