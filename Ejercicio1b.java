package clase4;

import java.util.Scanner;

public class Ejercicio1b {
    public static void main(String[] args) {
       
       int numeros[] = new int[3];
       Scanner entrada = new Scanner(System.in);
       
       //Ingreso de datos por consola
       System.out.print("Ingrese primer valor del vector: ");
       numeros[0]= entrada.nextInt();
       System.out.print("Ingrese segundo valor del vector: ");
       numeros[1]=entrada.nextInt();
       System.out.print("Ingrese tercer valor del vector: ");
       numeros[2]=entrada.nextInt();
       
       int aux=0, bandera=0;    
       String ordenNum="";
       //"a" para "Ascendente", "d" para "Descendente"
       
       /*System.out.println("");
       System.out.println("Presione: \n a. Para ordenar Ascendentemente\n d. Para ordenar Descendentemente ");
       ordenNum = entrada.next();*/
       
           
        System.out.println("\nPresione: \n a. Para ordenar Ascendentemente\n d. Para ordenar Descendentemente ");
        ordenNum = entrada.next();
        
        if (ordenNum.equals("a")) {
            System.out.println("\n Vector Ordenado Ascendentemente");
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length-1; j++) {
                    if (numeros[j]>numeros[j+1]) {
                        aux = numeros[j];
                        numeros[j]=numeros[j+1];
                        numeros[j+1]=aux;
                    }
                }
            }
        }
        
        if (ordenNum.equals("d")) {
            System.out.println("\n Vector Ordenado Descendentemente");
            for (int i = 0; i <numeros.length; i++) {
                for (int j = 0; j < numeros.length-1; j++) {
                    if (numeros[j]<numeros[j+1]) {
                        aux = numeros[j];
                        numeros[j]=numeros[j+1];
                        numeros[j+1]=aux;
                    }
                }
            }
        }
        
        for (int numero:numeros) {
            System.out.println("["+numero+"]");
        }
    }
}
