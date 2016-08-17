/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

/**
 *
 * @author Inaki
 */
public class BusquedaBinaria {
    public static boolean busquedaBinaria (int[] conjunto, int srch, int i, int f){
        
        //Casos base
        ////////////////////////////////////////////
        //Array = nulo
        if (conjunto == null){
            return false;
        }
        //Array = []
        if ((f - i) == -1){
            return false;
        }
        //Array = [1elem]
        if ((f - i) == 0){
            return (conjunto[i] == srch);
        }
        //Array = [a, b, c, d, e...]
        int central = ((f - i) / 2) + i;
        
        //El buscado es el central
        if (conjunto[central] == srch){
            return true;
        }

        //Recursividad
        ////////////////////////////////////////////
        //El buscado es menor al central
        if (conjunto[central] > srch){
            f = central - 1;
            return busquedaBinaria(conjunto, srch, i, f);
        // El buscado es mayor al central
        } else {
            i = central + 1;
            return busquedaBinaria(conjunto, srch, i, f);
        }
}
