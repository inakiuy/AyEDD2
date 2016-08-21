/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Inaki
 */
public class Vector {
    
    private final int[] vector;
    
    public Vector(int[] vector){
        this.vector = vector;
    }
    
    public boolean BusquedaLineal(int srch){
        try {
            for (int i = 0; i <= this.vector.length; i++){
                if (this.vector[i] == srch){
                System.out.println("Iteraciones:" + i);
                return true;
                }
            }
            return false;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw  e;
        }        
    }
    
    public boolean BusquedaBinaria(int srch){
        int i = 0;
        int j = this.vector.length - 1;
        int iteration = 0;
        while ( (j - i) >= 0 ){
            iteration += 1;
            int range = j - i;
            int center = i + (range/2);
            if ( this.vector[center] == srch ){
                System.out.println("Iteraciones:" + iteration);
                return true;
            }
            if ( this.vector[center] > srch ){
                j = center - 1;
                continue;
            }
            else {
                i = center + 1;
                continue;
            }           
        }
        System.out.println("Iteraciones:" + iteration);
        return false;
    }
}
