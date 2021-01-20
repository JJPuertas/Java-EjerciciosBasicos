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
    
    public boolean menorPor10(int num1, int num2, int num3){
        
        if((num1 - 10) == num2 || (num2 + 10) == num1){
            return true;
        }
        
        if((num2 - 10) == num3 || (num3 + 10) == num2){
            return true;
        }
        
         if((num1 - 10) == num3 || (num3 + 10) == num1 || (num3 - 10 == num1)){
            return true;
        }
         
         return false;
    }
    
    public boolean digitoRepetido(int num1, int num2){
        
        if(num1/10 == num2/10 || num1%10 == num2%10){
            return true; 
        }
        if(num1/10 == num2%10 || num1%10 == num2/10){
            return true; 
        }
        
        return false; 
        
    }
    
    public boolean multiplo5o3(int numero){
        
        if(numero % 3 == 0 && numero % 5 == 0){
            return false;
        }
        
        if(numero % 3 == 0 || numero % 5 == 0){
            return true;
        }
 
        return false;
   }
    
    public boolean menos20(int numero){
        if(numero % 20 == 18 || numero % 20 == 19){
            return true; 
        }
        
        return false; 
    }
    
    public int loteria(int a, int b, int c){
        
        if( a == 2 && b == 2 && c == 2 ){
            return 10;
        }
        if( a == b && b == c && a == c){
            return 5;
        }
        if(b == c && b != a && c != a){
            return 1; 
        }
        return 0;
    }
    
    public int withoutDoubles(int a, int b, boolean doble){
        
        if (a == b && doble){
            return (a + b + 1);
        }
        if (a == b && !doble){
            return (a + b);
        }
        
        return (a + b);
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
        
        System.out.println("EJERCICIO MENOR POR 10\n");
        System.out.println(ejercicio.menorPor10(1, 7, 11));
        System.out.println(ejercicio.menorPor10(1, 7, 10));
        System.out.println(ejercicio.menorPor10(11, 1, 7));
        System.out.println("\n");
        
        System.out.println("EJERCICIO DIGITO REPETIDO\n");
        System.out.println(ejercicio.digitoRepetido(12, 23));
        System.out.println(ejercicio.digitoRepetido(12, 43));
        System.out.println(ejercicio.digitoRepetido(12, 44));
        System.out.println("\n");
        
        System.out.println("EJERCICIO MULTIPLO DE 5 O DE 3\n");
        System.out.println(ejercicio.multiplo5o3(3));
        System.out.println(ejercicio.multiplo5o3(10));
        System.out.println(ejercicio.multiplo5o3(15));
        System.out.println("\n");
        
        System.out.println("MENOS 20\n");
        System.out.println(ejercicio.menos20(58));
        System.out.println(ejercicio.menos20(59));
        System.out.println(ejercicio.menos20(20));
        System.out.println("\n");
        
        System.out.println("LOTERIA\n");
        System.out.println(ejercicio.loteria(2, 2, 2));
        System.out.println(ejercicio.loteria(2, 2, 1));
        System.out.println(ejercicio.loteria(0, 0, 0));
        System.out.println("\n");
        
        System.out.println("LOTERIA\n");
        System.out.println(ejercicio.loteria(2, 2, 2));
        System.out.println(ejercicio.loteria(2, 2, 1));
        System.out.println(ejercicio.loteria(0, 0, 0));
        System.out.println("\n");
        
        System.out.println("WITHOUT DOUBLES\n");
        System.out.println(ejercicio.withoutDoubles(2, 3, true));
        System.out.println(ejercicio.withoutDoubles(3, 3, true));
        System.out.println(ejercicio.withoutDoubles(3, 3, false));
        System.out.println(ejercicio.withoutDoubles(6, 6, true));
        System.out.println("\n");
    }
    
}
