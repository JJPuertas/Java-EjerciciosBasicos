/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author jpb20
 */
public class EjerciciosBasicosJava {

    // FUNCIONES 
    
    public boolean fiestaArdillas(int numBellota, boolean finDeSemana){
        
        if(finDeSemana){
            return true;
        }
        
        // si llega aqui no es fin de semana
        
        if(numBellota >= 40 && numBellota <= 60){
            return true;
        }
        return false;
    }
    
    public int multa(int velocidad, boolean cumple){
        
        if (cumple){
            velocidad -= 5;
        }
        
        if(velocidad <= 60){
            return 0; 
        }
        
        if(velocidad > 60 && velocidad <= 80){
            return 1;
        }
        
        return 2; 
    }
    
    public boolean muyVanidoso(int numero){
        //Devuelve verdadero si el numero es multiplo de 11 o uno mas. 
        if(0 == numero%11 ){
            return true;
        }
        
        if(numero%11 == 1){
            return true;
        }
        
        return false;
    }
    
    public boolean contestar(boolean matinal, boolean madre, boolean dormido){
        // Si estoy dormido no contesto nunca, Si es por la mañana solo a mi madre 
        
        if(dormido){
            return false; 
        }
        
        if(matinal){
            return false;
        }
        
        if(matinal && madre){
            return true;
        }
        
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto propio de la clase. (Ejercicios basicos Java)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        
        
        System.out.println("EJERCICIO BELLOTA\n");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        System.out.println("\n");
        System.out.println("EJERCICIO MULTA\n");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        System.out.println("\n");
        System.out.println("EJERCICIO VANIDOSO\n");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        System.out.println("\n");
        System.out.println("EJERCICIO CONTESTAR\n");
        System.out.println(ejercicio.contestar(false, false, false));
        System.out.println(ejercicio.contestar(false, false, true));
        System.out.println(ejercicio.contestar(true, false, false));
        System.out.println("\n");
    }
    
}
