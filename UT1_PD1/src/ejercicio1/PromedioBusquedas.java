/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.LinkedList;
import java.util.ListIterator;
import ut2.ManejadorArchivosGenerico;

/**
 *
 * @author Inaki
 */
public class PromedioBusquedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String[] archivo = ManejadorArchivosGenerico.leerArchivo("arrays.txt");
        Vector[] vectors = new Vector[archivo.length];
        int srch = 101;
        
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
        LinkedList cantIteracionesSatisfactorias = new LinkedList();
        LinkedList cantIteracionesInsatisfactorias = new LinkedList();
        Result resultado;
        
        for (int i = 0; i < vectors.length; i++){
            try{
                resultado = vectors[i].BusquedaLineal(srch); //Modificar acá para que busque aleatorio en el rango
                if (resultado.isFindResult()) {
                    cantIteracionesSatisfactorias.add(resultado.getIterations());
                }
                else {
                    cantIteracionesInsatisfactorias.add(resultado.getIterations());
                }
            }
            catch (Exception e){
                    throw e;
            }            
        }
        
        //Promediar y emitir los resultados de la busqueda lineal
        //Satisfactorias
        int cantSatisfactorias = cantIteracionesSatisfactorias.size();
        int total = 0;
        ListIterator<Integer> listIterator;
                
        if (cantSatisfactorias != 0){
            listIterator = cantIteracionesSatisfactorias.listIterator();
            while (listIterator.hasNext()){
                total += listIterator.next();
            }        
            System.out.println("Promedio de iteraciones para busquedas LINEAL SATISFACORIAS [" + cantSatisfactorias + "] [" + total + "]: " + (float)(total/cantSatisfactorias));
        }
        else {
            System.out.println("Promedio de iteraciones para busquedas LINEAL SATISFACORIAS: Sin Datos");
        }

        //Promediar y emitir los resultados de la busqueda lineal
        //Insatisfactorias
        int cantInsatisfactorias = cantIteracionesInsatisfactorias.size();
        
        if (cantInsatisfactorias != 0){
            total = 0;
            listIterator = cantIteracionesInsatisfactorias.listIterator();
            while (listIterator.hasNext()){
                total += listIterator.next();
            }
            System.out.println("Promedio de iteraciones para busquedas LINEAL INSATISFACORIAS [" + cantInsatisfactorias + "] [" + total + "]: " + (float)(total/cantInsatisfactorias));
        }
        else {
            System.out.println("Promedio de iteraciones para busquedas LINEAL INSATISFACORIAS: Sin Datos");
        }
        
        //Correr metodo Busqueda binaria sobre los vectores y almacenar la cantidad de iteraciones
        cantIteracionesSatisfactorias.clear();
        cantIteracionesInsatisfactorias.clear();
        
        for (int i = 0; i < vectors.length; i++){
            try{
                resultado = vectors[i].BusquedaBinaria(srch); //Modificar acá para que busque aleatorio en el rango
                if (resultado.isFindResult()) {
                    cantIteracionesSatisfactorias.add(resultado.getIterations());
                }
                else {
                    cantIteracionesInsatisfactorias.add(resultado.getIterations());
                }
            }
            catch (Exception e){
                    throw e;
            }            
        }
        
        //Promediar y emitir los resultados de la busqueda lineal
        //Satisfactorias
        cantSatisfactorias = cantIteracionesSatisfactorias.size();
        total = 0;
                
        if (cantSatisfactorias != 0){
            listIterator = cantIteracionesSatisfactorias.listIterator();
            while (listIterator.hasNext()){
                total += listIterator.next();
            }        
            System.out.println("Promedio de iteraciones para busquedas BINARIO SATISFACORIAS [" + cantSatisfactorias + "] [" + total + "]: " + (float)(total/cantSatisfactorias));
        }
        else {
            System.out.println("Promedio de iteraciones para busquedas BINARIO SATISFACORIAS: Sin Datos");
        }

        //Promediar y emitir los resultados de la busqueda lineal
        //Insatisfactorias
        cantInsatisfactorias = cantIteracionesInsatisfactorias.size();
        
        if (cantInsatisfactorias != 0){
            total = 0;
            listIterator = cantIteracionesInsatisfactorias.listIterator();
            while (listIterator.hasNext()){
                total += listIterator.next();
            }
            System.out.println("Promedio de iteraciones para busquedas BINARIO INSATISFACORIAS [" + cantInsatisfactorias + "] [" + total + "]: " + (float)(total/cantInsatisfactorias));
        }
        else {
            System.out.println("Promedio de iteraciones para busquedas BINARIO INSATISFACORIAS: Sin Datos");
        }
    }
}
