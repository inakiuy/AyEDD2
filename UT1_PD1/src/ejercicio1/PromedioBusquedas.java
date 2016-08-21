/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ut2.ManejadorArchivosGenerico;

/**
 *
 * @author Inaki
 */
public class PromedioBusquedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] archivo = ManejadorArchivosGenerico.leerArchivo("./arrays.txt");
        Vector[] vectors = new Vector[archivo.length];
        
        //Obtener un array de Vectores desde un archivo de texto
        for (int i = 0; i < archivo.length; i++){
            String[] stringVector = archivo[i].split(",");
            int[] intVector = new int[stringVector.length];
            for (int j = 0; j < intVector.length; j++){
                intVector[j] = Integer.parseInt(stringVector[j]);
            }
            vectors[i] = new Vector(intVector);
        }
        
        //Correr metodo Busqueda lineal sobre los vectores y almacenar la cantidad de iteraciones
        int[] cantIteraciones = new int[vectors.length];
        for (int i = 0; i < vectors.length; i++){
            
        }
        
    }
    
}
