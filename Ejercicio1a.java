package clase4;

public class Ejercicio1a {
    
    public static void main(String[] args) {
       
       int numeros[] = new int[3];
       numeros[0]=1;
       numeros[1]=13;
       numeros[2]=7;
       int aux=0;
       String ordenNum = "d";
       //"a" para "Ascendente", "d" para "Descendente"
       
         
        if (ordenNum.equals("a")) {
            System.out.println("Vector Ordenado Ascendentemente");
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
            System.out.println("Vector Ordenado Descendentemente");
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