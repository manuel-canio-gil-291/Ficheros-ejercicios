/**
 * TAREA FICHEROS
 * 
 * Ejercicio 1: Programa que muestre todas las entradas del directorio "C:\Windows" o "/home".
 */
package main.java;

import java.io.File;

public class FicheroEjercicio1 {
    public static void listadoDirectorios(File directorio) {
        String[] listado = directorio.list();
        if(listado == null || listado.length == 0) {
            System.out.println("La carpeta esta vacia");
        }else{
            System.out.println("Listado del directorio "+directorio);
            for(int i = 0; i < listado.length; i++) {
                System.out.println(listado[i]);
            }
        }
    }

    public static void main(String[] args) {
        File directorio = new File("C://Windows");

        FicheroEjercicio1.listadoDirectorios(directorio);
    }
}