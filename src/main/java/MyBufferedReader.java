package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
    public static void main(String[] args) {
        File myFile = new File("prueba.txt");
        FileReader myFileReader = null;
        BufferedReader myBufferedReader = null;
        try {
            if(myFile.exists())
            {
                myFileReader = new FileReader(myFile);
                myBufferedReader = new BufferedReader(myFileReader);

                String cad = myBufferedReader.readLine();

                while(cad != null)
                {
                    System.out.println(cad);
                    cad = myBufferedReader.readLine();
                }
            }
            else
            {
                System.out.println("El fichero no existe");
            }
        } catch (IOException ioException) {
            System.err.println("Error de lectura del fichero");
        }
        finally
        {
            try {
                if(myFileReader != null)
                {
                    myBufferedReader.close();
                }
            } catch (IOException ioException2) {
                System.err.println(ioException2.getMessage());
            }
        }
    }
}
