package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        String listaNum ="";
        int suma=0;
        
        System.out.println("Lista de números escritos en el archivo:");
        try {
            Path ruta = Paths.get("C:\\Users\\Juan\\Desktop\\programacion\\CURSO JAVA INICIAL UTN\\Clase4\\Clase4\\src\\clase4\\archivonum.txt");
            for (String lineas:Files.readAllLines(ruta)) {
                listaNum = lineas;
                System.out.println(lineas);
            }      
        } catch (IOException ex) {
            System.out.println("No se ha podido leer el archivo");
        }
       
        String vector[] = listaNum.split(" ");
        int []vectorNum = new int[vector.length];
        
        System.out.println("\nVector de números:");
        for (String num:vector) {
            System.out.println("["+num+"]");
        }
        //Parseo de String a Int, de a un valor por vez.
        for (int i = 0; i < vector.length; i++) {
            vectorNum[i]=Integer.parseInt(vector[i]);
            suma = suma + vectorNum[i];
        }
        
        System.out.println("\nLa suma total es: "+suma); 
    }
}
