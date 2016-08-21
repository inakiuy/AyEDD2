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
    
    public Result BusquedaLineal(int srch) throws Exception{
        try {
            for (int i = 0; i < this.vector.length; i++){
                if (this.vector[i] == srch){
                System.out.println("Iteraciones:" + i);
                Result result = new Result(true, i);
                return result;
                }
            }
            System.out.println("Iteraciones:" + this.vector.length);
            return new Result(false, this.vector.length);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw  e;
        }        
    }
    
    public Result BusquedaBinaria(int srch) throws Exception{
        int i = 0;
        int j = this.vector.length - 1;
        int iteration = 0;
        
        if (this.vector == null){
            throw new Exception("Array nulo");
        }
        for (int k = 0; k < (this.vector.length - 1); k++){
            if (!(this.vector[k] < this.vector[k+1])){
                throw new Exception("Array desordenado");
            }
        }
        while ( (j - i) >= 0 ){
            iteration += 1;
            int range = j - i;
            int center = i + (range/2);
            if ( this.vector[center] == srch ){
                System.out.println("Iteraciones:" + iteration);
                return new Result(true, iteration);
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
        return new Result(false, iteration);
    }
}
