package main.java;

import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        try
        {
            //Abrir el fichero indicado en la variable nombreFichero
            fr = new FileReader("prueba.txt");

            //Leer el primer carácter
            //Se debe almacenar en la variable de tipo int
            int caract = fr.read();
            //Se recorre el fichero hasta encontrar el carácter -1
            //  que marca el final del fichero
            while(caract != -1)
            {
                //Mostrar en pantalla el carácter leído convertido a char
                System.out.println((char)caract);
                //Leer el siguiente carácter
                caract = fr.read();
            }
        }
        catch(Exception e)
        {
            System.err.println("Error de lectura del fichero");
        }
        finally
        {
            try {
                if(fr != null)
                {
                    //Cerrar el fichero
                    fr.close();
                }
            } catch (IOException io) {
                System.err.println(io.getMessage());
            }
        }
    }
}
