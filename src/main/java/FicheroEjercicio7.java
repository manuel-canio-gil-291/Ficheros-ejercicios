/**
 * TAREA FICHEROS
 * 
 * Ejercicio 7: Programa que borra la estructura anterior, solicitando confirmación antes de borrar
 * cada fichero o directorio.
 */
package main.java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FicheroEjercicio7 {
    public static void borrarEstructura(File directorio) throws IOException
    {
        if(!directorio.exists()) 
        {
            System.out.println("El directorio no existe");
        }
        else
        {
            String[] listar = directorio.list();
            if(listar == null || listar.length == 0)
            {
                directorio.delete();
            }
            else
            {
                System.out.print("Existen directorios o ficheros en el directorio "+directorio+"\nEstas seguro que desea borrarlo? (s/n) ");
                Scanner sc = new Scanner(System.in);
                try {
                    char siNo = sc.next().charAt(0);
                    if(siNo == 's' || siNo == 'S') 
                    {
                        directorio.delete();
                    }
                    else if(siNo == 'n' || siNo == 'N')
                    {
                        System.out.println("Accion cancelada");
                    }
                    else
                    {
                        System.out.println("Opcion no valida");
                        System.out.println("Accion cancelada");
                    }
                } 
                catch (Exception ex) 
                {
                    ex.printStackTrace();
                }
                finally
                {
                    try
                    {
                        sc.close();
                    }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File directorio = new File("dir1");

        FicheroEjercicio7.borrarEstructura(directorio);
    }
}
