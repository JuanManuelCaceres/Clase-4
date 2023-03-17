package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2Clase3 {
    public static void main(String[] args) {
        String nombres;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres, separandolos por un espacio:");
        nombres = entrada.nextLine();
        
        String[] vectNombres = nombres.split(" ");
        
        System.out.println("");
        for(String nombre: vectNombres){
            System.out.println(nombre);
        }
        try {
            Files.write(Paths.get("C:\\Users\\Juan\\Desktop\\programacion\\CURSO JAVA INICIAL UTN\\Clase4\\Clase4\\src\\clase4\\archivoNombres.txt"),"Pablo Nicolás Ramiro".getBytes());
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio2Clase3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
}

