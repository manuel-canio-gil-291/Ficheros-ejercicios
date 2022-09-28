/**
 * TAREA FICHEROS
 * 
 * Ejercicio 4: Programa que cree la estructura de directorios y ficheros siguientes:
 * "dir1" solo contiene el fichero f11.doc
 * "dir2" solo contiene el fichero f21.txt
 */
package main.java;

import java.io.File;
import java.io.IOException;

public class FicheroEjercicio4{
    public static void crearEstructura1(File directorio1, File fichero1) throws IOException{
        try{
            directorio1.mkdir();
            fichero1.createNewFile();
        }catch(IOException e) {
            System.err.println("No se completo el proceso por un error inesperado");
            e.printStackTrace();
        }
    }

    public static void crearEstructura2(File directorio2, File fichero2) throws IOException {
        try{
            directorio2.mkdir();
            fichero2.createNewFile();
        }catch(IOException e) {
            System.err.println("No se completo el proceso por un error inesperado");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException{
        File dir1 = new File("dir1"), dir2 = new File("dir2");
        File fich1 = new File("dir1//f11.doc"), fich2 = new File("dir2//f21.txt");
        //Al momento de ejecutar el programa se creara la estructura de directorios y ficheros que se proponen
        FicheroEjercicio4.crearEstructura1(dir1, fich1);
        FicheroEjercicio4.crearEstructura2(dir2, fich2);
    }
}